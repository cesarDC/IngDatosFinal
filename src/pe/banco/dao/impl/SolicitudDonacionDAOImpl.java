package pe.banco.dao.impl;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;
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

import oracle.jdbc.internal.OracleTypes;
import pe.banco.dao.SolicitudDonacionDAO;
import pe.banco.dto.Local;
import pe.banco.dto.Donante;
import pe.banco.dto.Encuesta;
import pe.banco.dto.Prueba;
import pe.banco.dto.Distrito;
import pe.banco.dto.SolicitudDonacion;
import pe.banco.dto.Usuario;

public class SolicitudDonacionDAOImpl implements SolicitudDonacionDAO {
private String message=null;
	@Override
	public String ingresarSolicitudDon(SolicitudDonacion sold) {
		Context initContext;
		Connection conn=null;
		CallableStatement cs=null;
		String sql= "{call pkg_solicituddon.reg_solicituddon(?,?,?)}";
		try {
			initContext=new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/ConexionOracle");
			conn=ds.getConnection();
			cs = conn.prepareCall(sql);
			cs.setString(1, sold.getDnidon());
			cs.setInt(2, sold.getIdusuario());			
			cs.setString(3, sold.getDnipac());
			cs.executeQuery();
			message="Solicitud de donación registrada";
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
	public String modificarSolicitudDon(SolicitudDonacion sold) {
		Context initContext;
		Connection conn=null;
		CallableStatement cs=null;
		String sql= "{call pkg_solicituddon.upd_solicituddon(?,?,?,?,?,?)}";
		try {
			initContext=new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/ConexionOracle");
			conn=ds.getConnection();
			cs = conn.prepareCall(sql);
			cs.setInt(1, sold.getIdsolicitudDon());
			cs.setInt(2, sold.getIdencuesta());
			cs.setString(3, sold.getDnidon());
			cs.setInt(4, sold.getIdanalisis());
			cs.setInt(5, sold.getIdusuario());
			cs.setString(6, sold.getDnipac());			
			cs.executeQuery();
			message="Solicitud de unidad de sangre modificada";
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
	public String eliminarSolicitudDon(Integer id) {
		Context initContext;
		Connection conn=null;
		CallableStatement cs=null;
		String sql= "{call pkg_solicituddon.del_solicituddon(?)}";
		try {
			initContext=new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/ConexionOracle");
			conn=ds.getConnection();
			cs = conn.prepareCall(sql);
			cs.setInt(1, id);
			cs.executeUpdate();
			message="Solicitud de unidad de sangre elimnada";
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
	public SolicitudDonacion getSolicitudDon(Integer id) {
		Context initContext;
		Connection conn=null;
		SolicitudDonacion sol=null;
		CallableStatement cs = null;
		ResultSet rs=null;
		String sql= "{call pkg_solicitud.obtener_sol_u_sangre_cm(?,?)}";
		Usuario user=null;
		Blob blobAnalisis;
		Blob blobEncuesta;
		Local analisis;
		Encuesta encuesta;
		byte [] pdfEncuestaData;
		byte [] pdfAnalisisData;
		try {
			initContext=new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/ConexionOracle");
			conn=ds.getConnection();
			cs = conn.prepareCall(sql);
			
			cs.setInt(1, id);
			cs.registerOutParameter(2, OracleTypes.CURSOR);
			cs.executeQuery();
			rs= (ResultSet)cs.getObject(2);
			if(rs.next()){
				sol=new SolicitudDonacion();
				sol.setIdsolicitudDon(rs.getInt(1));
				
				encuesta=new Encuesta();
				blobEncuesta=rs.getBlob(2);
				pdfEncuestaData=blobEncuesta.getBytes(1, (int) blobEncuesta.length());
								
				analisis=new Local();
				blobAnalisis=rs.getBlob(3);
				pdfAnalisisData=blobAnalisis.getBytes(1, (int) blobAnalisis.length());
								
				sol.setDnidon(rs.getString(4));
				sol.setFechadon(rs.getString(5));
				sol.setDnipac(rs.getString(6));
				
				user=new Usuario();
				user.setNombres(rs.getString(7));
				user.setApellidopat(rs.getString(8));
				user.setApellidomat(rs.getString(9));
				
				sol.setUsuario(user);				
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
	public List<SolicitudDonacion> listarSolicitudDon(Integer idCentroMed) {
		Context initContext;
		Connection conn = null;
		CallableStatement cs=null;
		ResultSet rs=null;
		SolicitudDonacion sol=null;
		Prueba pac=null;
		Donante don=null;
		Usuario user=null;
		List<SolicitudDonacion> list = null;
		String sql= "{call pkg_solicitud.lista_sol_don_cm(?,?)}";
		try {
			initContext=new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/ConexionOracle");
			conn=ds.getConnection();
			cs = conn.prepareCall(sql);
			
			cs.setInt(1, idCentroMed);
			cs.registerOutParameter(2, OracleTypes.CURSOR);
			cs.executeQuery();
			rs= (ResultSet)cs.getObject(2);
			list = new LinkedList<SolicitudDonacion>();
			while(rs.next()){
				sol=new SolicitudDonacion();
				sol.setIdsolicitudDon(rs.getInt(1));
				sol.setDnidon(rs.getString(2));
				
				don=new Donante();
				don.setDnidon(rs.getString(2));
				don.setNombres(rs.getString(3));
				don.setApellidopat(rs.getString(4));
				don.setApellidomat(rs.getString(5));
				sol.setDonante(don);
				
				sol.setFechadon(rs.getString(6));
				
				pac=new Prueba();
				pac.setNombres(rs.getString(7));
				pac.setApellidopat(rs.getString(8));
				pac.setApellidomat(rs.getString(9));
				sol.setPaciente(pac);
				
				user=new Usuario();
				user.setNombres(rs.getString(10));
				user.setApellidopat(rs.getString(11));
				user.setApellidomat(rs.getString(12));
				sol.setUsuario(user);
			
				list.add(sol);
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
		return list;
	}

	public String getMessage() {
		return message;
	}
	
}
