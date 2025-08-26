package ar.edu.unlu.poo.labo1.artefactos;

import java.util.HashSet;

public class CatalogoArtefactos {
	Set<Artefacto> artefactosUnicos = new HashSet<>();

	public void	agregarArtefacto(Artefacto item){

		this.artefactosUnicos.add(item);

	}
	public Set<Artefacto> obtenerArtefactosUnicos(){

	}
}
