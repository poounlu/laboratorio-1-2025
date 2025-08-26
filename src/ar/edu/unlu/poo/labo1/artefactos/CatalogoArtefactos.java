package ar.edu.unlu.poo.labo1.artefactos;
import java.util.*;

public class CatalogoArtefactos {
    private Set<Artefacto> catalogoArt = new HashSet<>();

    //Constructor del catalogo
    public CatalogoArtefactos() {
        this.catalogoArt = catalogoArt;
    }

    //metodo agregarArtefacto
    public void agregarArtefacto(Artefacto artefacto){
        catalogoArt.add(artefacto);
    }

    //metodo obtenerArtefactosUnicos
    public Set<Artefacto> obtenerArtefactosUnicos(){
        return catalogoArt;
    }

    public List<Artefacto> buscarArtefactosPorTipo(String tipo){
        //Creo la list
        List <Artefacto> lista1 = new ArrayList<>();

        //Iterar por el set
        for(Artefacto artefacto : catalogoArt) {
            //Comparo si es del mismo tipo
            //Si es del mismo tipo lo agrego a la list
            if (artefacto.getTipo().equals(tipo)) {
                lista1.add(artefacto);
            }
        }

        //Ordeno mayor a menor con sort()
        lista1.sort(null);
        lista1.reversed();
        return lista1;
    }

    public Map<String, Integer> contarArtefactosPorTipo() {
        //Crear el map con los contadores en
        HashMap<String, Integer> cantidadPorTipo = new HashMap<>();
        //Iterar por el set
        for (Artefacto artefacto : catalogoArt){
            //Agregar 1 al contador en el tipo de corresponda
            
        }


    }

    public Artefacto obtenerArtefactoMasPoderoso() {
        Artefacto artefactoMasPoderoso = null;
        //comparar si el catalogo no esta vacio
        if(catalogoArt.isEmpty()){
            return null;
        }
        else  {
            //iterar por el set
            for(Artefacto artefacto : catalogoArt){
                if ( artefactoMasPoderoso == null) {
                    //guardar el mayor
                    artefactoMasPoderoso = artefacto;
                } else if (artefacto.getPoder() > artefactoMasPoderoso.getPoder()) {
                    artefactoMasPoderoso = artefacto;
                }


            }
            return artefactoMasPoderoso;
        }


    }
}
