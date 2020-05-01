package com.WRMH.x00100919;

import java.util.ArrayList;

public abstract class Empleado {

    protected String nombre, puesto;
    ArrayList<Documento> documentos;
    protected double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        documentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public ArrayList<Documento> getDocumentos() {
        return documentos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void addDocumentos(Documento d) throws RepeatedDataException {
        for(Documento buscar: documentos){
            if(d.getNombre().equalsIgnoreCase(buscar.getNumero()))
                throw new RepeatedDataException("Ya existe un documento con dicho numero");
        }
        documentos.add(d);
    }

    public void removeDocumento(String numero){
        documentos.removeIf(obj -> obj.getNumero().equalsIgnoreCase(numero));
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }
}
