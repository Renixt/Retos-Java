import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {

        //lista que gestiona los temas activos
        List<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Matematicas", 3 ));
        temas.add(new Tema("Lectura", 2));
        temas.add(new Tema("Etica", 1));

        //orden natural por titulo comparable
        Collections.sort(temas);
        System.out.println("Temas ordenados alfabeticamente: ");
        for (Tema tema : temas){
            System.out.println(tema);
        }


        //  ORDEN POR PRIORIDAD (COMPARATOR)
        temas.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema o1, Tema o2) {
                return Integer.compare(o1.prioridad, o2.prioridad);
            }
        });

        System.out.println("\nOrdenes ordenadas por prioridad 1=urgente");
        for (Tema tema : temas){
            System.out.println(tema);
        }

        //MAPA CONCURRENTE, de materiales asociados a cada tema, tema-recurso
        ConcurrentHashMap<String, String > material_recurso = new ConcurrentHashMap<>();
        material_recurso.put("Lectura Comprensiva", "https/lect:com");
        material_recurso.put("Mates basicas", "https/matess:com");

        System.out.println("\nMaterial-recurso \uD83C\uDFE1");
        for (String material : material_recurso.keySet()){ //keyset devuelve el conjunto de todas las claves(material) y la almacena en material
            //imprime la clave(material) y su valor correspondiente se obtiene con mat_rec.get(clave)
            System.out.println(material + " Link ->" + material_recurso.get(material));
        }

    }
}