package ar.edu.unlu.poo.labo1.artefactos;

import java.util.Objects;

public class Artefacto {
	private String nombre;
	private int poder;
	private  String tipo; 

	public Artefacto(String nombre, int poder, String tipo){
		this.nombre = nombre;
		this.poder = poder;
		this.tipo = tipo;
	}
	public String getNombre(){
		return this.nombre;
	}
	public int getPoder(){
		return this.poder;
	}
	public String getTipo(){
		return this.tipo;
	}

	@Override
	public boolean equals(Object o){
		if(this == o) return true;
		if(o == null || getClass() != o.getClass() ) return false;
		Artefacto test = (Artefacto) o;
		boolean estado;
		estado =  Objects.equals(o, test.nombre);
			//((Objects.equals(nombre, test.nombre))&&((
							//Objects.equals(poder, test.poder)
							//)&&(
							//	Objects.equals(tipo, test.tipo
							//	))));
		return estado;

	}
	@Override
	public int hashCode(){
		return Objects.hash(nombre);
	}







}
