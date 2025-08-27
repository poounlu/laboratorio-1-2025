package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {
    Set<Artefacto> artefactos;

    public CatalogoArtefactos() {
        this.artefactos = new HashSet<>();
    }

    public void agregarArtefacto(Artefacto item){
        artefactos.add(item);
    }

    public Set<Artefacto> obtenerArtefactosUnicos() {
        return artefactos;
    }

    public List buscarArtefactosPorTipo(String tipo){
        List<Artefacto> lista = new ArrayList<>();
        for(Artefacto item : artefactos){
            if(item.getTipo().equals(tipo)){
                lista.add(item);
            }
        }
        return lista;
    }

    public Map<String,Integer> contarArtefactosPorTipo(){
        Map<String,Integer> tabla = new HashMap<>();
        for(Artefacto item : artefactos){
            Integer valor = tabla.putIfAbsent(item.getTipo(), 1);
            if(valor != null){
                tabla.put(item.getTipo(),valor+1);
            }
        }
        return tabla;
    }
}
