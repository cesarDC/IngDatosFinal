package ingdatos.grupo3.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import ingdatos.grupo3.beans.Distrito;
import ingdatos.grupo3.beans.Prueba;
import ingdatos.grupo3.beans.Usuario;
import oracle.jdbc.internal.OracleTypes;
import pe.banco.dao.SolicitudDAO;

public class SolicitudDAOImpl implements SolicitudDAO {
	private String message=null;

	@Override
	public String ingresarSolicitud(Distrito sol) {
		Context initContext;
		Connection conn=null;
		CallableStatement cs=null;
		String sql= "{call pkg_solicitud.reg_solicitud_unidad(?,?,?,?,?)}";
		try {
			initContext=new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/ConexionOracle");
			conn=ds.getConnection();
			cs = conn.prepareCall(sql);
			cs.setInt(1, sol.getIdusuario());
			cs.setString(2, String.valueOf(sol.getEstado()));
			cs.setString(3, String.valueOf(sol.getPrioridad()));
			cs.setString(4, String.valueOf(sol.getDnipac()));
			cs.setString(5, sol.getFechaentrega());			
			cs.executeUpdate();
			message="Solicitud de unidad de sangre registrada";
		}catch (SQLException ex){
			message=ex.getMessage();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			message=e.getMessage();
		} finally {
			try {
				if(cs !=null){
					cs.close();
				}
				if(conn !=null){
					conn.close();
				}
			} catch (SQLException ex){
				message=ex.getMessage();
			}
			
		}
		return message;
	}

	@Override
	public String modificarSolicitud(Distrito sol) {
		Context initContext;
		Connection conn=null;
		CallableStatement cs=null;
		String sql= "{call pkg_solicitud.upd_solicitud_unidad(?,?,?,?,?)}";
		try {
			initContext=new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/ConexionOracle");
			conn=ds.getConnection();
			cs = conn.prepareCall(sql);
			cs.setInt(1, sol.getIdsolicitud());
			cs.setString(2, String.valueOf(sol.getEstado()));
			cs.setString(3, String.valueOf(sol.getPrioridad()));
			cs.setString(4, String.valueOf(sol.getDnipac()));
			cs.setString(5, sol.getFechaentrega());			
			cs.executeUpdate();
			message="Solicitud de unidad de sangre modificada";
		}catch (SQLException ex){
			message=ex.getMessage();
		} catch (NamingException e) {
			message=e.getMessage();
		} finally {
			try {
				if(cs !=null){
					cs.close();
				}
				if(conn !=null){
					conn.close();
				}
			} catch (SQLException ex){
				message=ex.getMessage();
			}
			
		}
		return message;
	}

	@Override
	public String eliminarSolicitud(Integer idSol) {
		Context initContext;
		Connection conn=null;
		CallableStatement cs=null;
		String sql= "{call pkg_solicitud.del_solicitud_unidad(?)}";
		try {
			initContext=new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/ConexionOracle");
			conn=ds.getConnection();
			cs = conn.prepareCall(sql);
			cs.setInt(1, idSol);
			cs.executeUpdate();
			message="Solicitud de unidad de sangre eliminada";
		}catch (SQLException ex){
			message=ex.getMessage();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			message=e.getMessage();
		} finally {
			try {
				if(cs !=null){
					cs.close();
				}
				if(conn !=null){
					conn.close();
				}
			} catch (SQLException ex){
				message=ex.getMessage();
			}
			
		}
		return message;
	}

	@Override
	public Distrito getSolicitud(Integer idSol) {
		Context initContext;
		Connection conn=null;
		Distrito sol=null;
		Usuario user=null;
		CallableStatement cs=null;
		ResultSet rs=null;
		String sql= "{call pkg_solicitud.obtener_sol_u_sangre_cm(?,?)}";
		try {
			initContext=new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/ConexionOracle");
			conn=ds.getConnection();
			cs = conn.prepareCall(sql);
			
			cs.setInt(1, idSol);
			cs.registerOutParameter(2, OracleTypes.CURSOR);
			cs.executeQuery();
			rs= (ResultSet)cs.getObject(2);
			if(rs.next()){
				sol=new Distrito();
				sol.setIdsolicitud(rs.getInt(1));
				sol.setEstado(rs.getString(2).charAt(0));
				sol.setPrioridad(rs.getString(3).charAt(0));
				sol.setDnipac(rs.getString(4));
				sol.setFechaentrega(rs.getString(5));
				sol.setFechapedido(rs.getString(6));
				
				user=new Usuario();
				user.setNombres(rs.getString(7));
				user.setApellidopat(rs.getString(8));
				user.setApellidomat(rs.getString(9));
				sol.setUsuario(user);
			}else{
				message="Solicitud de unidad de sangre no encontrada";
			}			
		}catch (SQLException ex){
			message=ex.getMessage();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			message=e.getMessage();
		} finally {
			try {
				if(rs!=null){
					rs.close();
				}
				if(cs !=null){
					cs.close();
				}
				if(conn !=null){
					conn.close();
				}
			} catch (SQLException ex){
				message=ex.getMessage();
			}
			
		}
		return sol;
	}

	@Override
	public List<Distrito> listarSolicitud(Integer idCentroSalud) {
		Context initContext;
		Connection conn=null;
		CallableStatement cs=null;
		ResultSet rs=null;
		String sql= "{call pkg_solicitud.lista_sol_u_sangre_cm(?,?)}";
		List<Distrito> lista=null;
		Distrito sol = null;
		Prueba pac=null;
		Usuario user=null;
		try {
			initContext=new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/ConexionOracle");
			conn=ds.getConnection();
			cs = conn.prepareCall(sql);
			
			cs.setInt(1, idCentroSalud);
			cs.registerOutParameter(2, OracleTypes.CURSOR);
			cs.executeQuery();
			rs= (ResultSet)cs.getObject(2);
			lista = new LinkedList<>();
			while(rs.next()){
				sol=new Distrito();
				sol.setIdsolicitud(rs.getInt(1));
				sol.setDnipac(rs.getString(2));
				
				pac=new Prueba();
				pac.setDnipac(rs.getString(2));
				pac.setNombres(rs.getString(3));
				pac.setApellidopat(rs.getString(4));
				pac.setApellidomat(rs.getString(5));
				
				sol.setPaciente(pac);
				sol.setEstado(rs.getString(6).charAt(0));
				sol.setFechaentrega(rs.getString(7));
				sol.setFechapedido(rs.getString(8));
				
				user=new Usuario();
				user.setNombres(rs.getString(9));
				user.setApellidopat(rs.getString(10));
				user.setApellidomat(rs.getString(11));
				
				sol.setUsuario(user);				
				
				lista.add(sol);
			}
		}catch (SQLException ex){
			message=ex.getMessage();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			message=e.getMessage();
		} finally {
			try {
				if(rs!=null){
					rs.close();
				}
				if(cs !=null){
					cs.close();
				}
				if(conn !=null){
					conn.close();
				}
			} catch (SQLException ex){
				message=ex.getMessage();
			}
			
		}
		return lista;
	}

	public String getMessage() {
		return message;
	}


}
