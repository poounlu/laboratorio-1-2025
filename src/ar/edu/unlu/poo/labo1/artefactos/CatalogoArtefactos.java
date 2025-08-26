package ar.edu.unlu.poo.labo1.artefactos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Collections;

public class CatalogoArtefactos {

    HashSet<Artefacto> catalogo = new HashSet<>();
    List<Artefacto> misArtefactos = new ArrayList<>();

    public void agregarArtefacto(Artefacto artefacto){
        catalogo.add(artefacto);
    }

    public Set obtenerArtefactosUnicos() {

        return catalogo;
    }

    public List buscarArtefactosPorTipo(String tipo){

          for (Artefacto artefacto : catalogo){
              if ((artefacto.getTipo()).equals(tipo)){
                  misArtefactos.add(artefacto);
                  misArtefactos.sort(artefacto.getPoder());

              }


              }
          }

    }



}
