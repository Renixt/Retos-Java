/*public class Entrada {
    String nom_evento;
    double entrada;

    //CONSTRUCTOR
    public Entrada(String nom_evento, double entrada){
        this.nom_evento = nom_evento;
        this.entrada = entrada;
    }

    public void mostrarInformacion(){
        System.out.println("Evento: " + nom_evento + " / Precio: $" + entrada);
    }
}*/

//usar un record para clases simples que no requieran mucha lógica, así evitamos tener que crear toda la estructura básica
record Entrada(String nom_evento, double entrada){
    public void mostrarInformacion(){
        System.out.println("Evento: " + nom_evento + " / Precio: $" + entrada);
    }
};
