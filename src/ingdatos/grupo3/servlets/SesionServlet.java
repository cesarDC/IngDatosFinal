package ingdatos.grupo3.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ingdatos.grupo3.beans.CentroSalud;
import ingdatos.grupo3.beans.Usuario;
import ingdatos.grupo3.dao.LoginDAOImpl;
import pe.banco.dao.LoginDAO;

/**
 * Servlet implementation class SesionServlet
 */
@WebServlet("/sesion")
public class SesionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SesionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String result = null;
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		Usuario user = new Usuario();
		String accion = request.getParameter("accion");
		if (accion == null) {
			result = "Solicitud no recibida";
		} else if (accion.equals("LOGIN")) {
			user.setNombreusuario(usuario);
			user.setPassword(password);
			if ((usuario == null) || (usuario.trim().length() == 0)) {
				result = "Usuario Incorrecto";
			}

			if (result == null) {
				if ((password == null) || (password.trim().length() == 0)) {
					result = "Password Incorrecto";
				}
				if (result == null) {
					LoginDAO daoLogin = new LoginDAOImpl();
					// user = daoLogin.autenticarUsuario(user);
					CentroSalud cs = new CentroSalud();
					cs.setNombreC("holi");
					cs.setDireccion("Av.Holi");
					cs.setDistrito("Holilandia");
					cs.setTelefono(213124);
					user.setCentroSalud(cs);
					user.setTipoempleado("Holiador");
					user.setNombreusuario("Bambino Pons");
					user.setApellidopat("reholi");
					user.setApellidomat("holi");
					user.setNombres("pablito");
					user.setIdusuario(123);
					
					if (user == null) {
						result = "Usuario no Registrado";
					} else {
						final String ID = request.getSession().getId();
						request.getSession().setAttribute("ID", ID);
						request.getSession().setAttribute("usuario", user);
						result = "sesion.jsp";
					}
				}
			}
		}else if(accion.equals("LOGOUT")) {
            request.getSession().removeAttribute("ID");
            request.getSession().removeAttribute("usuario");
            request.getSession().removeAttribute("autorizacion");
            request.getSession().invalidate();

            result = "login.jsp";

        } else {
            result = "Solicitud no reconocida";
        }
		if (result != null) {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.print(result);
			out.close();
		}

	}

}
