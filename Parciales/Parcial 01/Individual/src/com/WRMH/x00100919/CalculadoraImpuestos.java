package com.WRMH.x00100919;

public final class CalculadoraImpuestos {
    private static double totalRenta = 0, totalISSS = 0, totalAFP = 0;

    private CalculadoraImpuestos() {

    }

    public static double calcularPago(Empleado e){
        if(e instanceof ServicioProfesional){
            totalRenta += e.getSalario() * 0.1;
            return e.getSalario() - (e.getSalario() * 0.1);
        }
        else{
            double afp = 0, isss = 0, renta = 0, rest = 0;
            afp = e.getSalario() * 0.0625;
            isss = e.getSalario() * 0.03;
            rest = e.getSalario() - afp - isss;

            if(rest > 472 && rest <= 895.24){
                renta = 0.1 * (rest - 472) + 17.67;
            }
            else if(rest > 895.24 && rest < 2038.1){
                renta = 0.2 * (rest - 895.24) + 60;
            }
            else{
                renta = 0.3 * (rest - 2038.1) + 288.57;
            }

            totalRenta += renta;
            totalAFP += afp;
            totalISSS += isss;

            return rest - renta;
        }
    }

    public static String mostrarTotales(){
        return "Renta: " + totalRenta + ", ISSS: " + totalISSS + ", AFP: " + totalAFP;
    }
}
