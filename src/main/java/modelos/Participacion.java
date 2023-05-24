package modelos;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

public class Participacion implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id_participacion;
    private Date fecha;
    private Time tiempo_empleado;
    private int tributo_id;
    private int prueba_id;

    public Participacion(int id_participacion, Date fecha, Time tiempo_empleado, int tributo_id, int prueba_id) {
    	this.id_participacion = id_participacion;
        this.fecha = fecha;
        this.tiempo_empleado = tiempo_empleado;
        this.tributo_id = tributo_id;
        this.prueba_id = prueba_id;
    }

    public int getid_participacion() {
        return id_participacion;
    }

    public void setid_participacion(int id_participacion) {
        this.id_participacion = id_participacion;
    }

    public Date getfecha() {
        return fecha;
    }

    public void setfecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time gettiempo_empleado() {
        return tiempo_empleado;
    }

    public void settiempo_empleado(Time tiempo_empleado) {
        this.tiempo_empleado = tiempo_empleado;
    }

    public int gettributo_id() {
        return tributo_id;
    }

    public void settributo_id(int tributo_id) {
        this.tributo_id = tributo_id;
    }

    public int getprueba_id() {
        return prueba_id;
    }

    public void setpruebaId(int prueba_id) {
        this.prueba_id = prueba_id;
    }
}
