import java.util.Map;

public class DialogoTexto implements GestorDialogo{

    @Override
    public void imprimirDialogo(Map<String, String> escenas, String escena){
            System.out.println(escenas.get(escena));


    }
}
