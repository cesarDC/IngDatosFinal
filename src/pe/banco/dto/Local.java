package pe.banco.dto;

import java.sql.Blob;

public class Local {
	private String dnidon;
	private Integer idmuestra;
	private Character estado;
	private String fecha;
	private String rutaAnalisis;
	private byte [] pdfAnalisis;
	
	public Local() {
		super();
	}

	public Local(String dnidon, Integer idmuestra, Character estado, String fecha, String rutaAnalisis,
			byte[] pdfAnalisis) {
		super();
		this.dnidon = dnidon;
		this.idmuestra = idmuestra;
		this.estado = estado;
		this.fecha = fecha;
		this.rutaAnalisis = rutaAnalisis;
		this.pdfAnalisis = pdfAnalisis;
	}

	public String getDnidon() {
		return dnidon;
	}

	public void setDnidon(String dnidon) {
		this.dnidon = dnidon;
	}

	public Integer getIdmuestra() {
		return idmuestra;
	}

	public void setIdmuestra(Integer idmuestra) {
		this.idmuestra = idmuestra;
	}

	public Character getEstado() {
		return estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getRutaAnalisis() {
		return rutaAnalisis;
	}

	public void setRutaAnalisis(String rutaAnalisis) {
		this.rutaAnalisis = rutaAnalisis;
	}

	public byte[] getPdfAnalisis() {
		return pdfAnalisis;
	}

	public void setPdfAnalisis(byte[] pdfAnalisis) {
		this.pdfAnalisis = pdfAnalisis;
	}
	
	

}	