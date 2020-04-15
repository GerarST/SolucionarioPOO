package com.WRMH.x00019618;

public final class IDGenerator{
    private static int id = 0;

    private IDGenerator(){}

    public static int newID(){return ++id;}
}