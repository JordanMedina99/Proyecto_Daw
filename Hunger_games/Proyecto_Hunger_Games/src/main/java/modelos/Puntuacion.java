package modelos;

import java.io.Serializable;

public class Puntuacion implements Serializable {
    private static final long serialVersionUID = 1L;
    private int idPuntuacion;
    private int valor;
    private int tributoId;
    private int pruebaId;

    public Puntuacion() {
    }

    public int getIdPuntuacion() {
        return idPuntuacion;
    }

    public void setIdPuntuacion(int idPuntuacion) {
        this.idPuntuacion = idPuntuacion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
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

