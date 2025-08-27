package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {
     HashMap<Artefacto, Integer> misobjetos = new HashMap<>();
     private int clave = 0;

     public void agregarArtefacto (Artefacto newartefacto) {
         misobjetos.put(newartefacto, 1);

         generarclave();

     }


     private int generarclave(){
         clave++;
         return  clave;
     }




}
