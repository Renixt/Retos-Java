/*Estás diseñando un sistema que permite registrar y activar diferentes
unidades de respuesta a emergencias, como ambulancias, patrullas y camiones
 de bomberos. Aunque todas comparten ciertas funciones (como responder a una emergencia),
 cada una puede tener un comportamiento específico.

Además, todas las unidades están equipadas con tecnología como sistemas GPS,
 sirenas, y son operadas por personal capacitado. Estos componentes serán
 modelados mediante composición.*/
public class Main {
    public static void main(String[] args) {
        UnidadBomberos bomberos = new UnidadBomberos("Bomberos", new Operador("Carlos"));
        bomberos.iniciarOperacion();

        System.out.println(" ");
        Ambulancia ambulancia = new Ambulancia("Ambulancia02", new Operador("Ana"));
        ambulancia.iniciarOperacion();

        System.out.println(" ");
        Patrulla patrulla = new Patrulla("Patrullita", new Operador("Paco"));
        patrulla.iniciarOperacion();
    }
}