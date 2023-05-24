package modelos;

import java.io.Serializable;

public class Dificultad implements Serializable {
    private static final long serialVersionUID = 1L;
    private String Id_Dificultad;
    private String descripcion;

    public Dificultad(String Id_Dificultad, String descripcion){
    	 this.Id_Dificultad = Id_Dificultad;
    	 this.descripcion = descripcion;
    }

    public String getId_Dificultad() {
        return Id_Dificultad;
    }

    public void setId_Dificultad(String Id_Dificultad) {
        this.Id_Dificultad = Id_Dificultad;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

