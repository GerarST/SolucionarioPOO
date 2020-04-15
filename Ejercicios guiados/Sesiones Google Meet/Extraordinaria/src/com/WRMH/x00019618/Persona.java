package com.WRMH.x00019618;

public abstract class Persona {
    protected int ID, edad;
    protected String nombre, apellido, DUI, NIT;
    protected char genero;

    public Persona(int edad, String nombre, String apellido, String DUI, char genero) {
        this.ID = GeneradorID.nuevoID();
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DUI = DUI;
        this.genero = genero;
    }

    public Persona(int edad, String nombre, String apellido, String DUI, String NIT, char genero) {
        this.ID = GeneradorID.nuevoID();
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DUI = DUI;
        this.NIT = NIT;
        this.genero = genero;
    }

    public int getID() {
        return ID;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDUI() {
        return DUI;
    }

    public String getNIT() {
        return NIT;
    }

    public char getGenero() {
        return genero;
    }
}
