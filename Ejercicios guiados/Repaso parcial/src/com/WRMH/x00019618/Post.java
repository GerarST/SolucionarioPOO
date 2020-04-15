package com.WRMH.x00019618;

import java.util.ArrayList;

// TODO: Creacion de clase
public class Post {
    private String creador, fechaCreacion, tema, contenido;
    private ArrayList<String> modificaciones;

    public Post(String creador, String fechaCreacion, String tema, String contenido) {
        this.creador = creador;
        this.fechaCreacion = fechaCreacion;
        this.tema = tema;
        this.contenido = contenido;
    }

    public String getCreador() {
        return creador;
    }

    public String getTema() {
        return tema;
    }

    // Modificar solo el tema del post
    public void actualizarPost(String tema){
        this.tema = tema;
        modificaciones.add(Reloj.getTime());
    }

    // Modificar tema y contenido del post
    public void actualizarPost(String tema, String contenido){
        this.tema = tema;
        this.contenido = contenido;
        modificaciones.add(Reloj.getTime());
    }
}
