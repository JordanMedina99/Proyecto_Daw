package datos;
import java.util.List;
import modelos.Distrito;

public class DistritosDAOTest2 {
	
	public static void main(String[] args) {
        testListarDistritos();
    }

    public static void testListarDistritos() {
        DistritosDAO distritosDAO = new DistritosDAO();
        try {
            List<Distrito> distritos = distritosDAO.listarDistritos();
            for (Distrito distrito : distritos) {
                System.out.println(distrito.getnombre());
                System.out.println(distrito.getcantidad_habitantes());
                System.out.println(distrito.getclima());
                System.out.println(distrito.getjuegos_ganados());
                System.out.println(distrito.getporcentaje_hombres());
                System.out.println(distrito.getporcentaje_mujeres());// Imprime el nombre del distrito u otro atributo que desees verificar
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
        }

     }
}