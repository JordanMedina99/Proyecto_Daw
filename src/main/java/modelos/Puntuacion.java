package modelos;

import java.io.Serializable;

public class Puntuacion implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id_puntuacion;
    private int valor;
    private int tributo_id;
    private int prueba_id;

    public Puntuacion(int id_puntuacion, int valor, int tributo_id, int prueba_id){
    	this.id_puntuacion = id_puntuacion;
        this.valor = valor;
        this.tributo_id = tributo_id;
        this.prueba_id = prueba_id;
    }

    public int getid_puntuacion() {
        return id_puntuacion;
    }

    public void setid_puntuacion(int id_puntuacion) {
        this.id_puntuacion = id_puntuacion;
    }

    public int getvalor() {
        return valor;
    }

    public void setvalor(int valor) {
        this.valor = valor;
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

    public void setprueba_id(int prueba_id) {
        this.prueba_id = prueba_id;
    }
}

