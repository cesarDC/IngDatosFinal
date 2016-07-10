package pe.banco.dao;

import java.util.List;

import pe.banco.dto.Local;
import pe.banco.dto.Encuesta;
import pe.banco.dto.SolicitudDonacion;

public interface SolicitudDonacionDAO {
	public String ingresarSolicitudDon(SolicitudDonacion sold);

	public String modificarSolicitudDon(SolicitudDonacion sold);

	public String eliminarSolicitudDon(Integer id);

	public SolicitudDonacion getSolicitudDon(Integer id);

	public List<SolicitudDonacion> listarSolicitudDon(Integer idCentroMed);

}
