package modelos;

import java.io.Serializable;

public class Capitolio implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id_capitolio;
    private String nombre_presidente;
    private int numero_habitantes;
    private String ubicacion;
    private String clima;
    private float porcentaje_hombres;
    private float porcentaje_mujeres;
    private String lugares_interes;

    public Capitolio(int id_capitolio, String nombre_presidente, int numero_habitantes, String ubicacion, String clima, float porcentaje_hombres, float porcentaje_mujeres, String lugares_interes){
    	 this.id_capitolio = id_capitolio;
    	 this.nombre_presidente = nombre_presidente;
    	 this.numero_habitantes = numero_habitantes;
    	 this.ubicacion = ubicacion;
    	 this.clima = clima;
    	 this.porcentaje_hombres = porcentaje_hombres;
    	 this.porcentaje_mujeres = porcentaje_mujeres;
    	 this.lugares_interes = lugares_interes;
    	 
    }

    public int getid_capitolio() {
        return id_capitolio;
    }

    public void setid_capitolio(int id_capitolio) {
        this.id_capitolio = id_capitolio;
    }

    public String getnombre_presidente() {
        return nombre_presidente;
    }

    public void setnombre_presidente(String nombre_presidente) {
        this.nombre_presidente = nombre_presidente;
    }

    public int getnumero_habitantes() {
        return numero_habitantes;
    }

    public void setnumero_habitantes(int numero_habitantes) {
        this.numero_habitantes = numero_habitantes;
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

    public String getlugares_interes() {
        return lugares_interes;
    }

    public void setlugares_interes(String lugares_interes) {
        this.lugares_interes = lugares_interes;
    }
}

