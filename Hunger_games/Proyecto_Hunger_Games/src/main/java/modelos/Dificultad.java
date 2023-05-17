package modelos;

import java.io.Serializable;

public class Dificultad implements Serializable {
    private static final long serialVersionUID = 1L;
    private String idDificultad;
    private String descripcion;

    public Dificultad() {
    }

    public String getIdDificultad() {
        return idDificultad;
    }

    public void setIdDificultad(String idDificultad) {
        this.idDificultad = idDificultad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

