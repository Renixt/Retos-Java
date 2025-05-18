public class PagoTransferencia extends MetodoPago implements Autenticable{


    boolean bancoAut;

    public PagoTransferencia (double monto, boolean bancoAut){
        super(monto);
        this.bancoAut = bancoAut;
    }
    @Override
    void procesarPago(){
        System.out.println("Procesando pago con transferencua de: " + monto);
    }

    @Override
    public boolean autenticar(){
        if(bancoAut){
            System.out.println("Autenticacion exitosa");
            return true;
        }
        else {
            System.out.println("No se pudo autenticar el pago: fallo de autenticacion.");
            return false;
        }
    }
}
