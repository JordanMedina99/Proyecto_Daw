package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

import modelos.Prueba;
import datos.PruebasDao;

public class VistaPruebasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Crear una instancia de PruebasDao para obtener las pruebas
            PruebasDao pruebasDao = new PruebasDao();

            // Obtener la lista de pruebas
            List<Prueba> pruebas = pruebasDao.listarPruebas();

            // Agregar la lista de pruebas como atributo en el request
            request.setAttribute("pruebas", pruebas);

            // Redirigir a tu página JSP para mostrar las pruebas
            request.getRequestDispatcher("formularios/vista_pruebas.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al obtener las pruebas");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
    
}
