package modelos;

import java.io.Serializable;

public class Capitolio implements Serializable {
    private static final long serialVersionUID = 1L;
    private int idCapitolio;
    private String nombrePresidente;
    private int numeroHabitantes;
    private String ubicacion;
    private String clima;
    private float porcentajeHombres;
    private float porcentajeMujeres;
    private String lugaresInteres;

    public Capitolio() {
    }

    public int getIdCapitolio() {
        return idCapitolio;
    }

    public void setIdCapitolio(int idCapitolio) {
        this.idCapitolio = idCapitolio;
    }

    public String getNombrePresidente() {
        return nombrePresidente;
    }

    public void setNombrePresidente(String nombrePresidente) {
        this.nombrePresidente = nombrePresidente;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public float getPorcentajeHombres() {
        return porcentajeHombres;
    }

    public void setPorcentajeHombres(float porcentajeHombres) {
        this.porcentajeHombres = porcentajeHombres;
    }

    public float getPorcentajeMujeres() {
        return porcentajeMujeres;
    }

    public void setPorcentajeMujeres(float porcentajeMujeres) {
        this.porcentajeMujeres = porcentajeMujeres;
    }

    public String getLugaresInteres() {
        return lugaresInteres;
    }

    public void setLugaresInteres(String lugaresInteres) {
        this.lugaresInteres = lugaresInteres;
    }
}

