package ingdatos.grupo3.beans;

public class Prueba {
	private int idPrueba;
	private String nombre;
	private String estado;

	public Prueba() {
		super();
	}

	public Prueba(int idPrueba, String nombre, String estado) {
		super();
		this.idPrueba = idPrueba;
		this.nombre = nombre;
		this.estado = estado;
	}

	public int getIdPrueba() {
		return idPrueba;
	}

	public void setIdPrueba(int idPrueba) {
		this.idPrueba = idPrueba;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Prueba [idPrueba=" + idPrueba + ", nombre=" + nombre + ", estado=" + estado + "]";
	}

	
	
	
	
}
