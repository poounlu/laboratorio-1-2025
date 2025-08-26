package ar.edu.unlu.poo.labo1.artefactos;

//Clase `Artefacto`:
//   - Atributos: nombre (String), poder (int), tipo (¿String?).
//   - Constructor para inicializar todos los atributos.
//   - Métodos getters para todos sus atributos.
//   - Implementación correcta de `equals()` y `hashCode()`: dos artefactos se consideran iguales si tienen el mismo nombre.

import java.util.ArrayList;
import java.util.Objects;

public class Artefacto {
    private String nombre;
    private int poder;
    private String tipo ;

    public Artefacto(String nombre, int poder,String tipo) {
        this.nombre = nombre;
        this.poder = poder;
        this.tipo = tipo;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Artefacto artefacto = (Artefacto) o;
        return Objects.equals(nombre, artefacto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
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
}
