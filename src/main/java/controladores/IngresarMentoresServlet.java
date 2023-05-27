package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.Mentor;
import datos.MentoresDao;

public class IngresarMentoresServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        try {
	            // Obtener los parámetros del formulario
	            int id_mentor = Integer.parseInt(request.getParameter("id_mentor"));
	            String curp = request.getParameter("curp");
	            String nombre = request.getParameter("nombre");
	            int edad = Integer.parseInt(request.getParameter("edad"));
	            String puesto = request.getParameter("puesto");
	            String especialidad = request.getParameter("especialidad");
	            int tributo_id = Integer.parseInt(request.getParameter("tributo_id"));

	            // Crear un objeto Mentor con los datos ingresados
	            Mentor mentor = new Mentor(id_mentor, curp, nombre, edad, puesto, especialidad, tributo_id);

	            // Crear una instancia de MentoresDao para realizar la inserción
	            MentoresDao mentoresDao = new MentoresDao();

	            // Insertar el mentor en la base de datos
	            mentoresDao.insertarMentor(mentor);

	            // Redirigir a la página de éxito o a la página de vista de mentores
	            response.sendRedirect("formularios/exito.jsp");
	        } catch (Exception e) {
	            e.printStackTrace();
	            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
	            request.setAttribute("error", "Ocurrió un error al ingresar el mentor");
	            request.getRequestDispatcher("formularios/error.jsp").forward(request, response);
	        }
	    }

}