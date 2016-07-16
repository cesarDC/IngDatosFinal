package ingdatos.grupo3.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ingdatos.grupo3.beans.Donante;
import ingdatos.grupo3.beans.Prueba;
import oracle.jdbc.internal.OracleTypes;

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
		String msg;
		Connection conn = ConexionDAO.conectarse();
		CallableStatement cs=null;
					
		String sql="{call package pkg_pruebax.upd_prueba (?,?,?)}";
		try {
			
				
			cs=conn.prepareCall(sql);
			
			cs.setInt(1,prueba.getIdPrueba());
			cs.setString(2, prueba.getNombre());
			cs.setInt(3, prueba.getEstado());
			
			cs.executeUpdate();
			msg="Prueba actualizada";
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

	
	public String eliminarPrueba(Prueba prueba) {
		String msg;
		Connection conn = ConexionDAO.conectarse();
		CallableStatement cs=null;
		String sql="{call package pkg_pruebax.del_prueba (?)}";
		try {
			cs=conn.prepareCall(sql);
			
			cs.setInt(1,prueba.getIdPrueba());
			
			cs.executeUpdate();
			msg="Prueba eliminada";
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

	
	public List<Prueba> listarPruebas(){
		String msg;
		Connection conn = ConexionDAO.conectarse();
		CallableStatement cs=null;
		ResultSet rs=null;
		
		String sql="{call package pkg_pruebax.lista_pruebas (?)}";
		
		List<Prueba> listPruebas = new ArrayList<>();;
		try {
			
			cs=conn.prepareCall(sql);			
			cs.registerOutParameter(1, OracleTypes.CURSOR);
			
			cs.executeQuery();
			rs = (ResultSet)cs.getObject(1);
			while(rs.next()){
				Prueba prueba= new Prueba();
				prueba.setIdPrueba(rs.getInt("idPrueba"));
				prueba.setNombre(rs.getString("NombrePrueba"));
				prueba.setEstado(rs.getInt("Estado"));
				
				listPruebas.add(prueba);
			}
		}catch (SQLException ex){
			msg=ex.getMessage();			
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
				msg=ex.getMessage();
			}
			
		}
		return listPruebas;
	}
	
	
	public Prueba getPrueba(int idPrueba) {
		String msg;
		Connection conn = ConexionDAO.conectarse();
		CallableStatement cs=null;
		
		ResultSet rs=null;
		String sql="{call package pkg_pruebax.obtener_prueba (?,?)}";
		Prueba prueba=new Prueba();
		try {
			cs=conn.prepareCall(sql);			
			cs.setInt(1,idPrueba);
			cs.registerOutParameter(2, OracleTypes.CURSOR);
			cs.executeQuery();
			rs = (ResultSet)cs.getObject(2);
			if(rs.next()){
				prueba.setIdPrueba(rs.getInt("idPrueba"));
				prueba.setNombre(rs.getString("NombrePrueba"));
				prueba.setEstado(rs.getInt("Estado"));
			}else{
				message="Prueba no encontrada";
			}
		}catch (SQLException ex){
			message=ex.getMessage();
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
		return prueba;
	}
	
	
}
