package com.WRMH.x00019618;

import javax.swing.*;

public class Empleado extends Persona{
    private int tiempoLaborado;
    private String puesto;
    private double salario;

    public Empleado(int edad, String nombre, String apellido, String DUI, char genero, int tiempoLaborado,
                    String puesto, double salario) {
        super(edad, nombre, apellido, DUI, genero);
        this.tiempoLaborado = tiempoLaborado;
        this.puesto = puesto;
        this.salario = salario;
    }

    public Empleado(int edad, String nombre, String apellido, String DUI, String NIT, char genero, int tiempoLaborado,
                    String puesto, double salario) {
        super(edad, nombre, apellido, DUI, NIT, genero);
        this.tiempoLaborado = tiempoLaborado;
        this.puesto = puesto;
        this.salario = salario;
    }

    public void aumentarSalario(double aumento){
        salario += aumento;
        JOptionPane.showMessageDialog(null, "Se ha aumentado el salario, nuevo salario: $" + salario);
    }

    public void disminuirSalario(double disminuir){
        if(salario - disminuir < 400)
            JOptionPane.showMessageDialog(null, "No se puede disminuir el salario");
        else{
            salario -= disminuir;
            JOptionPane.showMessageDialog(null, "Se ha disminuido el salario, nuevo salario: $" + salario);
        }
    }

    public boolean jubilar(){
        if(genero == 'f'){
            if(tiempoLaborado >= 25 && edad >= 55)
                return true;
            else
                return false;
        }
        else{
            if(tiempoLaborado >= 25 && edad >= 60)
                return true;
            else
                return false;
        }
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "tiempoLaborado=" + tiempoLaborado +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                ", ID=" + ID +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", DUI='" + DUI + '\'' +
                ", NIT='" + NIT + '\'' +
                ", genero=" + genero +
                '}';
    }


}
