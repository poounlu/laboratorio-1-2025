package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {
    List<Artefacto> catalogo = new ArrayList<>();

    void agregarArtefacto(Artefacto artefacto){
        for (int i = 0; i < catalogo.size(); i++){
            if ( catalogo.get(i).equals(artefacto)){
                System.out.println("Error");
            } else {
                catalogo.add(artefacto);

            }
        }
    }
    Set obtenerArtefactosUnicos(){
        Set<Artefacto> catalogoNoDuplicados = new HashSet<>();
        for (int i = 0; i < catalogo.size(); i++){
            catalogoNoDuplicados.add(catalogo.get(i));
        }
        return catalogoNoDuplicados;
    }

    List buscarArtefactosPorTipo(String tipo){
        List<Artefacto> catalogoFiltrado = new ArrayList<>();

        for (int i = 0; i < catalogo.size(); i++){
            Artefacto temp = catalogo.get(i);
            if ( temp.getTipo() == tipo){
                catalogoFiltrado.add(temp);
            }
        }

        catalogoFiltrado.sort(Comparator.comparing(Artefacto::getPoder).reversed());
        return catalogoFiltrado;
    }

    Map<String, Integer> contarArtefactosPorTipo(){
        Map<String, Integer> mapeadoCatalago = new HashMap<>();
        for (int i = 0; i < catalogo.size(); i++){
            Artefacto temp = catalogo.get(i);
            if (mapeadoCatalago.get(temp.getTipo()) == null) {
                mapeadoCatalago.put(temp.getTipo(), 1);
            } else {
                int cont = mapeadoCatalago.get(temp.getTipo());
                mapeadoCatalago.put(temp.getTipo(), cont+1);
            }

        }

        return mapeadoCatalago;
    }

    Artefacto obtenerArtefactoMasPoderoso(){
        catalogo.sort(Comparator.comparing(Artefacto::getPoder).reversed());
        if (catalogo.isEmpty()) {
            return null;
        } else {
            return catalogo.get(0);
            }
        }
}
