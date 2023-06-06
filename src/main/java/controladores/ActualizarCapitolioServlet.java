package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import datos.CapitolioDao;
import modelos.Capitolio;

public class ActualizarCapitolioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Obtener los parámetros del formulario
            int id_capitolio = Integer.parseInt(request.getParameter("id_capitolio"));
            String nombre_presidente = request.getParameter("nombre_presidente");
            int numero_habitantes = Integer.parseInt(request.getParameter("numero_habitantes"));
            String ubicacion = request.getParameter("ubicacion");
            String clima = request.getParameter("clima");
            float porcentaje_hombres = Float.parseFloat(request.getParameter("porcentaje_hombres"));
            float porcentaje_mujeres = Float.parseFloat(request.getParameter("porcentaje_mujeres"));
            String lugares_interes = request.getParameter("lugares_interes");

            // Crear un objeto Capitolio con los datos actualizados
            Capitolio capitolio = new Capitolio(id_capitolio, nombre_presidente, numero_habitantes, ubicacion, clima, porcentaje_hombres, porcentaje_mujeres, lugares_interes);

            // Crear una instancia de CapitolioDao para realizar la actualización
            CapitolioDao capitolioDao = new CapitolioDao();

            // Actualizar el capitolio en la base de datos
            capitolioDao.actualizarCapitolio(capitolio);

            // Redirigir a la página de éxito o a la página de vista de capitolios
            response.sendRedirect("formularios/exito.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al actualizar el capitolio");
            request.getRequestDispatcher("formularios/error.jsp").forward(request, response);
        }
    }
}
