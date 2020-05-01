package com.WRMH.x00100919;

public class Main {

    public static void main(String[] args) {
        try{
            ServicioProfesional sp = new ServicioProfesional("Walter", "Instrutor", 150, 6);
            PlazaFija pf = new PlazaFija("Rafael", "Instructor", 500, 452);

            System.out.println("Pago SP: " + CalculadoraImpuestos.calcularPago(sp));
            System.out.println("Pago PF: " + CalculadoraImpuestos.calcularPago(pf));

            System.out.println("Totales");
            System.out.println(CalculadoraImpuestos.mostrarTotales());
        }
        catch(Exception ex){
            System.out.println("Algo salio mal . . .");
        }
    }
}
