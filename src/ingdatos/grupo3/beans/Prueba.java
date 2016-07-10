package ingdatos.grupo3.beans;

public class Prueba {
	private int idPrueba;
	private String nombres;
	private int estado;

	public Prueba() {
		super();
	}

	public Prueba(int idPrueba, String nombres, int estado) {
		super();
		this.idPrueba = idPrueba;
		this.nombres = nombres;
		this.estado = estado;
	}

	public int getIdPrueba() {
		return idPrueba;
	}

	public void setIdPrueba(int idPrueba) {
		this.idPrueba = idPrueba;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	
	
}
