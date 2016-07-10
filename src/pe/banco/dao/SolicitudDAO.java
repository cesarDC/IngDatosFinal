package pe.banco.dao;

import java.util.List;

import pe.banco.dto.Distrito;

public interface SolicitudDAO {
	public String ingresarSolicitud(Distrito sol);

	public String modificarSolicitud(Distrito sol);

	public String eliminarSolicitud(Integer idSol);

	public Distrito getSolicitud(Integer idSol);

	public List<Distrito> listarSolicitud(Integer idCentroSalud);
}
