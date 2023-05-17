package modelos;

import java.io.Serializable;

public class Entrenamiento implements Serializable {
    private static final long serialVersionUID = 1L;
    private int idEntrenamiento;
    private int tributoId;
    private int pruebaId;

    public Entrenamiento() {
    }

    public int getIdEntrenamiento() {
        return idEntrenamiento;
    }

    public void setIdEntrenamiento(int idEntrenamiento) {
        this.idEntrenamiento = idEntrenamiento;
    }

    public int getTributoId() {
        return tributoId;
    }

    public void setTributoId(int tributoId) {
        this.tributoId = tributoId;
    }

    public int getPruebaId() {
        return pruebaId;
    }

    public void setPruebaId(int pruebaId) {
        this.pruebaId = pruebaId;
    }
}

