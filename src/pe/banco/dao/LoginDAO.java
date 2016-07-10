package pe.banco.dao;

import pe.banco.dto.Usuario;

public interface LoginDAO {
	public Usuario autenticarUsuario(Usuario user);
}
