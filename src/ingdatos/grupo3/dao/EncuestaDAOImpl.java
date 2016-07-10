package ingdatos.grupo3.dao;

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

import ingdatos.grupo3.beans.Encuesta;
import pe.banco.dao.EncuestaDAO;

public class EncuestaDAOImpl implements EncuestaDAO{
	private String message=null;

	public String getMessage() {
		return message;
	}
	@Override
	public String ingresarEncuesta(Encuesta encuesta) {
		Context initContext;
		Connection conn = null;
		CallableStatement cs=null;
		String sql= "{call pkg_pdf.reg_encuesta(?,?,?,?)}";
		try {
			initContext = new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/ConexionOracle");
			conn = ds.getConnection();
			cs=conn.prepareCall(sql);
			cs.setString(1, encuesta.getDnidon());
			cs.setString(2, encuesta.getFecha());
			cs.setString(3, encuesta.getEstado().toString());
			File pdf=new File(encuesta.getRutaEncuesta());
			FileInputStream fis=new FileInputStream(pdf);
			cs.setBlob(4, fis, pdf.length());
			cs.executeUpdate();
			conn.commit();
			message="Encuesta registrada";
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
