package com.WRMH.x00019618;

public class Pasante extends Persona{
    private String universidad;
    private int tiempoPasantia, calificacion;

    public Pasante(int edad, String nombre, String apellido, String DUI, char genero, String universidad,
                   int tiempoPasantia, int calificacion) {
        super(edad, nombre, apellido, DUI, genero);
        this.universidad = universidad;
        this.tiempoPasantia = tiempoPasantia;
        this.calificacion = calificacion;
    }

    public Pasante(int edad, String nombre, String apellido, String DUI, String NIT, char genero,
                   String universidad, int tiempoPasantia, int calificacion) {
        super(edad, nombre, apellido, DUI, NIT, genero);
        this.universidad = universidad;
        this.tiempoPasantia = tiempoPasantia;
        this.calificacion = calificacion;
    }

    public boolean terminarPasantia(){
        if(calificacion > 7)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Pasante{" +
                "universidad='" + universidad + '\'' +
                ", tiempoPasantia=" + tiempoPasantia +
                ", calificacion=" + calificacion +
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
