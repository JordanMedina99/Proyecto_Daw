package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.Capitolio;
import datos.CapitolioDao;
import java.util.List;


public class VistaCapitolioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        try {
	            // Crear una instancia de CapitolioDao para obtener los capitolios
	            CapitolioDao capitolioDao = new CapitolioDao();

	            // Obtener la lista de capitolios
	            List<Capitolio> capitolios = capitolioDao.listarCapitolios();

	            // Agregar la lista de capitolios como atributo en el request
	            request.setAttribute("capitolios", capitolios);

	            // Redirigir a tu página JSP para mostrar los capitolios
	            request.getRequestDispatcher("formularios/vista_capitolio.jsp").forward(request, response);
	        } catch (Exception e) {
	            e.printStackTrace();
	            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
	            request.setAttribute("error", "Ocurrió un error al obtener los capitolios");
	            request.getRequestDispatcher("error.jsp").forward(request, response);
	        }
	    }
}
