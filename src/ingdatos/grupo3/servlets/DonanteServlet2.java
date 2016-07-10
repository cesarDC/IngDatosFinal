package ingdatos.grupo3.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ingdatos.grupo3.beans.Donante;
import ingdatos.grupo3.dao.DonanteDAO;

/**
 * Servlet implementation class DonanteServlet2
 */
@WebServlet("/donante2")
public class DonanteServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DonanteServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dniDon=request.getParameter("dnidon");
		DonanteDAO donanteDAOImpl=new DonanteDAO();
		donanteDAOImpl.eliminarDonante(dniDon);
		String msg=donanteDAOImpl.getMessage();
		RequestDispatcher rd=request.getRequestDispatcher("confirmar.jsp");
		request.setAttribute("msg", msg);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DonanteDAO donanteDAOImpl=new DonanteDAO();
		String nombre=request.getParameter("nombre");
		String apellidop=request.getParameter("apellidop");
		String apellidom=request.getParameter("apellidom");
		String tipoSangre=request.getParameter("tipoSangre");
		String correo=request.getParameter("email");
		Character tipoDonante=request.getParameter("tipoDonante").charAt(0);
		Integer idDistrito=Integer.parseInt(request.getParameter("distrito"));
		String direccion=request.getParameter("direccion");
		Integer edad=Integer.parseInt(request.getParameter("edad"));
		String fechaNac=request.getParameter("fechaNac");
		Integer telefono=Integer.parseInt(request.getParameter("telefono"));
		Integer celular=Integer.parseInt(request.getParameter("celular"));
		String dni=request.getParameter("dni");
		Character estado=request.getParameter("estado").charAt(0);
		String detalleVeto=request.getParameter("detalle");
		
		Donante donante=new Donante(dni, nombre, apellidop, apellidom, tipoSangre, 
				correo, tipoDonante, direccion, idDistrito, null, telefono, fechaNac, 
				edad, celular, estado, detalleVeto);
		donanteDAOImpl.modificarDonante(donante);
		String msg=donanteDAOImpl.getMessage();
		RequestDispatcher rd=request.getRequestDispatcher("confirmar.jsp");
		request.setAttribute("msg", msg);
		rd.forward(request, response);
		
	}

}
