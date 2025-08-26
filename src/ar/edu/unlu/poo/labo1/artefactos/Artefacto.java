package ar.edu.unlu.poo.labo1.artefactos;

import java.util.ArrayList;
import java.util.Objects;

public class Artefacto {
    private String nombre;
    private int poder;
    private String tipo;
    //private ArrayList<Artefacto> tipoArtefacto = new ArrayList<>();

    public Artefacto(String nombre, int poder, String tipo){
        this.nombre = nombre;
        setPoder(poder);
        this.tipo = tipo;   // no me gusta
        //agregar un arrayList / map / set
    }

    public void setPoder(int poder){
        if(poder < 1){
            this.poder = 1;
        } else if (poder > 100) {
            this.poder = 100;
        }
        else{
            this.poder = poder;
        }
    }

    public String getNombre(){
        return nombre;
    }

    public int getPoder(){
        return poder;
    }

    public String getTipo(){
        return tipo;
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
}
