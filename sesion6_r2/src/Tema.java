public class Tema implements Comparable<Tema>{
    String titulo;
    int prioridad;

    public Tema(String titulo, int prioridad){
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    //Orden naturalpor nombre del producto COMPARABLE
    @Override
    public int compareTo(Tema otra){
        return this.titulo.compareTo(otra.titulo);
    }

    @Override
    public String toString(){
        return "Titulo: "+ titulo + " | Prioridad: " + prioridad;
    }
}
