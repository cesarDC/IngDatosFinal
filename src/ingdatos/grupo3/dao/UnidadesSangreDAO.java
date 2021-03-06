package ingdatos.grupo3.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import ingdatos.grupo3.beans.BolsaSangre;

public class UnidadesSangreDAO  {

	public String ingresarUnidadSangre() {
		Context initContext;
		Connection conn=null;
		try {
			initContext=new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/ConexionOracle");
			conn=ds.getConnection();
		}catch (SQLException ex){
			ex.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String modificarUnidadSangre() {
		Context initContext;
		Connection conn=null;
		try {
			initContext=new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/ConexionOracle");
			conn=ds.getConnection();
		}catch (SQLException ex){
			ex.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public UnidadesSangreDAO getUnidadSangre(Integer idUnidad) {
		Context initContext;
		Connection conn=null;
		try {
			initContext=new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/ConexionOracle");
			conn=ds.getConnection();
		}catch (SQLException ex){
			ex.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<BolsaSangre> listarUnidades(Integer idCentro, String tipo) {
		Context initContext;
		Connection conn=null;
		try {
			initContext=new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/ConexionOracle");
			conn=ds.getConnection();
		}catch (SQLException ex){
			ex.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
