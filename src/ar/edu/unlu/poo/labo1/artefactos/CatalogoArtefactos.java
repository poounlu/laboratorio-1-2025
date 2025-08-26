package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {
    private List<Artefacto> catalogo;

public CatalogoArtefactos(){
    catalogo = new ArrayList<>();
}

    public void agregarArtefacto(Artefacto artefacto) {
        catalogo.add(artefacto);
    }

    public Set<Artefacto> obtenerArtefactosUnicos() {
         Set<Artefacto> artefactoUnico = new HashSet<>();
         for(Artefacto artefacto : catalogo){
             artefactoUnico.add(artefacto);
         }
         return  artefactoUnico;
    }

    public List<Artefacto> buscarArtefactosPorTipo(String tipo) {
            List<Artefacto> lista = new ArrayList<>();
            for (Artefacto artefacto : catalogo){
                if(artefacto.getTipo() == tipo){
                    lista.add(artefacto);
                };
            }
            return lista;
    }

    public Map<String, Integer> contarArtefactosPorTipo() {
            Map<String, Integer> artefactoPorTipo = new HashMap<>();
            for (Artefacto artefacto: catalogo){
                artefactoPorTipo.put(artefacto.getTipo(),1);
            }

            return artefactoPorTipo;
    }


}
