package ingdatos.grupo3.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import ingdatos.grupo3.beans.CentroHospitalario;
import ingdatos.grupo3.beans.Usuario;
import oracle.jdbc.internal.OracleTypes;

public class LoginDAO{
	String message=null;
	
	private Connection conectarse(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			return DriverManager.getConnection(
					"jdbc:oracle:thin:@friccio.com:1521:XE", "usuario4",
					"oracle");
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	
	public Usuario autenticarUsuario(Usuario user) {
		
		Connection conn = conectarse();
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("execute ");
			List<Profesor> profesores = new ArrayList<Profesor>();
			while(rs.next()){
				profesores.add(new Profesor(
						rs.getInt("id"),
						rs.getString("nombres"),
						rs.getString("apellido_paterno"),
						rs.getString("apellido_materno"),
						rs.getString("dni"),
						rs.getString("foto_url"),
						rs.getInt("id_estudio"),
						nombreEst(rs.getInt("id_estudio"))
				));
			}
			conn.close();
			return profesores;
		} catch (SQLException e) {
			e.printStackTrace();
			conn.close();
			return null;
		}
	}

	public String getMessage() {
		return message;
	}

}
