public class PagoTarjeta extends MetodoPago implements Autenticable{

    double fondos;
    public PagoTarjeta(double monto, double fondos){
        super(monto);
        this.fondos = fondos;
    }
    @Override
    void procesarPago(){
        System.out.println("Procesando pago con tarjeta de: " + monto);
    }

    @Override
    public boolean autenticar(){
        if(monto<=fondos){
            System.out.println("Autenticacion exitosa");
            return true;
        }
        else {
            System.out.println("No se pudo autenticar el pago: Fondos Insuficientes.");
            return false;
        }
    }
}
