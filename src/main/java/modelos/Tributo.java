package modelos;

import java.io.Serializable;

public class Tributo implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id_tributo;
    private String curp;
    private String nombre;
    private String sexo;
    private int edad;
    private String habilidad;
    private int espectaculo_puntuacion;
    private int distrito_id;
    //private Distrito distrito; // Nuevo atributo Distrito

    public Tributo(int id_tributo, String curp, String nombre, String sexo, int edad, String habilidad, int espectaculo_puntuacion, int distrito_id){
    	this.id_tributo = id_tributo;
        this.curp = curp;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.habilidad = habilidad;
        this.espectaculo_puntuacion = espectaculo_puntuacion;
        this.distrito_id = distrito_id;
    }

    public int getid_tributo() {
        return id_tributo;
    }

    public void setid_tributo(int id_tributo) {
        this.id_tributo = id_tributo;
    }

    public String getcurp() {
        return curp;
    }

    public void setcurp(String curp) {
        this.curp = curp;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getsexo() {
        return sexo;
    }

    public void setsexo(String sexo) {
        this.sexo = sexo;
    }

    public int getedad() {
        return edad;
    }

    public void setedad(int edad) {
        this.edad = edad;
    }

    public String gethabilidad() {
        return habilidad;
    }

    public void sethabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public int getespectaculo_puntuacion() {
        return espectaculo_puntuacion;
    }

    public void setespectaculo_puntuacion(int espectaculo_puntuacion) {
        this.espectaculo_puntuacion = espectaculo_puntuacion;
    }

    public int getdistrito_id() {
        return distrito_id;
    }

    public void setdistrito_id(int distrito_id) {
        this.distrito_id = distrito_id;
    }
    /*
    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }
    */
}
