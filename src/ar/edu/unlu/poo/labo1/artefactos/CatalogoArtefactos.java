package ar.edu.unlu.poo.labo1.artefactos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CatalogoArtefactos {
    private List<Artefacto> misArtefactos;

    public CatalogoArtefactos(){
        misArtefactos = new ArrayList<>();
    }
    public void agregarArtefacto(Artefacto artefacto){
        int cant = misArtefactos.size(),i = 1;
        boolean resp = true;

        while(i<=cant && resp !=false){
            if(misArtefactos.get(i).hashCode() == artefacto.hashCode()){
                resp = false;
            }
            i++;
        }

        if(resp == true){
            misArtefactos.add(artefacto);
        }
    }


    public Set<Artefacto> obtenerArtefactosUnicos(){



        return misArtefactos.;
    }

    public List<Artefacto> buscarArtefactosPorTipo(String tipo){


    }

    public Map<String, Integer> contarArtefactosPorTipo(){

    }
    public Artefacto obtenerArtefactoMasPoderoso(){

    }
}
