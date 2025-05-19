import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class RegistroSimulacion {
    public static void main(String[] args) {

        // 1. Crear un objeto Path que apunte a un archivo
        Path rutaArchivo = Paths.get("src/config/parametros.txt");

        //2. Imprimir la ruta del archivo
        System.out.println("📁 Ruta absoluta: " + rutaArchivo.toAbsolutePath());

        //3.Verificar si el archivo existe
        if(Files.exists(rutaArchivo)){
            System.out.println("El archivo existe");
        }else{
            System.out.println("El archivo NO existe");
        }

        String parametros= "Tiempo de ciclo: 55.8 segundos.\n" +
                "Velocidad de linea: 1.55 m/s \n" +
                "Numero de estaciones: 8" ;

        //FILES.WRITE PARA GARDAR EL CONTENIDO EN EL ARCHIVO
        try{
            //4. Escribir (crea o sobreescribe)
            Files.write(rutaArchivo, parametros.getBytes());
            System.out.println("✅ Archivo escrito exitosamente.\n");

            //5.leer el contenido del archivo como string
            String textoLeido = Files.readString(rutaArchivo);
            System.out.println("📄 Contenido leído:");
            System.out.println(textoLeido);


        }catch (IOException e){
            System.out.println("❌ Error al trabajar con el archivo: " + e.getMessage());
        }

    }
}
