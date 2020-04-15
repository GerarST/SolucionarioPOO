package com.WRMH.x00019618;

import java.util.ArrayList;

// TODO: Creacion de clase
public class Usuario {
    protected String email, usuario, contrasena;

    public Usuario(String email, String usuario, String contrasena) {
        this.email = email;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    // Metodo de verificacion de contrasena para modificacion de post
    private boolean verificarContrasena(String contrasena){
        return this.contrasena.equals(contrasena);
    }

}
