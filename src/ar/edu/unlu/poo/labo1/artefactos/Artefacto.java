package ar.edu.unlu.poo.labo1.artefactos;

import java.util.HashSet;
import java.util.Objects;

public class Artefacto {
    private String nombre;
    private int poder;
    private String tipo;

    public Artefacto(String nombre,int poder,String tipo){
        setNombre(nombre);
        setPoder(poder);
        setTipo(tipo);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoder() {
        return poder;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Artefacto artefacto = (Artefacto) o;

        return Objects.equals(nombre, artefacto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
