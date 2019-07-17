
package Model;

public class Pedido {
    private String codigoP;
    private String mesa;
    private String direccionP;
    private Cliente dcliente;
    private Empleado dempleado;
    private EstadoPedido estadoPed;

    public String getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(String codigoP) {
        this.codigoP = codigoP;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public String getDireccionP() {
        return direccionP;
    }

    public void setDireccionP(String direccionP) {
        this.direccionP = direccionP;
    }

    public Cliente getDcliente() {
        return dcliente;
    }

    public void setDcliente(Cliente dcliente) {
        this.dcliente = dcliente;
    }

    public Empleado getDempleado() {
        return dempleado;
    }

    public void setDempleado(Empleado dempleado) {
        this.dempleado = dempleado;
    }
}
