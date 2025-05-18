public class Patrulla extends UnidadEmergencia {

    SistemaGps sistemaGPS;
    Sirena sirena;
    Operador operador;

    public  Patrulla(String nombre, Operador operador){
        super(nombre);
        this.sistemaGPS = new SistemaGps();
        this.sirena = new Sirena();
        this.operador = operador;
    }


    public  void iniciarOperacion(){
        activarUnidad();
        sistemaGPS.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }

    @Override
    void responder() {
        System.out.println("Patrulla respondiendo a reporte.");
    }

}
