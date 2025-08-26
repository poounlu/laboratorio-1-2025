package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {

    Set<Artefacto> catalogo = new HashSet<>();

    public CatalogoArtefactos(){

    }

    //metodo--------------------------------------------------------
    public void agregarArtefacto(Artefacto unArtefacto){
        unArtefacto.equals();
        catalogo.add(unArtefacto);
    }


    public Set obtenerArtefactosUnicos(){
        return catalogo;
    }

    public List buscarArtefactosPorTipo(String unTipo){

    }

    public Map contarArtefactosPorTipo(){

    }

    public Artefacto obtenerArtefactoMasPoderoso(String unTipo){
        return unTipo;
    }


}
