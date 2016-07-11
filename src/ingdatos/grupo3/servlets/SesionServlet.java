package ingdatos.grupo3.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ingdatos.grupo3.beans.Usuario;
import ingdatos.grupo3.dao.LoginDAO;

@WebServlet("/login")
public class SesionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SesionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String usuario = request.getParameter("user");
		String password = request.getParameter("pass");
		Usuario user = new Usuario();
		
		LoginDAO daoLogin = new LoginDAO();
		//user = daoLogin.autenticarUsuario(user);
					
					
		String rpta = "index.jsp";    		
		RequestDispatcher rd = request.getRequestDispatcher(rpta);
		rd.forward(request, response);
		}
	}


