package modelos;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

public class Participacion implements Serializable {
    private static final long serialVersionUID = 1L;
    private int idParticipacion;
    private Date fecha;
    private Time tiempoEmpleado;
    private int tributoId;
    private int pruebaId;

    public Participacion() {
    }

    public int getIdParticipacion() {
        return idParticipacion;
    }

    public void setIdParticipacion(int idParticipacion) {
        this.idParticipacion = idParticipacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getTiempoEmpleado() {
        return tiempoEmpleado;
    }

    public void setTiempoEmpleado(Time tiempoEmpleado) {
        this.tiempoEmpleado = tiempoEmpleado;
    }

    public int getTributoId() {
        return tributoId;
    }

    public void setTributoId(int tributoId) {
        this.tributoId = tributoId;
    }

    public int getPruebaId() {
        return pruebaId;
    }

    public void setPruebaId(int pruebaId) {
        this.pruebaId = pruebaId;
    }
}
