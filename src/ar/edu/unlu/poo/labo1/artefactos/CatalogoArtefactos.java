package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {
    private Set<Artefacto> catalogo = new HashSet<>();

    public void agregarArtefacto(Artefacto artefacto){
        this.catalogo.add(artefacto);
    }

    public Set<Artefacto> obtenerArtefactosUnicos(){
        return this.catalogo;
    }

    public List<Artefacto> buscarArtefactosPorTipo(String tipo){
        List<Artefacto> lista = new ArrayList<>(List.of());
        for(Artefacto a : this.catalogo){
            if(a.getTipo().equals(tipo)){
                lista.add(a);
            }
        }
        return lista;
    }

    public Map<String, Integer> contarArtefactosPorTipo(){
        Map<String, Integer> artefactosPorTipo = new HashMap<>();
        int conteo = 0;
        for(Artefacto a : this.catalogo){
            if(artefactosPorTipo.containsKey(a.getTipo())){
                conteo = artefactosPorTipo.get(a.getTipo());
                artefactosPorTipo.put(a.getTipo(), conteo + 1);
            }

        }

        return artefactosPorTipo;
    }

    public Artefacto obtenerArtefactoMasPoderoso(){
        int poder = 0;
        Artefacto temp = new Artefacto();
        if(this.catalogo.isEmpty()){
            return null;
        }
        for(Artefacto a : this.catalogo){
            if(a.getPoder() >= poder){
                poder = a.getPoder();
                temp = a;
            }
        }
        return temp;
    }
}
