package pe.banco.dao;

import java.util.List;

import pe.banco.dto.Donante;

public interface DonanteDAO {
	public String ingresarDonante(Donante donante);

	public String modificarDonante(Donante donante);

	public String eliminarDonante(Donante donante);

	public Donante getDonante(String dnidon);

	public List<Donante> listarDonantes();
}
