
package Model;

import java.time.LocalDate;

public class Pedido {
    private String codigoP;
    private LocalDate fechaHoraP;
    private Mesa dmesa;
    private String direccionP;
    private Cliente dcliente;
    private Empleado dempleado;
    private EstadoPedido estadoPed;
    private LocalDate fechaHoraC;
    private double  montoP;

    public double getMontoP() {
        return montoP;
    }

    public void setMontoP(double montoP) {
        this.montoP = montoP;
    }

    public LocalDate getFechaHoraC() {
        return fechaHoraC;
    }

    public void setFechaHoraC(LocalDate fechahoraC) {
        this.fechaHoraC = fechahoraC;
    }
    
    
    public LocalDate getFechaHoraP() {
        return fechaHoraP;
    }

    public void setFechahoraP(LocalDate fechahoraP) {
        this.fechaHoraP = fechahoraP;
    }
    
    public Mesa getDmesa() {
        return dmesa;
    }

    public void setDmesa(Mesa dmesa) {
        this.dmesa = dmesa;
    }

    public EstadoPedido getEstadoPed() {
        return estadoPed;
    }

    public void setEstadoPed(EstadoPedido estadoPed) {
        this.estadoPed = estadoPed;
    }

    public String getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(String codigoP) {
        this.codigoP = codigoP;
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
