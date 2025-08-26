
package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {
    private Set<Artefacto> artefactosUnicos = new HashSet<>();

    public void	agregarArtefacto(Artefacto item){
        this.artefactosUnicos.add(item);

    }


    public List<Artefacto> buscarArtefactosPorTipo(String tipo) {


    }
    public Set<Artefacto> obtenerArtefactosUnicos(){
        return this.artefactosUnicos;
    }
	/*
	public boolean comparadorArt(Artefacto test, Artefacto test2){
		//Artefacto test = (Artefacto) uno;
		//Artefacto test2 = (Artefacto) dos;
		if(test.getPoder() > test2.getPoder()){
			return true;
		}else{
			return false;
		}
	}*/


    public List<Artefacto> buscarArtefactosPorTipo(String tipo){
        List<Artefacto> lista_por_tipo = new ArrayList<>();
        for(Artefacto a : this.artefactosUnicos){
            if(a.getTipo() == tipo ){
                lista_por_tipo.add(a);
            }
        }
        //ordenados
        lista_por_tipo.sort(Comparator.comparingInt(Artefacto::getPoder));
        return lista_por_tipo;
    }

    //public Map<String, Integer> contarArtefactosPorTipo() {
    //}
}