package modelos;


import java.io.Serializable;
import java.sql.Time;

public class Prueba implements Serializable {
    private static final long serialVersionUID = 1L;
    private int idPrueba;
    private String codigo;
    private String nombre;
    private String tipo;
    private String dificultadId;
    private int vencedorId;
    private Time tiempoEmpleado;

    public Prueba() {
    }

    public int getIdPrueba() {
        return idPrueba;
    }

    public void setIdPrueba(int idPrueba) {
        this.idPrueba = idPrueba;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDificultadId() {
        return dificultadId;
    }

    public void setDificultadId(String dificultadId) {
        this.dificultadId = dificultadId;
    }

    public int getVencedorId() {
        return vencedorId;
    }

    public void setVencedorId(int vencedorId) {
        this.vencedorId = vencedorId;
    }

    public Time getTiempoEmpleado() {
        return tiempoEmpleado;
    }

    public void setTiempoEmpleado(Time tiempoEmpleado) {
        this.tiempoEmpleado = tiempoEmpleado;
    }
}
