package ar.edu.unlu.poo.labo1.artefactos;

import java.util.Objects;

public class Artefacto {
    private String nombre;
    private int nivelPoder;
    private String tipo;

    public Artefacto(String unNombre, int unNivel, String unTipo){
        this.nombre = unNombre;
        this.nivelPoder = unNivel;
        this.tipo = unTipo;
    }

    //Metodo-----------------------------------------------------------------
    public boolean equals(Object o){
        if(this == o){
            System.out.println("Es igual");
            return true;
        }
        if(o == null || getClass() != o.getClass()) return false;
        Artefacto artefacto = (Artefacto) o;
        return Objects.equals(nombre, artefacto.nombre);
    }

    public int hashCode(){
        return Objects.hash(nombre);
    }

    public String getNombre(){
        return nombre;
    }

    public int getPoder(){
        return nivelPoder;
    }

    public String getTipo(){
        return tipo;
    }
 }
