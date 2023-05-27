package modelos;

import java.io.Serializable;

public class Mentor implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id_mentor;
    private String curp;
    private String nombre;
    private int edad;
    private String puesto;
    private String especialidad;
    private int tributo_id;
   
    public Mentor(int id_mentor, String curp, String nombre, int edad, String puesto, String especialidad, int tributo_id) {
        this.id_mentor = id_mentor;
        this.curp = curp;
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;
        this.especialidad = especialidad;
        this.tributo_id = tributo_id;
    }
    public int getid_mentor() {
		return id_mentor;
	}
	public void setid_mentor(int id_mentor) {
		this.id_mentor = id_mentor;
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
	public String getespecialidad() {
		return especialidad;
	}
	public void setespecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public int gettributo_id() {
		return tributo_id;
	}
	public void settributo_id(int tributo_id) {
		this.tributo_id = tributo_id;
	}
	
   

}
