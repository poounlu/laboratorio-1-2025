package ar.edu.unlu.poo.labo1.artefactos;
import ar.edu.unlu.poo.labo1.libreria.Libro;

import java.util.*;


public class CatalogoArtefactos {

    private Artefacto artefacto;

    Set<Artefacto> catalogoUnicos = new HashSet<>();
    List<Artefacto> artefactosPorTipo = new ArrayList<>();
    Map<String, Integer> cantArtefactosPorTipo = new HashMap<>();

    public void agregarArtefacto(Artefacto artefacto) {

             if (catalogoUnicos.add(artefacto)) {
                 artefactosPorTipo.add(artefacto);
             }
            // cantArtefactosPorTipo.put(artefacto.getTipo() , 1);

    }
    public Set obtenerArtefactosUnicos(){
        return catalogoUnicos;
    }

    /*public List buscarArtefactosPorTipo(String tipo){

        return artefactosPorTipo;
    }
    public Map<String, Integer> contarArtefactosPorTipo(){
        return cantArtefactosPorTipo;
    }


    public Artefacto obtenerArtefactoMasPoderoso(Artefacto artefacto){
        return artefacto;
    }*/
}
