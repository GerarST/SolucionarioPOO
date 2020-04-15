package com.WRMH.x00019618;

import java.util.ArrayList;

// TODO: herencia
public class Moderador extends Usuario {
    public Moderador(String email, String usuario, String contrasena) {
        super(email, usuario, contrasena);
    }

    public void modificarPost(ArrayList<Post> postsCreados, String tema) {
        super.modificarPost(postsCreados, tema);
    }

    public void modificarPost(ArrayList<Post> postsCreados, String tema, String contenido, int a) {
        super.modificarPost(postsCreados, tema, contenido);
    }

    public void eliminarPost(ArrayList<Post> postsCreados, String tema) {
        super.eliminarPost(postsCreados, tema);
    }
}
