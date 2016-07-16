package ingdatos.grupo3.beans;

public class Donante {
	private int DNI;
	private String nombre;
	private String apellidoP;
	private String apellidoM;
	private String sexo;
	private int numTelf;
	private int peso;
	private String fechaNacimiento;
	private String estado;
	private int idtipoSangre;
	
	public Donante() {
		super();
	}

	public Donante(int dNI, String nombre, String apellidoP, String apellidoM, String sexo, int numTelf, int peso,
			String fechaNacimiento, String estado, int idtipoSangre) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.sexo = sexo;
		this.numTelf = numTelf;
		this.peso = peso;
		this.fechaNacimiento = fechaNacimiento;
		this.estado = estado;
		this.idtipoSangre = idtipoSangre;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoP() {
		return apellidoP;
	}

	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	public String getApellidoM() {
		return apellidoM;
	}

	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getNumTelf() {
		return numTelf;
	}

	public void setNumTelf(int numTelf) {
		this.numTelf = numTelf;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getIdtipoSangre() {
		return idtipoSangre;
	}

	public void setIdtipoSangre(int idtipoSangre) {
		this.idtipoSangre = idtipoSangre;
	}

	@Override
	public String toString() {
		return "Donante [DNI=" + DNI + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM
				+ ", sexo=" + sexo + ", numTelf=" + numTelf + ", peso=" + peso + ", fechaNacimiento=" + fechaNacimiento
				+ ", estado=" + estado + ", idtipoSangre=" + idtipoSangre + "]";
	}
	
	
	
	
}