package controladores;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.Distrito;
import datos.DistritosDAO;
/**
 * Servlet implementation class VistaDistritosServlet
 */
public class VistaDistritosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public VistaDistritosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Crear una instancia de DistritosDAO para obtener los distritos
            DistritosDAO distritosDAO = new DistritosDAO();

            // Obtener la lista de distritos
            List<Distrito> distritos = distritosDAO.listarDistritos();

            // Guardar la lista de distritos en el objeto request
            request.setAttribute("distritos", distritos);

            // Redirigir a tu página JSP
            request.getRequestDispatcher("formularios/vista_distritos.jsp").forward(request, response);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al obtener los distritos");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
        

}
