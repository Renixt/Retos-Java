import java.util.HashMap;
import java.util.Map;

public class MainNarrativa {

        //escena clave-valor,
        Map<String, String> escenas;
        DecisionBinaria decisionBinaria;
        TransicionSimple transicion;
        DialogoTexto dialogos = new DialogoTexto();

        public  MainNarrativa(Map<String,String> escenas, DecisionBinaria decisionBinaria, TransicionSimple transicion, DialogoTexto dialogos){
            this.escenas = escenas;
            this.dialogos = dialogos;
            this.decisionBinaria = decisionBinaria;
            this.transicion = transicion;
        }

        public void ejecutar() {
            dialogos.imprimirDialogo(escenas, "Inicio_1");
            dialogos.imprimirDialogo(escenas, "Inicio_2");
            dialogos.imprimirDialogo(escenas, "Decision_1");
            dialogos.imprimirDialogo(escenas, transicion.siguienteEscena(decisionBinaria.leerDesicion()));
        }


}