package pe.banco.dto;

import java.io.File;

public class CentroHospitalario {
	private int idCentro;
	private String razonSocial;
	
	public CentroHospitalario() {
		super();
	}

	public CentroHospitalario(int idCentro, String razonSocial) {
		super();
		this.idCentro = idCentro;
		this.razonSocial = razonSocial;
	}

	public int getIdCentro() {
		return idCentro;
	}

	public void setIdCentro(int idCentro) {
		this.idCentro = idCentro;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	
	
	
}
