package ingdatos.grupo3.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ingdatos.grupo3.beans.Donante;
import ingdatos.grupo3.beans.Usuario;
import oracle.jdbc.internal.OracleTypes;

public class LoginDAO {
	String message;
			
	public String getMessage() {
		return message;
	}

	
	
	
	public Usuario getDonante(String nickname,String password) {
		String msg;
		Connection conn = ConexionDAO.conectarse();
		CallableStatement cs=null;
		
		ResultSet rs=null;
		String sql="{call PR_obtenerUsuario(?,?,?)}";
		Usuario usuario=new Usuario();
		try {
			cs=conn.prepareCall(sql);			
			cs.setString(1,nickname);	
			cs.setString(2,password);
			cs.registerOutParameter(3, OracleTypes.CURSOR);
			cs.executeQuery();
			rs = (ResultSet)cs.getObject(2);
			if(rs.next()){
				usuario.setIdUsuario(rs.getInt("idUsuario"));
				usuario.setNombreUsuario(rs.getString("nombreUsuario"));
				usuario.setPassword(rs.getString("password"));
				usuario.setTipoEmpleado(rs.getString("tipoEmpleado"));
				usuario.setIdLocal(rs.getInt("idLocal")); 
			}else{
				msg="Usuario no encontrado";
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
		return usuario;
	}
}
