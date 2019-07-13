
package Model;

import java.time.LocalDate;

public class Empleado extends Persona{
    private String codigoE;
    private String clave;
    private String direccionE;
    private LocalDate fechaVinculacion;
    private TipoEmpleado tipoEmp;

    public String getCodigoE() {
        return codigoE;
    }

    public void setCodigoE(String codigoE) {
        this.codigoE = codigoE;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDireccionE() {
        return direccionE;
    }

    public void setDireccionE(String direccionE) {
        this.direccionE = direccionE;
    }

    public LocalDate getFechaVinculacion() {
        return fechaVinculacion;
    }

    public void setFechaVinculacion(LocalDate fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }

    public TipoEmpleado getTipoEmp() {
        return tipoEmp;
    }

    public void setTipoEmp(TipoEmpleado tipoEmp) {
        this.tipoEmp = tipoEmp;
    }

}
