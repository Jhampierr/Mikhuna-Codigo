
package Model;

public class DetallePedido extends Pedido{
    private double total;
    private int cantAlimento;
    private Alimento dalimentos;
    private Pedido dpedido;

    public Pedido getDpedido() {
        return dpedido;
    }

    public void setDpedido(Pedido dpedido) {
        this.dpedido = dpedido;
    }

    public Alimento getDalimentos() {
        return dalimentos;
    }

    public void setDalimentos(Alimento dalimentos) {
        this.dalimentos = dalimentos;
    }

    public int getCantAlimento() {
        return cantAlimento;
    }

    public void setCantAlimento(int cantAlimento) {
        this.cantAlimento = cantAlimento;
    }
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
