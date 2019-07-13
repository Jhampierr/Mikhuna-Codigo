
package Model;

import java.time.LocalDate;

public class Factura {
    private String numeroF;
    private LocalDate fecha;
    private Pedido pedido;

    public String getNumeroF() {
        return numeroF;
    }

    public void setNumeroF(String numeroF) {
        this.numeroF = numeroF;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Pedido getPedido() {
        return pedido;
    }
    
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
}
