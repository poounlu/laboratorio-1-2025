package ar.edu.unlu.poo.labo1.artefactos;

import java.util.Collection;
import java.util.*;
import java.util.Objects;

public class CatalogoArtefactos {
    private List<Artefacto> catalogo;

    public CatalogoArtefactos(){
        catalogo = new ArrayList<>();
    }


    public void agregarArtefacto(Artefacto artefacto) {
        catalogo.add(artefacto);
    }

    public Set<Artefacto> obtenerArtefactosUnicos() {
        Set<Artefacto> artefactosUnicos = new HashSet<Artefacto>();

        for(Artefacto artefacto: catalogo){
            artefactosUnicos.add(artefacto);
        }
        return artefactosUnicos;
    }

    public List<Artefacto> buscarArtefactosPorTipo(String tipo) {
        List<Artefacto> tipos = new ArrayList<>();

        for(Artefacto artefacto: catalogo){
            if(artefacto.getTipo().equals(tipo)){
                tipos.add(artefacto);
            }
        }

        return tipos;
    }

    public Map<String, Integer> contarArtefactosPorTipo() {
        Map<String, Integer> conteo = new HashMap<>();


        for(Artefacto artefacto: catalogo){
            conteo.put(artefacto.getTipo(), 1);
        }
        return conteo;
    }

    /*public Artefacto obtenerArtefactoMasPoderoso() {
        int poderoso = 0;

        for(Artefacto artefacto: catalogo){
            Collections.sort(catalogo);
        }

    }*/
}
