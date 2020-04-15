package com.WRMH.x00019618;

public final class GeneradorID {
    private static int contador = 0;

    private GeneradorID(){}

    public static int nuevoID(){return ++contador;}
}