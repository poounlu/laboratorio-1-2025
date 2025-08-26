package ar.edu.unlu.poo.labo1.artefactos;


import java.util.*;

public class CatalogoArtefactos {
    private Set<Artefacto> catalogo = new HashSet<>();

    public void agregarArtefacto(Artefacto artefacto) {
        catalogo.add(artefacto);
    }

    public Set obtenerArtefactosUnicos() {
        return catalogo;
    }

    public List buscarArtefactosPorTipo(String tipo){
        List<Artefacto> artefactosPorTipo = new ArrayList<>();
        for (Artefacto artefacto : catalogo){
            if (artefacto.getTipo()==tipo){
                artefactosPorTipo.add(artefacto);
            }
        }
        Collections.sort(artefactosPorTipo, new Comparator<Artefacto>() {
            @Override
            public int compare(Artefacto a1, Artefacto a2) {
                // Ordenar por nombre
                int m=0;
                if (a1.getPoder()>a2.getPoder()){
                m = 1;
                } else if (a1.getPoder()<a2.getPoder()) {
                    m=-1;
                }

                return m;
            }
        }
        return artefactosPorTipo;
    }

    public Map contarArtefactosPorTipo(){
        Map<String, Integer> mapa = new HashMap<>();
        for (Artefacto artefacto : catalogo){
            mapa.put(artefacto.getTipo(), 1);
        }
        return mapa;
    }

    public Artefacto obtenerArtefactoMasPoderoso() {
        Artefacto artefactoADevolver = null;
        int mayor = -1;
        for (Artefacto artefacto : catalogo){
            if (artefacto.getPoder()>mayor){
                artefactoADevolver = artefacto;
                mayor = artefacto.getPoder();
            }
        }
        return artefactoADevolver;
    }
}


