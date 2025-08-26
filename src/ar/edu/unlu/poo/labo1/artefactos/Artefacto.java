
package ar.edu.unlu.poo.labo1.artefactos;

import java.util.Objects;

public class Artefacto {
    private String nombre;
    private int poder;
    private String tipo;

    public Artefacto(String nombre, int poder, String tipo){
        this.setNombre(nombre);
        this.setPoder(poder);
        this.setTipo(tipo);
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass() ) return false;
        Artefacto test = (Artefacto) o;
        boolean estado;
        estado =  Objects.equals(o, test.getNombre());
        //((Objects.equals(nombre, test.nombre))&&((
        //Objects.equals(poder, test.poder)
        //)&&(
        //	Objects.equals(tipo, test.tipo
        //	))));
        return estado;

    }
    @Override
    public int hashCode(){
        return Objects.hash(getNombre());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}