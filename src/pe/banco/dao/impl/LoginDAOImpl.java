package pe.banco.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import oracle.jdbc.internal.OracleTypes;
import pe.banco.dao.LoginDAO;
import pe.banco.dto.CentroHospitalario;
import pe.banco.dto.Usuario;

public class LoginDAOImpl implements LoginDAO {
	String message=null;

	@Override
	public Usuario autenticarUsuario(Usuario user) {
		Context initContext;
		Connection conn=null;
		String sql= "{call pkg_extras.info_panel(?,?,?,?)}";
		Usuario usuario = null;
		CentroHospitalario centro=null;
		try {
			initContext=new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/ConexionOracle");
			conn=ds.getConnection();
			CallableStatement cs=conn.prepareCall(sql);
			ResultSet rs;
			ResultSet rs2;
			cs.setString(1, user.getNombreusuario());
			cs.setString(2, user.getPassword());
			cs.registerOutParameter(3, OracleTypes.CURSOR);
			cs.registerOutParameter(4, OracleTypes.CURSOR);
			cs.executeQuery();
			rs = (ResultSet) cs.getObject(3);
			rs2 = (ResultSet) cs.getObject(4);
			while (rs.next() && rs2.next()) {
				usuario = new Usuario();
				usuario.setNombres(rs.getString("nombres"));
				usuario.setApellidomat(rs.getString("apellidomat"));
				usuario.setApellidopat(rs.getString("apellidopat"));
				centro= new CentroHospitalario();
				centro.setNombreC(rs2.getString("nombrecentro"));
				centro.setDistrito(rs2.getString("nombre"));
				centro.setDireccion(rs2.getString("direccion"));
				centro.setTelefono(rs2.getInt("telefono"));
				usuario.setCentroSalud(centro);
			}					
			cs.executeQuery();
		}catch (SQLException ex){
			message=ex.getMessage();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			message=e.getMessage();
		}
		return usuario;
	}

	public String getMessage() {
		return message;
	}

}
