public class Main {
    public static void main(String[] args) {

        Factura factura1 = new Factura("1","Renata",52.00);
        Factura factura2 = new Factura("2","Camila",53.00);

        System.out.println(factura1.toString());
        System.out.println(factura2.toString());

        System.out.println("¿Son iguales? " + factura2.equals(factura1));  // true
    }
}