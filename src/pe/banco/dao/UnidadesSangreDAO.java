package pe.banco.dao;

import java.util.List;

import pe.banco.dto.BolsaSangre;

public interface UnidadesSangreDAO {
	public String ingresarUnidadSangre();

	public String modificarUnidadSangre();

	public UnidadesSangreDAO getUnidadSangre(Integer idUnidad);

	public List<BolsaSangre> listarUnidades(Integer idCentro, String tipo);

}
