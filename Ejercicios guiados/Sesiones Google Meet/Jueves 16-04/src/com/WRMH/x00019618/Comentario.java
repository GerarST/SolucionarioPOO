package com.WRMH.x00019618;

import java.util.ArrayList;

public class Comentario {
    private int id;
    private boolean esPrincipal;
    private String contenido;
    private ArrayList<Integer> idRespuestas;

    public Comentario(boolean esPrincipal, String contenido) {
        id = GeneradorID.idComentario();
        this.esPrincipal = esPrincipal;
        this.contenido = contenido;
        idRespuestas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public boolean isEsPrincipal() {
        return esPrincipal;
    }

    public String getContenido() {
        return contenido;
    }

    public ArrayList<Integer> getIdRespuestas() {
        return idRespuestas;
    }

    public void anadirRespuesta(int id){
        idRespuestas.add(id);
    }

    @Override
    public String toString() {
        return " comentario: " + contenido;
    }
}
