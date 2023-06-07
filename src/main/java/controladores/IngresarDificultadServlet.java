package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.Dificultad;
import datos.DificultadDao;

public class IngresarDificultadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Obtener los parámetros del formulario
            String idDificultad = request.getParameter("id_dificultad");
            String descripcion = request.getParameter("descripcion");

            // Crear un objeto Dificultad con los datos ingresados
            Dificultad dificultad = new Dificultad(idDificultad, descripcion);

            // Crear una instancia de DificultadDao para realizar la inserción
            DificultadDao dificultadDao = new DificultadDao();

            // Insertar la dificultad en la base de datos
            dificultadDao.insertarDificultad(dificultad);

            // Redirigir a la página de éxito o a la página de vista de dificultades
            response.sendRedirect("formularios/exito.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al ingresar la dificultad");
            request.getRequestDispatcher("formularios/error.jsp").forward(request, response);
        }
    }

}
