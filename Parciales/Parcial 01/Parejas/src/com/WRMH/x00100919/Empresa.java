package com.WRMH.x00100919;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> planilla;

    public Empresa(String nombre) {
        this.nombre = nombre;
        planilla = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Empleado> getPlanilla() {
        return planilla;
    }

    public void addEmpleado(Empleado e) throws RepeatedDataException {
        if(planilla.contains(e))
            throw new RepeatedDataException("Ya se ha contratado previamente a dicho empleado");

        planilla.add(e);
    }

    public void quitEmpleado(String nombre){
        planilla.removeIf(obj -> obj.getNombre().equalsIgnoreCase(nombre));
    }
}
