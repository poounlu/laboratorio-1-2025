package ar.edu.unlu.poo.labo1.artefactos;

import java.util.Objects;

public class Artefacto {
    private String nombre;
    private Integer poder;
    private String tipo;

public Artefacto(String nombre,int poder,String tipo) {
    this.nombre = nombre;
    this.poder = poder;
    this.tipo = tipo;
}


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPoder() {
        return poder;
    }

    public void setPoder(Integer poder) {
        this.poder = poder;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artefacto art1 = (Artefacto) o;
        return Objects.equals(nombre, art1.nombre);
    }
    @Override
    public int hashCode(){
    return Objects.hash(nombre);
    }

}
