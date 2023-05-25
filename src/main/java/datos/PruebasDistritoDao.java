package datos;

import java.util.List;
import modelos.Distrito;


public class PruebasDistritoDao {
	
	/*
	public static void main(String[] args) {
        DistritosDAO distritosDAO = new DistritosDAO();
        try {
            List<Distrito> distritos = distritosDAO.listarDistritos();
            for (Distrito distrito : distritos) {
                System.out.println(distrito.getnombre()); // Imprime el nombre del distrito u otro atributo que desees verificar
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    */
	
	public static void main(String[] args) {
        DistritosDAO distritosDAO = new DistritosDAO();
        try {
            List<Distrito> distritos = distritosDAO.listarDistritos();
            for (Distrito distrito : distritos) {
                System.out.println("ID Distrito: " + distrito.getid_distrito());
                System.out.println("Nombre: " + distrito.getnombre());
                System.out.println("Especialización: " + distrito.getespecializacion());
                System.out.println("Puestos de Trabajo: " + distrito.getpuestos_trabajo());
                System.out.println("Juegos Ganados: " + distrito.getjuegos_ganados());
                System.out.println("Cantidad de Habitantes: " + distrito.getcantidad_habitantes());
                System.out.println("Ubicación: " + distrito.getubicacion());
                System.out.println("Clima: " + distrito.getclima());
                System.out.println("Porcentaje de Hombres: " + distrito.getporcentaje_hombres());
                System.out.println("Porcentaje de Mujeres: " + distrito.getporcentaje_mujeres());
                System.out.println("Líder Nombre: " + distrito.getlider_nombre());
                System.out.println("-------------------------------------------");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
