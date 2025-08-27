package ar.edu.unlu.poo.labo1.artefactos;
import java.util.*;

public class Artefacto implements Comparable {
    private String nombre;
    private int poder;
    private String tipo;


    public Artefacto(String nombre, int poder, String tipo) {
        this.nombre = nombre;
        this.poder = poder;
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
        // Son mismo obj en memoria?
        if (this == o) return true;
        //Es nulo o clase diff?
        if(o == null || getClass() != o.getClass()) return false;
        // Convierto el obj a artefacto y comparo nombre
        Artefacto artefacto = (Artefacto) o;
        return Objects.equals(nombre, artefacto.nombre);
    }

    public int hashcode(){
            //generado hashcode solo desde nombre
            return Objects.hash(nombre);
    }

    @Override
    public int compareTo(Object o) {
        return this.poder - ((Artefacto)o).poder;
    }
}

