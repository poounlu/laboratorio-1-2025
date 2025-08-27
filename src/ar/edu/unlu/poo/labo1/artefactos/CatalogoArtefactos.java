package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos { ;
    Set<Artefacto> catalogo = new HashSet<>();
    //agregar artefactos
    public void agregarArtefacto(Artefacto artefacto){
        catalogo.add(artefacto);
    }


    //obtener artefactosUnicos
    public Set<Artefacto> obtenerArtefactosUnicos(){
        return catalogo;
    }
}
