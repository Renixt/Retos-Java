import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //escena clave-valor,
        Map<String, String> escenas = new HashMap<>();
        escenas.put("Inicio_1", "Frieren camina por el bosque sin rumbo alguno, despues de unas cuantas horas encuentra a un enano atorado en un hoyo muy grande.");
        escenas.put("Inicio_2","--AYUDAAA!!- Grito el enano desde el fondo. \n Frieren se asomo y penso que era momento de tomar una decision importante.");
        escenas.put("Decision_1", "Podia: \n a)Ayudar al enano con su magia, aunque eso signifique tener que hablarle. \n b)Ignorar al enano y continuar con su vida en paz y si distracciones.");
        escenas.put("respuesta1_a", "Frieren ayuda al enano y este le agradece dandole un mapa de enanos para encontrar oro.");
        escenas.put("respuesta1_b", "Frieren no ayuda al enano y decide irse, al dar un paso resbala, y termina en el mismo hoyo que el enano.");
        escenas.put("Final_1", "Gracias al mapa Frieren tiene un nuevo objetivo en su larga vida. Encontrar el oro escondido en las montañas de los enanos.");
        escenas.put("Final_2", "Ahora Frieren tiene que trabajar junto con el enano para salir del pozo. Ademas tiene un gran chipote en la cabeza.");
        MainNarrativa narrativa = new MainNarrativa(escenas, new DecisionBinaria(), new TransicionSimple(), new DialogoTexto());
        narrativa.ejecutar();

    }
}