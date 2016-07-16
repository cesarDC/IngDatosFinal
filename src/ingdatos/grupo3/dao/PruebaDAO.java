package ingdatos.grupo3.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.owlike.genson.Context;

import ingdatos.grupo3.beans.Prueba;

public class PruebaDAO {

	String message;
	
	public String getMessage() {
		return message;
	}

	public String ingresarDonante(Prueba prueba) {
		String msg;
		Connection conn = ConexionDAO.conectarse();
		CallableStatement cs=null;
		String sql="{call PR_insertarPrueba(?,?,?)}";
		try {
						
			cs=conn.prepareCall(sql);
			
			cs.setInt(1,prueba.getIdPrueba());
			cs.setString(2, prueba.getNombre());
			cs.setInt(3, prueba.getEstado());
		
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
	
	public String modificarPrueba(Prueba prueba) {
		Context initContext;
		Connection conn=null;
		CallableStatement cs=null;
		String sql="{call package pkg_Prueba.upd_pruebita (?,?,?)}";
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
}
