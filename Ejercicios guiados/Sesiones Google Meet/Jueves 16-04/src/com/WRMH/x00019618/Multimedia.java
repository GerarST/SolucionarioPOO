package com.WRMH.x00019618;

public abstract class Multimedia {
    protected String formato, nombreArchivo;

    public Multimedia(String formato, String nombreArchivo) {
        this.formato = formato;
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "formato='" + formato + '\'' +
                ", nombreArchivo='" + nombreArchivo + '\'' +
                '}';
    }
}
