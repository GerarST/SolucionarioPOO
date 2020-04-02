package com.WRMH.x00019618;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Persona> emp = new ArrayList<>();
        byte op = 0;

        String menu = "1. Agregar persona\n" +
                "2. Mostrar personas\n" +
                "3. Buscar por ID\n" +
                "4. Aumentar salario\n" +
                "5. Disminuir salario\n" +
                "6. Jubilar empleado\n" +
                "7. Contratar pasante\n" +
                "8. Salir";

        do{
            op = Byte.parseByte(JOptionPane.showInputDialog(null, menu));

            switch (op){
                case 1:
                    String tipo = JOptionPane.showInputDialog(null,
                            "Digite tipo de persona a agregar: ");

                    String nombre = JOptionPane.showInputDialog(null, "Nombre: ");
                    String apellido = JOptionPane.showInputDialog(null, "Apellido: ");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad: "));
                    char genero = JOptionPane.showInputDialog(null, "Genero: ").charAt(0);
                    String DUI = JOptionPane.showInputDialog(null, "DUI: ");
                    String NIT = JOptionPane.showInputDialog(null, "NIT: ");

                    if(tipo.equalsIgnoreCase("Pasante")){
                        String universidad = JOptionPane.showInputDialog(null, "Universidad: ");
                        int tiempoPasantia = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Tiepo pasantia: "));
                        int calificacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Calificacion: "));

                        emp.add(new Pasante(edad, nombre, apellido, DUI, NIT, genero, universidad,
                                tiempoPasantia, calificacion));
                    }
                    else{
                        String puesto = JOptionPane.showInputDialog(null, "Puesto: ");
                        int tiempoLaborado = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Tiempo laborado: "));
                        double salario = Double.parseDouble(JOptionPane.showInputDialog(null,
                                "Salario: "));

                        emp.add(new Empleado(edad, nombre, apellido, DUI, NIT, genero, tiempoLaborado,
                                puesto, salario));
                    }
                    break;
                case 2:
                    String messPasante = "", messEmpleado = "";

                    for(Persona p : emp){
                        if(p instanceof Empleado)
                            messEmpleado += p.toString() + "\n";
                        else if(p instanceof Pasante)
                            messPasante += p.toString() + "\n";
                    }

                    JOptionPane.showMessageDialog(null, messEmpleado);
                    JOptionPane.showMessageDialog(null, messPasante);
                    break;
                case 3:
                    int idBuscar = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite ID a buscar: "));

                    emp.forEach(obj -> {
                        if(obj.getID() == idBuscar){
                            if(obj instanceof Empleado)
                                JOptionPane.showMessageDialog(null, obj.toString());
                            else
                                JOptionPane.showMessageDialog(null, obj.toString());
                        }
                    });
                    break;
                case 4:
                    int idBuscar2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite ID a buscar: "));

                    emp.forEach(obj -> {
                        if(obj.getID() == idBuscar2){
                            if(obj instanceof Empleado)
                                ((Empleado) obj).aumentarSalario(Double.parseDouble(
                                        JOptionPane.showInputDialog(null,
                                        "Cantidad a aumentar: ")));
                        }
                    });
                    break;
                case 5:
                    int idBuscar3 = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite ID a buscar: "));

                    emp.forEach(obj -> {
                        if(obj.getID() == idBuscar3){
                            if(obj instanceof Empleado)
                                ((Empleado) obj).disminuirSalario(Double.parseDouble(
                                        JOptionPane.showInputDialog(null,
                                        "Cantidad a disminuir: ")));
                        }
                    });
                    break;
                case 6:
                    int idBuscar4 = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite ID a buscar: "));

                    emp.removeIf(obj -> {
                       if(obj.getID() == idBuscar4){
                           if(obj instanceof Empleado)
                               return ((Empleado) obj).jubilar();
                           else
                               return false;
                       }
                       else{
                           return false;
                       }
                    });
                    break;
                case 7:
                    int idBuscar5 = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite ID a buscar: "));

                    int tam = emp.size();

                    Persona aux = null;

                    for(int i = 0; i < tam; i++){
                        if(emp.get(i).getID() == idBuscar5){
                            if(emp.get(i) instanceof Pasante){
                                if(((Pasante) emp.get(i)).terminarPasantia()){
                                    aux = emp.get(i);
                                }
                            }
                        }
                    }
                    emp.remove(aux);
                    emp.add(new Empleado(aux.getEdad(), aux.getNombre(), aux.getApellido(), aux.getDUI(), aux.getNIT(),
                            aux.getGenero(), 0, "Asistente", 400));
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Saliendo . . .");
                    break;
            }
        } while(op != 8);
    }

    /*
    static Persona anadir(String tipo){
        String nombre = JOptionPane.showInputDialog(null, "Nombre: ");
        String apellido = JOptionPane.showInputDialog(null, "Apellido: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad: "));
        char genero = JOptionPane.showInputDialog(null, "Genero: ").charAt(0);
        String DUI = JOptionPane.showInputDialog(null, "DUI: ");
        String NIT = JOptionPane.showInputDialog(null, "NIT: ");

        if(tipo.equalsIgnoreCase("Pasante")){
            String universidad = JOptionPane.showInputDialog(null, "Universidad: ");
            int tiempoPasantia = Integer.parseInt(JOptionPane.showInputDialog(null, "Tiepo pasantia: "));
            int calificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Calificacion: "));

            return new Pasante(edad, nombre, apellido, DUI, NIT, genero, universidad, tiempoPasantia, calificacion);
        }
        else{
            String puesto = JOptionPane.showInputDialog(null, "Universidad: ");
            int tiempoLaborado = Integer.parseInt(JOptionPane.showInputDialog(null, "Tiepo pasantia: "));
            double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Calificacion: "));

            return new Empleado(edad, nombre, apellido, DUI, NIT, genero, tiempoLaborado, puesto, salario);
        }
    }

     */
}
