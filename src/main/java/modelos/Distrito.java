package modelos;

import java.io.Serializable;

public class Distrito implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id_distrito;
    private String nombre;
    private String especializacion;
    private int puestos_trabajo;
    private int juegos_ganados;
    private int cantidad_habitantes;
    private String ubicacion;
    private String clima;
    private float porcentaje_hombres;
    private float porcentaje_mujeres;
    private String lider_nombre;
    
    public Distrito(int id_distrito, String nombre, String especializacion, int puestos_trabajo, int juegos_ganados,int cantidad_habitantes, String ubicacion, String clima, float porcentaje_hombres,float porcentaje_mujeres, String lider_nombre){
    	this.id_distrito = id_distrito;
        this.nombre = nombre;
        this.especializacion = especializacion;
        this.puestos_trabajo = puestos_trabajo;
        this.juegos_ganados = juegos_ganados;
        this.cantidad_habitantes = cantidad_habitantes;
        this.ubicacion = ubicacion;
        this.clima = clima;
        this.porcentaje_hombres = porcentaje_hombres;
        this.porcentaje_mujeres = porcentaje_mujeres;
        this.lider_nombre = lider_nombre;
        
    }

    public int getid_distrito() {
        return id_distrito;
    }

    public void setid_distrito(int id_distrito) {
        this.id_distrito = id_distrito;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getespecializacion() {
        return especializacion;
    }

    public void setespecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public int getpuestos_trabajo() {
        return puestos_trabajo;
    }

    public void setpuestos_trabajo(int puestos_trabajo) {
        this.puestos_trabajo = puestos_trabajo;
    }

    public int getjuegos_ganados() {
        return juegos_ganados;
    }

    public void setjuegos_ganados(int juegos_ganados) {
        this.juegos_ganados = juegos_ganados;
    }

    public int getcantidad_habitantes() {
        return cantidad_habitantes;
    }

    public void setcantidad_habitantes(int cantidad_habitantes) {
        this.cantidad_habitantes = cantidad_habitantes;
    }

    public String getubicacion() {
        return ubicacion;
    }

    public void setubicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getclima() {
        return clima;
    }

    public void setclima(String clima) {
        this.clima = clima;
    }

    public float getporcentaje_hombres() {
        return porcentaje_hombres;
    }

    public void setporcentaje_hombres(float porcentaje_hombres) {
        this.porcentaje_hombres = porcentaje_hombres;
    }

    public float getporcentaje_mujeres() {
        return porcentaje_mujeres;
    }

    public void setporcentaje_mujeres(float porcentaje_mujeres) {
        this.porcentaje_mujeres = porcentaje_mujeres;
    }

    public String getlider_nombre() {
        return lider_nombre;
    }

    public void setlider_nombre(String lider_nombre) {
        this.lider_nombre = lider_nombre;
    }
}

