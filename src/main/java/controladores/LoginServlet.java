package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.login_usuarios.User;
import java.util.*;
/**
 * Servlet implementation class LoginServlet
 
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
*/
//@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        List<User> userList = User.getUsers();

        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                request.getSession().setAttribute("username", username);
                String role = user.getRole();
                String jspPath = "/formularios/" + role + ".jsp";
                request.getRequestDispatcher(jspPath).forward(request, response);
                return;
            }
        }

        // Si no se encontró un usuario válido, mostrar mensaje de error
        request.setAttribute("error", "Credenciales inválidas");
        //request.getRequestDispatcher("/formularios/error.jsp").forward(request, response);
        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);

    }
}
