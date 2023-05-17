package modelos;

import java.io.Serializable;

public class Mentor implements Serializable{
	private static final long serialVersionUID = 1L;
	private int idMentor;
    private String curp;
    private String nombre;
    private int edad;
    private String puesto;
    private String especialidad;
    private int tributoId;
   
    public int getIdMentor() {
		return idMentor;
	}
	public void setIdMentor(int idMentor) {
		this.idMentor = idMentor;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public int getTributoId() {
		return tributoId;
	}
	public void setTributoId(int tributoId) {
		this.tributoId = tributoId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
