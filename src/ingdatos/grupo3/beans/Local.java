package ingdatos.grupo3.beans;

public class Local {
	private String idLocal;
	private String direccion;
	private boolean bancoSangre;
	private int idCentroHosp;
	private int idDistrito;	
	private String nombre;
	
	public Local() {
		super();
	}
	public Local(String idLocal, String direccion, boolean bancoSangre,
			int idCentroHosp, int idDistrito,String nombre) {
		super();
		this.idLocal = idLocal;
		this.direccion = direccion;
		this.bancoSangre = bancoSangre;
		this.idCentroHosp = idCentroHosp;
		this.idDistrito = idDistrito;
		this.nombre = nombre;
	}	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIdLocal() {
		return idLocal;
	}
	public void setIdLocal(String idLocal) {
		this.idLocal = idLocal;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public boolean isBancoSangre() {
		return bancoSangre;
	}
	public void setBancoSangre(boolean bancoSangre) {
		this.bancoSangre = bancoSangre;
	}
	public int getIdCentroHosp() {
		return idCentroHosp;
	}
	public void setIdCentroHosp(int idCentroHosp) {
		this.idCentroHosp = idCentroHosp;
	}
	public int getIdDistrito() {
		return idDistrito;
	}
	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}

	
}	