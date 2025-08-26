package ar.edu.unlu.poo.labo1.artefactos;

import java.util.Objects;

public class Artefacto {
    private String nombre;
    private int nivelPoder;
    private String tipo;

    public Artefacto(String nombre, int nivelPoder, String tipo){
        this.nombre = nombre;
        this.nivelPoder = nivelPoder;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null|| getClass() != o.getClass())return false;
        Artefacto artefacto = (Artefacto) o;
        return Objects.equals(nombre,artefacto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
