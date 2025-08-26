
package ar.edu.unlu.poo.labo1.artefactos;
import ar.edu.unlu.poo.labo1.libreria.Libro;

import java.awt.geom.Area;
import java.util.Objects;

public class Artefacto {
    private String nombre;
    private Integer poder;
    private String tipo;


    public Artefacto(String nombre, Integer poder, String tipo){
        this.nombre = nombre;
        if(poder >= 0 && poder <= 100){
            this.poder = poder;
        }
        this.tipo = tipo;
    }


    public String getNombre(){
        return this.nombre;
    }
    public Integer getPoder(){
        return this.poder;
    }
    public String getTipo(){
        return this.tipo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artefacto artefacto = (Artefacto) o;
        return Objects.equals(nombre, artefacto.nombre);
    }

    @Override
    public int hashCode() {
        // 4. Generamos un hash code a partir de los mismos campos
        return Objects.hash(nombre);
    }

}

