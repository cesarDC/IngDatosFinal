package ingdatos.grupo3.beans;

public class Donante {
	private int DNI;
	private String nombre;
	private String apellido;
	private String sexo;
	private int numTelf;
	private int peso;
	private String fechaNacimiento;
	
	public Donante() {
		super();
	}

	public Donante(int dNI, String nombre, String apellido, String sexo, int numTelf, int peso, String fechaNacimiento) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.numTelf = numTelf;
		this.peso = peso;
		this.fechaNacimiento = fechaNacimiento;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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

	public String getfechaNacimiento() {
		return fechaNacimiento;
	}

	public void setfechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	
}