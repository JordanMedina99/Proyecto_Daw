package controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.Distrito;
import datos.DistritosDAO;



public class VistaDistritosServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Crear una instancia de DistritosDAO para obtener los distritos
            DistritosDAO distritosDAO = new DistritosDAO();

            // Obtener la lista de distritos
            List<Distrito> distritos = distritosDAO.listarDistritos();

            // Agregar la lista de distritos como atributo en el request
            request.setAttribute("distritos", distritos);

            // Redirigir a tu página JSP para mostrar los distritos
            request.getRequestDispatcher("formularios/vista_distritos.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción y mostrar un mensaje de error si es necesario
            request.setAttribute("error", "Ocurrió un error al obtener los distritos");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
}
        


