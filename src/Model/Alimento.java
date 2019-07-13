
package Model;

import java.time.LocalDate;

public class Alimento {
    private String codigoA;
    private String nombreA;
    private double precio;
    private LocalDate ultimaEdicion;
    private TipoAlimento tipoAli;

    public String getCodigoA() {
        return codigoA;
    }

    public void setCodigoA(String codigoA) {
        this.codigoA = codigoA;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getUltimaEdicion() {
        return ultimaEdicion;
    }

    public void setUltimaEdicion(LocalDate ultimaEdicion) {
        this.ultimaEdicion = ultimaEdicion;
    }

    public TipoAlimento getTipoAli() {
        return tipoAli;
    }

    public void setTipoAli(TipoAlimento tipoAli) {
        this.tipoAli = tipoAli;
    }

    public Alimento(String codigoA, String nombreA, double precio, LocalDate ultimaEdicion, TipoAlimento tipoAli) {
        this.codigoA = codigoA;
        this.nombreA = nombreA;
        this.precio = precio;
        this.ultimaEdicion = ultimaEdicion;
        this.tipoAli = tipoAli;
    }
    
    
}
