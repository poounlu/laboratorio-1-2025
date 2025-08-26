package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {

    Set<Artefacto> catalogo = new HashSet<>();
    public void agregarArtefacto (Artefacto artefacto){
        catalogo.add(artefacto);
    }

    public Set obtenerArtefactosUnicos(){
        return catalogo;
    }

    public List buscarArtefactosPorTipo(String tipo){
        List<Artefacto> resultado = new ArrayList<>();
        for (Artefacto a: artefacto){

        }
    }

    public Map<String, Integer> contarArtefactosPorTipo(){

    }
}
