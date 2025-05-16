public class Vuelo {
    final static String codigoVuelo = "UDMX";
    String destino;
    String horaSalida;
    Pasajero asientoReservado;


    public Vuelo(String destino, String horaSalida) {

        this.destino = destino;
        this.horaSalida= horaSalida;

    }

    boolean reservarAsiento(Pasajero p){
        this.asientoReservado = p;
        System.out.println("Reserva realizada con exito!");
        return true;
    }

    boolean reservarAsiento(String nombre, String pasaporte){
        Pasajero pasajero1 = new Pasajero(nombre, pasaporte);
        this.asientoReservado = pasajero1;
        System.out.println("Vuelo reservado para " + nombre);
        return true;
    }

    void cancelarReserva(){
        this.asientoReservado= null;
        System.out.println("Reserva cancelada");
    }

    public String obtenerItinerario(){
        String infoVuelo = "Itinerario del vuelo: \n"+
                "CODIGO: "+ codigoVuelo + "\n"
              +  "DESTINO: " + destino +"\n"
                + "SALIDA: " + horaSalida + "\n";

        if(asientoReservado != null){
            infoVuelo+=  "PASAJERO: " + asientoReservado.nombre;
        } else {
            infoVuelo +=  "PASAJERO: No hay reserva";
        }


        return  infoVuelo;
    };

}
