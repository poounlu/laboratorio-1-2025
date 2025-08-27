package ar.edu.unlu.poo.labo1.artefactos;

//import java.util.HashSet; Comentamos porque importamos util.*
//import java.util.Set;
import java.util.*;

import static java.util.Comparator.comparingInt;


public class CatalogoArtefactos {
    private Set<Artefacto> colecionArtefactos = new HashSet<>();
    private Map<String, Integer> mapaArtefactos = new HashMap<>();
    int contadorPocion, contadorPergamino, contadorAmuleto, contadorVarita = 0;

    public void agregarArtefacto(Artefacto nuevoArtefacto){
       //agregar if para avisar si elemento repetido
        colecionArtefactos.add(nuevoArtefacto);
        switch (nuevoArtefacto.getTipo()){
            case "Pocion": mapaArtefactos.put(nuevoArtefacto.getTipo(), contadorPocion++);
            case "Pergamino": mapaArtefactos.put(nuevoArtefacto.getTipo(), contadorPergamino++);
            case "Amuleto": mapaArtefactos.put(nuevoArtefacto.getTipo(), contadorAmuleto++);
            case "Varita": mapaArtefactos.put(nuevoArtefacto.getTipo(), contadorVarita++);
        }
    }

    public Set obtenerArtefactosUnicos(){
        return this.colecionArtefactos;
    }

    public List buscarArtefactosPorTipo(String tipo) {
        List<Artefacto> listaPorTipo = new ArrayList<>();
        for (Artefacto a : colecionArtefactos) {
            if (a.getTipo().equals(tipo)) {
                listaPorTipo.add(a);
            }
        }
        listaPorTipo.sort(comparingInt(Artefacto::getPoder));
        //leido de stackoverflow https://stackoverflow.com/questions/16252269/how-to-sort-a-list-arraylist
        return listaPorTipo;
    }

    public Map<String, Integer> contarArtefactosPorTipo(){
        return mapaArtefactos;
    }
    public Artefacto obtenerArtefactoMasPoderoso(){
        int maxPoder = 0;
        Artefacto masPoderoso = null;
        for (Artefacto a : colecionArtefactos) {
            if (a.getPoder()>maxPoder) {
                masPoderoso = a;
                maxPoder = a.getPoder();
            }
        }
        return masPoderoso;
    }

}
