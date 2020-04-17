package com.WRMH.x00019618;

import java.util.ArrayList;

public class Post {
    private int idPost;
    private String descripcion;
    private ArrayList<Multimedia> subida;
    private ArrayList<Comentario> comentarios;

    public Post(String descripcion) {
        idPost = GeneradorID.idPost();
        this.descripcion = descripcion;
        subida = new ArrayList<>();
        comentarios = new ArrayList<>();
    }

    public int getIdPost() {
        return idPost;
    }

    public void subirMultimedia(Multimedia m){
        subida.add(m);
    }

    public void comentarPost(Comentario c){
        comentarios.add(c);
    }

    public void comentarPost(int id, Comentario hijo) throws SubCommentException, NotExistingCommentException {
        Comentario padre = null;

        for(Comentario c: comentarios){
            if(c.getId() == id)
                padre = c;
        }

        if(padre == null)
            throw new NotExistingCommentException("No existe ese comentario");

        if(!padre.isEsPrincipal())
            throw new SubCommentException("No se puede comentar una respuesta");

        padre.anadirRespuesta(hijo.getId());
        comentarios.add(hijo);
    }

    private String verMultimedia(){
        String mess = "";

        for(Multimedia m : subida){
            mess += m.toString() + "\n";
        }

        return mess;
    }

    private String verComentario(){
        String mess = "";

        for(Comentario padre : comentarios){
            if(padre.isEsPrincipal()){
                mess += "Principal " + padre.toString() + '\n';

                ArrayList<Integer> idHijos = padre.getIdRespuestas();

                if(idHijos.size() != 0){
                    mess += "\t " + comentariosHijos(idHijos)+ '\n';
                }
            }
        }

        return mess;
    }

    private String comentariosHijos(ArrayList<Integer> idHijos){
        String mess = "";

        for(Comentario hijo : comentarios){
            if(idHijos.contains(hijo.getId()))
                mess += "Respuesta " + hijo.toString() + "\n\t";
        }

        return mess;
    }

    @Override
    public String toString() {
        return "Post{\n" +
                "idPost: " + idPost + '\n' +
                "descripcion: '" + descripcion + '\n' +
                "subida: " + verMultimedia() + "\n" +
                "comentarios: " + verComentario() +
                '}';
    }
}
