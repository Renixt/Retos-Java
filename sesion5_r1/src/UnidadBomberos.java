public class UnidadBomberos extends UnidadEmergencia {

     SistemaGps sistemaGPS;
     Sirena sirena;
     Operador operador;

     public  UnidadBomberos(String nombre, Operador operador){
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
        System.out.println("Unidad de Bomberos respondiendo a incendio.");
    }

}
