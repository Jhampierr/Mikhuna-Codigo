
package Model;

public class Factura {
    private String codigoF;
    private double subtotalF;
    private double igv;
    private double pagoFinalF;
    private Pedido dPedido;
    
    public String getCodigoF() {
        return codigoF;
    }

    public void setCodigoF(String codigoF) {
        this.codigoF = codigoF;
    }

    public double getSubtotalF() {
        return subtotalF;
    }

    public void setSubtotalF(double subtotalF) {
        this.subtotalF = subtotalF;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getPagoFinalF() {
        return pagoFinalF;
    }

    public void setPagoFinalF(double pagoFinalF) {
        this.pagoFinalF = pagoFinalF;
    }

    public Pedido getdPedido() {
        return dPedido;
    }

    public void setdPedido(Pedido dPedido) {
        this.dPedido = dPedido;
    }
    
}
