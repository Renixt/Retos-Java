abstract class UnidadEmergencia {
    String nombre;

    public UnidadEmergencia(String nombre){
        this.nombre =nombre;
    }
    abstract void responder();

    public void activarUnidad(){
        System.out.println("ACTIVANDO UNIDAD: " + nombre);
    }
}
