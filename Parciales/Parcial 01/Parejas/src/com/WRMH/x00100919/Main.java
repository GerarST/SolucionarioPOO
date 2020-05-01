package com.WRMH.x00100919;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String menu = "1. Agregar empleado\n" +
                "2. Despedir empleado\n" +
                "3. Ver lista de empleados\n" +
                "4. Calcular sueldo\n" +
                "5. Mostrar totales\n" +
                "0. Salir";

        Empresa emp = new Empresa("JetBrains");
        byte op = 0;

        String nombre = "";

        do{
            try{
                op = Byte.parseByte(JOptionPane.showInputDialog(null, menu));
            } catch(Exception ex){
                System.out.println("Algo anda mal . . ."); op = 111;
            }

            switch(op){
                case 1:
                    try{
                        String tipo = JOptionPane.showInputDialog(null,
                                "Plaza fija o Servicio Profesional: ");

                        nombre = JOptionPane.showInputDialog(null,
                                "Nombre: ");
                        String puesto = JOptionPane.showInputDialog(null,
                                "Puesto: ");
                        double salario = Double.parseDouble(
                                JOptionPane.showInputDialog(null,
                                        "Salario: ")
                        );

                        try{
                            String doc = JOptionPane.showInputDialog(null,
                                    "Documento: ");
                            String numDoc = JOptionPane.showInputDialog(null,
                                    "Numero: ");

                            if(tipo.equalsIgnoreCase("Plaza fija")){
                                int extension = Integer.parseInt(
                                        JOptionPane.showInputDialog(null,
                                                "Extension: ")
                                );

                                emp.addEmpleado(new PlazaFija(nombre, puesto, salario, extension));
                                emp.getPlanilla().get(emp.getPlanilla().size() - 1).addDocumentos(
                                        new Documento(doc, numDoc)
                                );
                            }
                            else{
                                int mesesContrato = Integer.parseInt(
                                        JOptionPane.showInputDialog(null,
                                                "Meses de contrato: ")
                                );

                                emp.addEmpleado(new ServicioProfesional(nombre, puesto, salario, mesesContrato));
                                emp.getPlanilla().get(emp.getPlanilla().size() - 1).addDocumentos(
                                        new Documento(doc, numDoc)
                                );
                            }
                        }
                        catch(RepeatedDataException ex){
                            emp.getPlanilla().remove(emp.getPlanilla().size() - 1);
                            JOptionPane.showMessageDialog(null, ex.getMessage());
                        }
                    }
                    catch (Exception ex){
                        JOptionPane.showMessageDialog(null, "Algo anda mal . . .");
                    }
                    break;
                case 2:
                    nombre = JOptionPane.showInputDialog(null, "Nombre de empleado a despedir: ");

                    emp.quitEmpleado(nombre);
                    break;
                case 3:
                    String mess = "";
                    for(Empleado e : emp.getPlanilla()){
                        mess += e.toString();
                    }

                    JOptionPane.showMessageDialog(null, mess);
                    break;
                case 4:
                    nombre = JOptionPane.showInputDialog(null, "Nombre de empleado: ");

                    for(Empleado e : emp.getPlanilla())
                        if(e.getNombre().equalsIgnoreCase(nombre))
                            JOptionPane.showMessageDialog(null,
                                    "Sueldo con descuentos: " + CalculadoraImpuestos.calcularPago(e));

                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, CalculadoraImpuestos.mostrarTotales());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo: ");
            }
        } while(op != 0);
    }
}
