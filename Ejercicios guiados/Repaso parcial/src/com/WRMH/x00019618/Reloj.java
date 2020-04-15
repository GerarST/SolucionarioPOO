package com.WRMH.x00019618;

import java.util.Date;

// TODO: Clase estatica
public final class Reloj {
    private static Date r = new Date();

    private Reloj(){}

    public static String getTime(){
        return r.toString();
    }
}
