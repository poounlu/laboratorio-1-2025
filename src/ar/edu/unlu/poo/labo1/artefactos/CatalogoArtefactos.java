package ar.edu.unlu.poo.labo1.artefactos;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CatalogoArtefactos {

    Set<Artefacto> catalogo = new HashSet<>();
    public CatalogoArtefactos(){
    }

    public void agregarArtefacto(Artefacto varitaSauco){
        catalogo.add(varitaSauco);
    }

    public Set<Artefacto> obtenerArtefactosUnicos() {
        return catalogo;
    }

    public List<Artefacto> buscarArtefactosPorTipo(String tipo){
        // while utilizando funcion index
    }
}
