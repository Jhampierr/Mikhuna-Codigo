
package Model;

import java.time.LocalDate;

public class Factura {
    private Pedido pedido;
    private LocalDate fechaD;
    
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public LocalDate getFechaD() {
        return fechaD;
    }

    public void setFechaD(LocalDate fechaD) {
        this.fechaD = fechaD;
    }
    
}
