package ar.edu.unlu.poo.labo1.artefactos;

import java.util.Objects;

public class Artefacto {
    private String nombre;
    private int poder;
    private String tipo;

    public Artefacto(String nombre,int poder,String tipo){
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

    public boolean equals(String nombre2){
        if(this.nombre.equals(nombre2)) return true;
        else{
            return false;
        }
    }

    public int hashCode(){
        return Objects.hash(this.nombre);
    }
}
