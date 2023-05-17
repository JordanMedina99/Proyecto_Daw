package modelos;

import java.io.Serializable;

public class Distrito implements Serializable {
    private static final long serialVersionUID = 1L;
    private int idDistrito;
    private String nombre;
    private String especializacion;
    private int puestosTrabajo;
    private int juegosGanados;
    private int cantidadHabitantes;
    private String ubicacion;
    private String clima;
    private float porcentajeHombres;
    private float porcentajeMujeres;
    private String liderNombre;
    
    public Distrito() {
        
    }

    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public int getPuestosTrabajo() {
        return puestosTrabajo;
    }

    public void setPuestosTrabajo(int puestosTrabajo) {
        this.puestosTrabajo = puestosTrabajo;
    }

    public int getJuegosGanados() {
        return juegosGanados;
    }

    public void setJuegosGanados(int juegosGanados) {
        this.juegosGanados = juegosGanados;
    }

    public int getCantidadHabitantes() {
        return cantidadHabitantes;
    }

    public void setCantidadHabitantes(int cantidadHabitantes) {
        this.cantidadHabitantes = cantidadHabitantes;
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

    public String getLiderNombre() {
        return liderNombre;
    }

    public void setLiderNombre(String liderNombre) {
        this.liderNombre = liderNombre;
    }
}

