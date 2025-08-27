package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {
    private Set<Artefacto> artefactos = new HashSet<>();


    public void agregarArtefacto(Artefacto artefacto){
        artefactos.add(artefacto);
    }

    public Set obtenerArtefactosUnicos(){
        return artefactos;
    }

    public List buscarArtefactosPorTipo(String tipo){
        List<Artefacto> tipoArtefactos = new ArrayList<>();

        for(Artefacto artefacto: artefactos){
            if(artefacto.getTipo().equals(tipo)){

                tipoArtefactos.add(artefacto);

            }
        }

        Collections.sort(tipoArtefactos, new Comparator<Artefacto>() {
            @Override
            public int compare(Artefacto o1, Artefacto o2) {
                int n = 0;
                if(o1.getPoder() > o2.getPoder()){
                    n = 1;
                }
                else if (o1.getPoder() < o2.getPoder()){
                    n = -1;
                }
                return n;
            }
        });

        return tipoArtefactos;
    }


    public Map<String, Integer> contarArtefactosPorTipo(){
        Map<String, Integer> artefactosTipo = new HashMap<>();

        for(Artefacto artefacto: artefactos){
            //artefactosTipo(artefacto.getTipo(),);
        }
        return null;
    }

    public Artefacto obtenerArtefactoMasPoderoso(){
        for (Artefacto artefacto: artefactos){

        }
        return null;
    }
}

