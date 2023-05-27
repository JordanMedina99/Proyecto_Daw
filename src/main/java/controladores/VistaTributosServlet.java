package controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.Tributo;
import datos.TributosDao;

public class VistaTributosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        try {
	            // Crear una instancia de TributoDAO para obtener los tributos
	            TributosDao tributosDao = new TributosDao();

	            // Obtener la lista de tributos
	            List<Tributo> tributos = tributosDao.listarTributos();

	            // Agregar la lista de tributos como atributo en el request
	            request.setAttribute("tributos", tributos);

	            // Redirigir a tu página JSP para mostrar los tributos
	            request.getRequestDispatcher("formularios/vista_tributos.jsp").forward(request, response);
	        } catch (Exception e) {
	            e.printStackTrace();
	            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
	            request.setAttribute("error", "Ocurrió un error al obtener los tributos");
	            request.getRequestDispatcher("error.jsp").forward(request, response);
	        }
	    }
    

}
