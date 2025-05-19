import java.io.BufferedReader;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class AnalizadorDeLogs {
    public static void main(String[] args) {

        int error=0;
        int warning=0;
        int total=0;
        Path ruta = Paths.get("src/log-errores.txt");

        //try (recurso) que sera autom cerrado al finalizar el bloque, no necesito lector.close()
        try (BufferedReader lector = Files.newBufferedReader(ruta)) {
            String linea;


            while ((linea = lector.readLine()) !=null ){
                System.out.println("->" + linea);
                if(linea.contains("ERROR")) error++;
                if(linea.contains("WARNING")) warning++;
                total++;}

        } catch (IOException e){
            System.out.println("❌ Error al procesar el archivo: " + e.getMessage());
        }

        System.out.println("\nCANTIDAD DE ERRORES: " + error
                        + "\nCANTIDAD DE ADVERTENCIAS: " + warning
                        + "\nTOTAL DE LINEAS LEIDAS: " + total);
        float porcentaje = ((float) (error + warning) /total)*100;
        System.out.println("PORCENTAJE DE LINEAS CON ERROR/ADVERTENCIA: "+ porcentaje + "%");
    }
}


