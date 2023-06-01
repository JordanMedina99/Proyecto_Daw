package modelos;

import java.io.Serializable;

public class Entrenamiento implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id_entrenamiento;
    private int tributo_id;
    private int prueba_id;

    public Entrenamiento(int id_entrenamiento, int tributo_id, int prueba_id){
    	this.id_entrenamiento = id_entrenamiento;
    	this.tributo_id = tributo_id;
    	this.prueba_id = prueba_id;
    }

    public int getid_entrenamiento() {
        return id_entrenamiento;
    }

    public void setid_entrenamiento(int id_entrenamiento) {
        this.id_entrenamiento = id_entrenamiento;
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

