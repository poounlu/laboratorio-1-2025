package ar.edu.unlu.poo.labo1.artefactos;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CatalogoArtefactos {

    HashSet<Artefacto> catalogo = new HashSet<>();

    List<Artefacto> listaartefactos = new ArrayList<>();

    void agregarArtefacto(Artefacto artefacto){
        catalogo.add(artefacto);
    }
    Set obtenerArtefactosUnicos(){
        return catalogo;
    }


}
