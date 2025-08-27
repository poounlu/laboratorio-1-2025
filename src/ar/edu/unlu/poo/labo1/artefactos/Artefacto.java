package ar.edu.unlu.poo.labo1.artefactos;

import java.util.Set;

public class Artefacto {
     private String nombre;
     private int nivel;
     private String tipoobjeto;

    public Artefacto(String newname, int newnivel, String newTipoObjeto){
         setNivel(newnivel);
         setTipoobjeto(newTipoObjeto);
         setNombre(newname);

     }

    public String getNombre() {
        return nombre;
    }
    public int getNivel() {
        return nivel;
    }

    public String getTipoObjeto() {
        return tipoobjeto;
    }
    public void setNivel(int newnivel) {
        if (newnivel >=1 && newnivel <= 100) {
            this.nivel = newnivel;
        }
    }

    public void setTipoobjeto(String newtipoobjeto) {
        tipoobjeto = newtipoobjeto;
    }
    public void setNombre(String newnombre) {
        nombre = newnombre;
    }

}
