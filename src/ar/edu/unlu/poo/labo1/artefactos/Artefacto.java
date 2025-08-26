package ar.edu.unlu.poo.labo1.artefactos;

import java.util.Objects;

public class Artefacto {

    private String nombre;
    private Integer poder;
    private String tipo;

    public Artefacto(){
        this.nombre = nombre;
        this.poder = poder;
        this.tipo = tipo;

        Artefacto art = new Artefacto();

    }

    public boolean equals (Object art){
        if (art == this) return true;
        if (art == null || getClass() != art.getClass()) return false;
        Artefacto that = (Artefacto) art;
        return Objects.equals(nombre,that.nombre);

    }

    public int hashCode(){
        return Objects.hash(nombre);
    }


    public String getNombre() {
        return nombre;
    }

    public Integer getPoder() {
        return poder;
    }

    public String getTipo() {
        return tipo;
    }

}
