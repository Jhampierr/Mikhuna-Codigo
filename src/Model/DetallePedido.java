
package Model;

import java.time.LocalDate;
import java.util.List;

public class DetallePedido {
    private LocalDate fechaHoraInicio;
    private LocalDate fechaHoraCocinado;
    private int cantAlimento;
    private List<Alimento> alimentos;

    public LocalDate getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(LocalDate fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public LocalDate getFechaHoraCocinado() {
        return fechaHoraCocinado;
    }

    public void setFechaHoraCocinado(LocalDate fechaHoraCocinado) {
        this.fechaHoraCocinado = fechaHoraCocinado;
    }

    public int getCantAlimento() {
        return cantAlimento;
    }

    public void setCantAlimento(int cantAlimento) {
        this.cantAlimento = cantAlimento;
    }

    public List<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(List<Alimento> alimentos) {
        this.alimentos = alimentos;
    }
    
}
