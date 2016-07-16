package ingdatos.grupo3.beans;

public class TipoSangre {
	private int idTipoSangre;
	private String tipo;
	
	public TipoSangre(int idTipoSangre, String tipo) {
		super();
		this.idTipoSangre = idTipoSangre;
		this.tipo = tipo;
	}

	public int getIdTipoSangre() {
		return idTipoSangre;
	}

	public void setIdTipoSangre(int idTipoSangre) {
		this.idTipoSangre = idTipoSangre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}	
	
}
