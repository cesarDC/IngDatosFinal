package pe.banco.dto;

public class Donante {
	private String dnidon;
	private String nombres;
	private String apellidopat;
	private String apellidomat;
	private String tiposangre;
	private String correo;
	private Character tipodonante;
	private String direccion;
	private Integer iddistrito;
	private String distrito;
	private Integer telefono;
	private String fechanac;
	private Integer edad;
	private Integer celular;
	private Character estado;
	private String detalleveto;

	public Donante() {
		super();
	}

	public Donante(String dnidon, String nombres, String apellidopat, String apellidomat, String tiposangre,
			String correo, Character tipodonante, String direccion, Integer iddistrito, String distrito,
			Integer telefono, String fechanac, Integer edad, Integer celular, Character estado, String detalleveto) {
		super();
		this.dnidon = dnidon;
		this.nombres = nombres;
		this.apellidopat = apellidopat;
		this.apellidomat = apellidomat;
		this.tiposangre = tiposangre;
		this.correo = correo;
		this.tipodonante = tipodonante;
		this.direccion = direccion;
		this.iddistrito = iddistrito;
		this.distrito = distrito;
		this.telefono = telefono;
		this.fechanac = fechanac;
		this.edad = edad;
		this.celular = celular;
		this.estado = estado;
		this.detalleveto = detalleveto;
	}

	public String getDnidon() {
		return dnidon;
	}

	public void setDnidon(String dnidon) {
		this.dnidon = dnidon;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Character getTipodonante() {
		return tipodonante;
	}

	public void setTipodonante(Character tipodonante) {
		this.tipodonante = tipodonante;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getIddistrito() {
		return iddistrito;
	}

	public void setIddistrito(Integer iddistrito) {
		this.iddistrito = iddistrito;
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

	public String getFechanac() {
		return fechanac;
	}

	public void setFechanac(String fechanac) {
		this.fechanac = fechanac;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getCelular() {
		return celular;
	}

	public void setCelular(Integer celular) {
		this.celular = celular;
	}

	public Character getEstado() {
		return estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}

	public String getDetalleveto() {
		return detalleveto;
	}

	public void setDetalleveto(String detalleveto) {
		this.detalleveto = detalleveto;
	}
	
	
}