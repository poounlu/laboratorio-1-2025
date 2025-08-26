package ar.edu.unlu.poo.labo1.artefactos;

import java.util.Objects;

public class Artefacto {
    private String nombre;
    private int poder;
    private String tipo;

    public Artefacto(String nombre, int poder, String tipo) {
        this.nombre = nombre;
        this.poder = poder;
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object obj) {
        return this.nombre.equals(((Artefacto) obj).getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public int compare(Object obj1, Object obj2) {
        int a1 = ((Artefacto) obj1).getPoder();
        int a2 = ((Artefacto) obj2).getPoder();

        return Integer.compare(a1, a2);
    }
}
