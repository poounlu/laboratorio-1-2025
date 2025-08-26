package ar.edu.unlu.poo.labo1.artefactos;

//2. Clase `CatalogoArtefactos`:
//    - Para almacenar los artefactos, debes usar una colección que evite duplicados de forma natural. Se sugiere un `HashSet`.
//    - El método `buscarArtefactosPorTipo` debe ser eficiente. No se permite simplemente iterar sobre toda la colección si existen formas más óptimas de estructurar los datos.
//    - El método `contarArtefactosPorTipo` debe ser resuelto de manera clara y concisa.

import java.util.*;

public class CatalogoArtefactos {
    private Set<Artefacto> catalogo = new HashSet<>();
    private Map<String, Integer> contador = new HashMap<>();
    private List<Artefacto> lista = new ArrayList<>();

    //Devuelve una lista (`List`) de artefactos que coincidan con el tipo especificado.
    //La lista debe estar ordenada de mayor a menor poder.
    public List<Artefacto> buscarArtefactosPorTipo(String tipoArtefacto){
        ArrayList<Artefacto> resultado = new ArrayList<>();
        if(lista.isEmpty()) return resultado;
        for (Artefacto artefacto : lista) {
            if (tipoArtefacto.equals(artefacto.getTipo())){
                Artefacto x = new Artefacto(artefacto.getNombre(), artefacto.getPoder(), tipoArtefacto);
                resultado.add(x);
            }
        }
        ArrayList<Artefacto> res_ordenado = new ArrayList<>();
        Collections.sort(resultado, new Comparator<Artefacto>()){
            @Override
            public int compare(Artefacto o1, Artefacto o2) {
                int n=0;
                if(o1.getPoder() > o2.getPoder()){
                    n=1;
                } else if (o1.getPoder() < o2.getPoder()) {
                    n = -1;
                }
                return n;
            }
        }
        return res_ordenado;
    }

    //   Añade un nuevo artefacto al catálogo. Si un artefacto con el mismo nombre ya existe, no se debe añadir.
    public void agregarArtefacto(Artefacto artefacto){
        lista.add(artefacto);

    }

    //Devuelve un mapa (`Map`) donde la clave es el tipo de artefacto y el valor es la cantidad de artefactos de ese tipo existentes en el catálogo.
    public Map<String, Integer> contarArtefactosPorTipo(){
        Map<String,Integer> res = new HashMap<>();
        for (Artefacto artefacto : contador){
            res.put(artefacto.getTipo(), 1);
        }
        return res;

    }

    //   Devuelve un conjunto (`Set`) con todos los artefactos del catálogo, garantizando que no haya duplicados.
    public Set<Artefacto> obtenerArtefactosUnicos(){

    }

    public Artefacto obtenerArtefactoMasPoderoso(){

    }
    //   Devuelve el artefacto con el mayor nivel de poder.
    //   Si hay varios con el mismo poder máximo, puede devolver cualquiera de ellos. Si el catálogo está vacío, debe devolver `null`.
    public Set<Artefacto> getCatalogo() {
        return catalogo;
    }

    public Map<String, Integer> getContador() {
        return contador;
    }

    public List<Artefacto> getLista() {
        return lista;
    }
}
