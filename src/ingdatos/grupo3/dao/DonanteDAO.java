package ingdatos.grupo3.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import ingdatos.grupo3.beans.Donante;
import oracle.jdbc.internal.OracleTypes;

public class DonanteDAO {
	String message;
			
	public String getMessage() {
		return message;
	}

	public String ingresarDonante(Donante donante) {
		String msg;
		Connection conn = ConexionDAO.conectarse();
		CallableStatement cs=null;
		String sql="{call PR_insertarDonante(?,?,?,?,?,?,?)}";
		try {
						
			cs=conn.prepareCall(sql);
			
			cs.setInt(1,donante.getDNI());
			cs.setString(2, donante.getNombre());
			cs.setString(3, donante.getApellido());
			cs.setString(4, donante.getSexo()); 
			cs.setInt(5, donante.getNumTelf());
			cs.setInt(6, donante.getPeso());
			cs.setString(7, donante.getfechaNacimiento());
			//cs.setString(7, donante.getfechaNacimiento());
			cs.executeUpdate();
			msg="Donante registrado";
		}catch (SQLException ex){
			msg=ex.getMessage();
	
		} finally {
			try {
				if(cs !=null){
					cs.close();
				}
				if(conn !=null){
					conn.close();
				}
			} catch (SQLException ex){
				msg=ex.getMessage();
			}
			
		}
		return msg;
	}
/*

	public String modificarDonante(Donante donante) {
		Context initContext;
		Connection conn=null;
		CallableStatement cs=null;
		String sql="{call package pkg_donantex.upd_donante (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		try {
			initContext=new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/ConexionOracle");
			conn=ds.getConnection();
			cs=conn.prepareCall(sql);
			cs.setString(1,donante.getDnidon());
			cs.setString(2, donante.getNombres());
			cs.setString(3, donante.getApellidopat());
			cs.setString(4, donante.getApellidomat());
			cs.setString(5, donante.getTiposangre()); 
			cs.setString(6, donante.getCorreo());
			cs.setString(7, donante.getTipodonante().toString());
			cs.setString(8, donante.getDireccion());
			cs.setInt(9, donante.getIddistrito());
			cs.setInt(10, donante.getTelefono());
			cs.setString(11, donante.getFechanac());
			cs.setInt(12, donante.getEdad());
			cs.setInt(13, donante.getCelular());
			cs.setString(14, donante.getEstado().toString());
			cs.setString(15,donante.getDetalleveto());
			cs.executeUpdate();
			message="Donante actualizado";
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
	
	*/

	
	public String eliminarDonante(Donante donante) {
		Context initContext;
		Connection conn=null;
		CallableStatement cs=null;
		String sql="{call package pkg_donantex.del_donante (?)}";
		try {
			initContext=new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/ConexionOracle");
			conn=ds.getConnection();
			cs=conn.prepareCall(sql);
			cs.setString(1,donante.getDnidon());
			cs.executeUpdate();
			message="Donante eliminado";
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
/*
	
	public List<Donante> listarDonantes(){
		Context initContext;
		Connection conn=null;
		CallableStatement cs=null;
		ResultSet rs=null;
		String sql="{call package pkg_donantex.lista_donantes (?)}";
		List<Donante> listDonantes = new ArrayList<>();;
		try {
			initContext=new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/ConexionOracle");
			conn=ds.getConnection();
			cs=conn.prepareCall(sql);			
			cs.registerOutParameter(1, OracleTypes.CURSOR);
			cs.executeQuery();
			rs = (ResultSet)cs.getObject(1);
			while(rs.next()){
				Donante donante= new Donante();
				donante.setDnidon(rs.getString("dnidon"));
				donante.setNombres(rs.getString("nombres"));
				donante.setApellidopat(rs.getString("apellidopat"));
				donante.setApellidomat(rs.getString("apellidomat"));
				donante.setTiposangre(rs.getString("tiposangre")); 
				donante.setCorreo(null);
				donante.setTipodonante(rs.getString("tipodonante").charAt(0));
				donante.setDireccion(null);
				donante.setIddistrito(0);
				donante.setDistrito(null);
				donante.setTelefono(0);
				donante.setFechanac(null);
				donante.setEdad(0);
				donante.setCelular(0);
				donante.setEstado(rs.getString("estado").charAt(0));
				donante.setDetalleveto(null);
				listDonantes.add(donante);
			}
		}catch (SQLException ex){
			message=ex.getMessage();			
		} catch (NamingException e) {
			message=e.getMessage();
			// TODO Auto-generated catch block		
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
		return listDonantes;
	}
	
	
	public Donante getDonante(String dnidon) {
		Context initContext;
		Connection conn=null;
		CallableStatement cs=null;
		ResultSet rs=null;
		String sql="{call package pkg_donantex.obtener_donante (?,?)}";
		Donante donante=new Donante();
		try {
			initContext=new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/ConexionOracle");
			conn=ds.getConnection();
			cs=conn.prepareCall(sql);			
			cs.setString(1,dnidon);
			cs.registerOutParameter(2, OracleTypes.CURSOR);
			cs.executeQuery();
			rs = (ResultSet)cs.getObject(2);
			if(rs.next()){
				donante.setDnidon(rs.getString("dnidon"));
				donante.setNombres(rs.getString("nombres"));
				donante.setApellidopat(rs.getString("apellidopat"));
				donante.setApellidomat(rs.getString("apellidomat"));
				donante.setTiposangre(rs.getString("tiposangre")); 
				donante.setCorreo(rs.getString("correo"));
				donante.setTipodonante(rs.getString("tipodonante").charAt(0));
				donante.setDireccion(rs.getString("direccion"));
				donante.setIddistrito(rs.getInt("iddistrito"));
				donante.setDistrito(rs.getString("nombre"));
				donante.setTelefono(rs.getInt("telefono"));
				donante.setFechanac(rs.getString("fechanac"));
				donante.setEdad(rs.getInt("edad"));
				donante.setCelular(rs.getInt("celular"));
				donante.setEstado(rs.getString("estado").charAt(0));
				donante.setDetalleveto(rs.getString("detalleveto"));
			}else{
				message="Donante no encontrado";
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
		return donante;
	}

*/
}
