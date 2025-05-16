/*Diseñar un sistema básico de reservas de vuelo aplicando
los fundamentos de la Programación Orientada a Objetos en Java.
Practicarás la creación de clases y objetos, el uso de atributos static
y final, así como la definición de métodos con parámetros y valores
de retorno.*/
/* Tu nuevo desafío es simular un sistema donde un pasajero puede
reservar un asiento en un vuelo, consultar su itinerario y cancelar
 la reserva si así lo desea.*/
public class Main {
    public static void main(String[] args) {

        Pasajero pasajero1 = new Pasajero("Renata", "MEX2003");
        Vuelo vuelo1 = new Vuelo("Paris","14:30");

        System.out.println("Reservar asiento de " + pasajero1.nombre + " en el vuelo " +vuelo1.codigoVuelo);
        vuelo1.reservarAsiento(pasajero1);


        System.out.println(vuelo1.obtenerItinerario());

        vuelo1.cancelarReserva();

        System.out.println(vuelo1.obtenerItinerario());

        vuelo1.reservarAsiento("SARA","MEX2120");

        System.out.println(vuelo1.obtenerItinerario());
    }
}