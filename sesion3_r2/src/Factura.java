import java.util.Optional;

public class Factura {
    private double monto;
    private String descripcion;
    private Optional<String> rfc = Optional.empty();

    public Factura(double monto, String descripcion, Optional<String> rfc){
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = rfc;
    }

    public String getResumen(){
        String resumen = "-Factura- \n" +
                "MONTO: " + monto + "\n"+
                "DESCRIPCION: " + descripcion + "\n";

        if (rfc.isPresent()){
            resumen += "RFC: " + rfc.get();
        }else {
            resumen += "RFC: [No proporcionado]";
        };

        return resumen;
    }
}
