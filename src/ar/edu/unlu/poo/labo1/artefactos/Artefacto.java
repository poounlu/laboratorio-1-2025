package ar.edu.unlu.poo.labo1.artefactos;

import ar.edu.unlu.poo.labo1.libreria.Libro;

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

    public String getNombre() {
        return nombre;
    }

    public int getPoder() {
        return poder;
    }

    public String getTipo() {
        return tipo;
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

    public boolean equals(Object artefacto) {
        // 1. ¿Somos el mismo objeto en memoria?
        if (this == artefacto) return true;
        // 2. ¿Es nulo o de una clase diferente?
        if (nombre == null || getClass() != artefacto.getClass()) return false;
        // 3. Convertimos el objeto y comparamos los campos clave
        Artefacto artefacto1 = (Artefacto) artefacto;
        return Objects.equals(nombre,artefacto1.getNombre());
    }

    @Override
    public int hashCode() {
        // 4. Generamos un hash code a partir de los mismos campos
        return Objects.hash(nombre);
    }
}
