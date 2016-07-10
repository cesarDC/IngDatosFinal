package pe.banco.dto;

public class Prueba {
	private String dnipac;
	private String nombres;
	private String apellidopat;
	private String apellidomat;
	private String tiposangre;
	private String direccion;
	private String distrito;
	private Integer telefono;
	private String correo;

	public Prueba() {
		super();
	}

	public Prueba(String dnipac, String nombres, String apellidopat, String apellidomat, String tiposangre,
			String direccion, String distrito, Integer telefono, String correo) {
		super();
		this.dnipac = dnipac;
		this.nombres = nombres;
		this.apellidopat = apellidopat;
		this.apellidomat = apellidomat;
		this.tiposangre = tiposangre;
		this.direccion = direccion;
		this.distrito = distrito;
		this.telefono = telefono;
		this.correo = correo;
	}

	public String getDnipac() {
		return dnipac;
	}

	public void setDnipac(String dnipac) {
		this.dnipac = dnipac;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidopat() {
		return apellidopat;
	}

	public void setApellidopat(String apellidopat) {
		this.apellidopat = apellidopat;
	}

	public String getApellidomat() {
		return apellidomat;
	}

	public void setApellidomat(String apellidomat) {
		this.apellidomat = apellidomat;
	}

	public String getTiposangre() {
		return tiposangre;
	}

	public void setTiposangre(String tiposangre) {
		this.tiposangre = tiposangre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
