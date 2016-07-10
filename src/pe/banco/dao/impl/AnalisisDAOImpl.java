package pe.banco.dao.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import pe.banco.dao.AnalisisDAO;
import pe.banco.dto.Local;

public class AnalisisDAOImpl implements AnalisisDAO{
	private String message=null;
	
	
	public String getMessage() {
		return message;
	}

	@Override
	public String ingresarAnalisis(Local analisis) {
		Context initContext;
		Connection conn = null;
		CallableStatement cs=null;
		String sql= "{call pkg_pdf.reg_analisis(?,?,?,?,?)}";
		try {
			initContext = new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/ConexionOracle");
			conn = ds.getConnection();
			cs = conn.prepareCall(sql);
			cs.setString(1, analisis.getDnidon());
			cs.setInt(2, analisis.getIdmuestra());
			cs.setString(3, analisis.getEstado().toString());
			cs.setString(4, analisis.getFecha());
			
			File pdf=new File(analisis.getRutaAnalisis());
			FileInputStream fis=new FileInputStream(pdf);			
			cs.setBlob(5, fis, pdf.length());
			cs.executeUpdate();
			conn.commit();
			message="Análisis registrado";
		} catch (SQLException ex) {
			message=ex.getMessage();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			message=e.getMessage();
		} catch (FileNotFoundException f) {
			// TODO Auto-generated catch block
			message=f.getMessage();
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
