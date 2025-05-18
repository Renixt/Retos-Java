public class Main {
    public static void main(String[] args) {

        DeclaracionImpuestos di1 = new DeclaracionImpuestos("rfc1",250.00);
        CuentaFiscal cf1 = new CuentaFiscal("rfc1",100.00);

        System.out.println("Declaracion enviada por " + di1.rfcContribuyente() + " por " + di1.montoDeclarado());
        System.out.println("Cuenta fiscal registrada con " + cf1.getRfc() + ", saldo disp de " + cf1.getSaldoDisponible());

        System.out.println("¿RFC valido para esta cuenta? " + cf1.validarRFC(di1));
    }
}