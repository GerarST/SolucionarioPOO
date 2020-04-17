package com.WRMH.x00019618;

public final class GeneradorID {
    private static int idComentario = 0, idPost = 0;

    private GeneradorID(){}

    public static int idComentario(){ return ++idComentario; }

    public static int idPost(){ return ++idPost; }
}
