package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {
    private String nombre;
    private Set<Artefacto> catalago = new HashSet<>();
    private List<Artefacto> catalogoPorTipo = new ArrayList<>();
    private Map<String,Integer> cantidadPorTipo = new HashMap<>();

    public String getNombre() {
        return nombre;
    }

    public Set<Artefacto> getCatalago() {
        return catalago;
    }

    public List<Artefacto> getCatalogoPorTipo() {
        return catalogoPorTipo;
    }

    public Map<String, Integer> getCantidadPorTipo() {
        return cantidadPorTipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean agregarArtefacto(Artefacto artefactoNuevo){
        Boolean resultado = false;
        if (equals(artefactoNuevo)) {
            resultado = true;
            getCatalago().add(artefactoNuevo);
        }
        return resultado;
    }

    public Set<Artefacto> obtenerArtefactosUnicos(){
        return getCatalago();
    }

    public List<Artefacto> buscarArtefactosPorTipo(String tipo){
        Iterator<Artefacto> iterator = catalago.iterator();
        Artefacto artefactoActual = iterator.next();
        for (int i=0; i < catalago.size(); i++) {
            artefactoActual = iterator.next();
            catalogoPorTipo.add(artefactoActual);
        }

    }

    public Artefacto obtenerArtefactoMasPoderoso(){

    }

    public Map<String,Integer> contarArtefactosPorTipo(){

    }
}
