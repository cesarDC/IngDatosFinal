package ingdatos.grupo3.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
		String sql="{call PR_insertarDonante(?,?,?,?,?,?,?,?,?,?)}";
		try {						
			cs=conn.prepareCall(sql);	
			
			cs.setInt(1,donante.getDNI());
			cs.setString(2, donante.getNombre());
			cs.setString(3, donante.getApellidoP());
			cs.setString(4, donante.getApellidoM());
			cs.setString(5, donante.getSexo()); 
			cs.setInt(6, donante.getNumTelf());
			cs.setInt(7, donante.getPeso());
			cs.setString(8, donante.getFechaNacimiento());
			cs.setString(9, donante.getEstado());
			cs.setString(10, donante.getIdtipoSangre());
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


	public String modificarDonante(Donante donante) {
		String msg;
		Connection conn = ConexionDAO.conectarse();
		CallableStatement cs=null;
					
		String sql="{call PR_modificarDonante(?,?,?,?,?,?,?,?,?,?)}";
		try {
			
				
			cs=conn.prepareCall(sql);
			
			cs.setInt(1,donante.getDNI());
			cs.setString(2, donante.getNombre());
			cs.setString(3, donante.getApellidoP());
			cs.setString(4, donante.getApellidoM());
			cs.setString(5, donante.getSexo()); 
			cs.setInt(6, donante.getNumTelf());
			cs.setInt(7, donante.getPeso());
			cs.setString(8, donante.getFechaNacimiento());
			cs.setString(9, donante.getEstado());
			cs.setString(10, donante.getIdtipoSangre());
			
			cs.executeUpdate();
			msg="Donante actualizado";
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

	
	public String eliminarDonante(Donante donante) {
		String msg;
		Connection conn = ConexionDAO.conectarse();
		CallableStatement cs=null;
		String sql="{call PR_eliminarDonante(?)}";
		try {
			cs=conn.prepareCall(sql);
			
			cs.setInt(1,donante.getDNI());
			
			cs.executeUpdate();
			msg="Donante eliminado";
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

	
	public List<Donante> listarDonantes(){
		String msg;
		Connection conn = ConexionDAO.conectarse();
		CallableStatement cs=null;
		ResultSet rs=null;
		
		String sql="{call PR_listarDonantes(?)}";
		
		List<Donante> listDonantes = new ArrayList<>();;
		try {
			
			cs=conn.prepareCall(sql);			
			cs.registerOutParameter(1, OracleTypes.CURSOR);
			
			cs.executeQuery();
			rs = (ResultSet)cs.getObject(1);
			while(rs.next()){
				Donante donante= new Donante();
				donante.setDNI(rs.getInt("DNI"));
				donante.setNombre(rs.getString("nombre"));
				donante.setApellidoP(rs.getString("apellidopaterno"));
				donante.setApellidoM(rs.getString("apellidomaterno"));
				donante.setSexo(rs.getString("sexo")); 
				donante.setNumTelf(rs.getInt("numerotelef"));
				donante.setPeso(rs.getInt("peso"));
				donante.setFechaNacimiento("FechaNacimiento");
				donante.setEstado(rs.getString("estado"));
				donante.setIdtipoSangre(rs.getString("idtiposangre"));
				
				listDonantes.add(donante);
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
		return listDonantes;
	}
	
	
	public Donante getDonante(String dni) {
		String msg;
		Connection conn = ConexionDAO.conectarse();
		CallableStatement cs=null;
		
		ResultSet rs=null;
		String sql="{call PR_obtenerDonante(?,?)}";
		Donante donante=new Donante();
		try {
			
			cs=conn.prepareCall(sql);			
			cs.setString(1,dni);
			cs.registerOutParameter(2, OracleTypes.CURSOR);
			cs.executeQuery();
			rs = (ResultSet)cs.getObject(2);
			if(rs.next()){
				donante.setDNI(rs.getInt("DNI"));
				donante.setNombre(rs.getString("nombre"));
				donante.setApellidoP(rs.getString("apellidopaterno"));
				donante.setApellidoM(rs.getString("apellidomaterno"));
				donante.setSexo(rs.getString("sexo")); 
				donante.setNumTelf(rs.getInt("numerotelef"));
				donante.setPeso(rs.getInt("peso"));
				donante.setFechaNacimiento("FechaNacimiento");
				donante.setEstado(rs.getString("estado"));
				donante.setIdtipoSangre(rs.getString("idtiposangre"));
			}else{
				msg="Donante no encontrado";
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
		return donante;
	}
}
