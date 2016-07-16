package ingdatos.grupo3.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ingdatos.grupo3.beans.Prueba;
import ingdatos.grupo3.dao.PruebaDAO;

/**
 * Servlet implementation class PruebasServlet
 */
@WebServlet("/listaPruebas")
public class PruebasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PruebasServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession ses = request.getSession(true);
		
		PruebaDAO pruebasD =new PruebaDAO();
		List<Prueba> lista=pruebasD.listarPruebas();
				
		ses.setAttribute("listaPruebas", lista);
		System.out.println("lista Set");
		String rpta = "listaPruebas.jsp";
	
		RequestDispatcher rd=request.getRequestDispatcher(rpta);		
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
