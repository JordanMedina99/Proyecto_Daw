package modelos;

import java.io.Serializable;

public class Tributo implements Serializable {
    private static final long serialVersionUID = 1L;
    private int idTributo;
    private String curp;
    private String nombre;
    private String sexo;
    private int edad;
    private String habilidad;
    private int espectaculoPuntuacion;
    private int distritoId;

    public Tributo() {
    }

    public int getIdTributo() {
        return idTributo;
    }

    public void setIdTributo(int idTributo) {
        this.idTributo = idTributo;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public int getEspectaculoPuntuacion() {
        return espectaculoPuntuacion;
    }

    public void setEspectaculoPuntuacion(int espectaculoPuntuacion) {
        this.espectaculoPuntuacion = espectaculoPuntuacion;
    }

    public int getDistritoId() {
        return distritoId;
    }

    public void setDistritoId(int distritoId) {
        this.distritoId = distritoId;
    }
}
