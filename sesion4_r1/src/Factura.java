import java.util.Objects;
public class Factura {
    String folio;
    String cliente;
    double total;

    public Factura(String folio, String cliente, double total){
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura [folio=" +folio +" cliente=" +cliente + " total=" + total+ "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Mismo objeto
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura otro = (Factura) obj;
        return this.folio.equals(otro.folio);
    }
}
