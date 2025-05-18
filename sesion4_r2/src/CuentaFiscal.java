public class CuentaFiscal {
    private String rfc;
    private double saldoDisponible;

    public CuentaFiscal (String rfc, double saldoDisponible){
        this.rfc = rfc;
        if(saldoDisponible>=0){
            this.saldoDisponible = saldoDisponible;
        }else {
            System.out.println("Error al crear cuenta. El saldo no puede ser negativo.");
        }
    }

    public String getRfc(){
        return rfc;
    }

    public double getSaldoDisponible(){
        return  saldoDisponible;
    }

    public boolean validarRFC(DeclaracionImpuestos d){
       return rfc.equals(d.rfcContribuyente());
    }


}
