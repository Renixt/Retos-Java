import java.util.Optional;

/*Diseñar una clase Factura aplicando los principios de
 encapsulación con modificadores de acceso y utilizando la
 clase Optional para manejar valores que pueden ser nulos,
 como el RFC del cliente.
modelar una factura sencilla, que contenga los datos básicos de
 una compra y, opcionalmente, el RFC del cliente. Se deberá proteger
  el acceso a los atributos y permitir el uso seguro de null a través de
  Optional*/
public class Main {
    public static void main(String[] args) {

        Factura factura1 = new Factura(100.00,"Tacos", Optional.of("rfc124"));
        Factura factura2 = new Factura(750.00, "Suscripción mensual", Optional.empty());
        System.out.println(factura1.getResumen());
        System.out.println(factura2.getResumen());
    }
}