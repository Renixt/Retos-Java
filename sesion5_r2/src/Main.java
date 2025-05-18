public class Main {
    public static void main(String[] args) {
        MetodoPago[] pagos = new MetodoPago[3];
        pagos[0] = new PagoEfectivo(500);
        pagos[1] = new PagoTarjeta(520,1000);
        pagos[2] = new PagoTransferencia(100, false);

       for(MetodoPago pago : pagos){
        if (pago instanceof Autenticable autenticable){ //Esto verifica si el objeto pago es una instancia de una clase que implementa la interfaz Autenticable
            if (autenticable.autenticar()) { //Llamas al metodo autenticar() que solo está disponible en la interfaz Autenticable.
                    pago.procesarPago();
                    pago.mostrarResumen();

                }


        }
        };
    }
}