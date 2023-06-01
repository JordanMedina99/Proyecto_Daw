package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import modelos.Dificultad;
import datos.DificultadDao;

public class VistaDificultadesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Crear una instancia de DificultadDao para obtener las dificultades
            DificultadDao dificultadDao = new DificultadDao();

            // Obtener la lista de dificultades
            List<Dificultad> dificultades = dificultadDao.listarDificultades();

            // Agregar la lista de dificultades como atributo en el request
            request.setAttribute("dificultades", dificultades);

            // Redirigir a tu página JSP para mostrar las dificultades
            request.getRequestDispatcher("formularios/vista_dificultades.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al obtener las dificultades");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
}
