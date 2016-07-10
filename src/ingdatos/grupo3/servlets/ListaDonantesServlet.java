package ingdatos.grupo3.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ingdatos.grupo3.beans.Donante;
import ingdatos.grupo3.dao.DonanteDAOImpl;

/**
 * Servlet implementation class ListaDonantesServlet
 */
@WebServlet("/listaDonantes")
public class ListaDonantesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaDonantesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DonanteDAOImpl donanteDAOImpl=new DonanteDAOImpl();
		List<Donante> lista=donanteDAOImpl.listarDonantes();
		String msg=donanteDAOImpl.getMessage();
		RequestDispatcher rd;
		if(lista.isEmpty()){
			rd=request.getRequestDispatcher("confirmar.jsp");			
			request.setAttribute("msg", msg);			
		}else{
			rd=request.getRequestDispatcher("listaDonantes.jsp");
			request.setAttribute("listaDonantes", lista);
		}
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
