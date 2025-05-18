import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> ordenMuestras = new ArrayList<>();
        ordenMuestras.add("Homo sapiens");
        ordenMuestras.add("Mus musculus");
        ordenMuestras.add("Arabidopsis thaliana");
        ordenMuestras.add("Homo sapiens");
        System.out.println("Muestras en orden de llegada: \n" + ordenMuestras + "\n");

        Set<String> especiesUnicas = new HashSet<>();
        especiesUnicas.add("Homo sapiens");
        especiesUnicas.add("Mus musculus");
        especiesUnicas.add("Arabidopsis thaliana");
        especiesUnicas.add("Homo sapiens");
        System.out.println("Especies unicas: \n" + especiesUnicas + "\n");

        Map<String, String> muestraInvestigador =new HashMap<>();
        muestraInvestigador.put("001","Renata");
        muestraInvestigador.put("002","Angelica");
        muestraInvestigador.put("003","Roxana");
        System.out.println("ID-Investigador: \n" + muestraInvestigador + "\n");
        System.out.println("LA MUESTRA 002 PERTENECE A " + muestraInvestigador.get("002"));

    }
}