public class PagoEfectivo extends MetodoPago implements Autenticable{

    public PagoEfectivo(double monto){
        super(monto);
    }
    @Override
    void procesarPago(){
        System.out.println("Procesando pago en efectivo de: " + monto);
    }

    @Override
   public boolean autenticar(){
        System.out.println("Autenticacion exitosa");
        return true;
    }
}
