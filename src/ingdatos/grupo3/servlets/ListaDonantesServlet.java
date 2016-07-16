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

import ingdatos.grupo3.beans.Donante;
import ingdatos.grupo3.dao.DonanteDAO;

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
		
		HttpSession ses = request.getSession(true);
		
		DonanteDAO donanteD=new DonanteDAO();
		List<Donante> lista=donanteD.listarDonantes();
				
		ses.setAttribute("listaDonantes", lista);
		System.out.println("lista Set");
		String rpta = "listaDonantes.jsp";
	
		RequestDispatcher rd=request.getRequestDispatcher(rpta);		
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession ses = request.getSession(true);
		DonanteDAO donanteD=new DonanteDAO();
		
		
		int dni = Integer.parseInt(request.getParameter("dni"));
		String nombres = request.getParameter("nombre");		
		String apellido_parterno = request.getParameter("aPaterno");
		String apellido_materno = request.getParameter("aMaterno");
		String sexo = request.getParameter("Sexo");
		String tipoSangre = request.getParameter("tipoSangre");
		int telf = Integer.parseInt(request.getParameter("telefono"));
		String fechaNac = request.getParameter("fechaNac");
		int peso= Integer.parseInt(request.getParameter("peso"));
		
		Donante don = new Donante(dni, nombres, apellido_parterno, apellido_materno, sexo,telf , peso, fechaNac, "Apto", tipoSangre);
		
		donanteD.ingresarDonante(don);
		System.out.println("Ingreso");
		String rpta = "listaDonantes.jsp";
		RequestDispatcher rd=request.getRequestDispatcher(rpta);		
		rd.forward(request, response);
		
	}
	
	}


