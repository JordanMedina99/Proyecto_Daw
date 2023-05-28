package modelos;

import java.io.Serializable;

public class Vigilante implements Serializable{
   
	 private static final long serialVersionUID = 1L;
	    private int id_vigilante;
	    private String curp;
	    private String nombre;
	    private String sexo;
	    private int edad;
	    private String puesto;

	    public Vigilante(int id_vigilante, String curp, String nombre, String sexo, int edad, String puesto) {
	        this.id_vigilante = id_vigilante;
	        this.curp = curp;
	        this.nombre = nombre;
	        this.sexo = sexo;
	        this.edad = edad;
	        this.puesto = puesto;
	    }

	    public int getid_vigilante() {
	        return id_vigilante;
	    }

	    public void setid_vigilante(int id_vigilante) {
	        this.id_vigilante = id_vigilante;
	    }

	    public String getcurp() {
	        return curp;
	    }

	    public void setcurp(String curp) {
	        this.curp = curp;
	    }

	    public String getnombre() {
	        return nombre;
	    }

	    public void setnombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getsexo() {
	        return sexo;
	    }

	    public void setsexo(String sexo) {
	        this.sexo = sexo;
	    }

	    public int getedad() {
	        return edad;
	    }

	    public void setedad(int edad) {
	        this.edad = edad;
	    }

	    public String getpuesto() {
	        return puesto;
	    }

	    public void setpuesto(String puesto) {
	        this.puesto = puesto;
	    }
}
