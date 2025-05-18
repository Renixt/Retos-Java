abstract class MetodoPago {
    double monto;

    public MetodoPago(double monto){
        this.monto = monto;
    }

    abstract void procesarPago();

    public void mostrarResumen(){
        System.out.println("Tipo: " + this.getClass().getSimpleName() + " Monto:" + monto);
    }

}
