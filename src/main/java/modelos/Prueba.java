package modelos;


import java.io.Serializable;
import java.sql.Time;

public class Prueba implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id_prueba;
    private String codigo;
    private String nombre;
    private String tipo;
    private String dificultad_id;
    private int vencedor_id;
    private Time tiempo_empleado;

    public Prueba(int id_prueba, String codigo, String nombre, String tipo, String dificultad_id, int vencedor_id, Time tiempo_empleado){
    	this.id_prueba = id_prueba;
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.dificultad_id = dificultad_id;
        this.vencedor_id = vencedor_id;
        this.tiempo_empleado = tiempo_empleado;
    }

    public int getid_prueba() {
        return id_prueba;
    }

    public void setid_prueba(int id_prueba) {
        this.id_prueba = id_prueba;
    }

    public String getcodigo() {
        return codigo;
    }

    public void setcodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String gettipo() {
        return tipo;
    }

    public void settipo(String tipo) {
        this.tipo = tipo;
    }

    public String getdificultad_id() {
        return dificultad_id;
    }

    public void setdificultad_id(String dificultad_id) {
        this.dificultad_id = dificultad_id;
    }

    public int getvencedor_id() {
        return vencedor_id;
    }

    public void setvencedor_id(int vencedor_id) {
        this.vencedor_id = vencedor_id;
    }

    public Time gettiempo_empleado() {
        return tiempo_empleado;
    }

    public void settiempo_empleado(Time tiempo_empleado) {
        this.tiempo_empleado = tiempo_empleado;
    }
}
