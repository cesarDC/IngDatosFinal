package pe.banco.dto;

public class Distrito {
	private Integer idsolicitud;
	private Integer idusuario;
	private Character estado;
	private Character prioridad;
	private String dnipac;
	private String fechaentrega;
	private String fechapedido;
	private Prueba paciente;

	public Distrito() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Distrito(Integer idsolicitud, Integer idusuario, Character estado, Character prioridad, String dnipac,
			String fechaentrega, String fechapedido, Usuario usuario, Prueba paciente) {
		super();
		this.idsolicitud = idsolicitud;
		this.idusuario = idusuario;
		this.estado = estado;
		this.prioridad = prioridad;
		this.dnipac = dnipac;
		this.fechaentrega = fechaentrega;
		this.fechapedido = fechapedido;
		this.usuario = usuario;
		this.paciente = paciente;
	}

	public Integer getIdsolicitud() {
		return idsolicitud;
	}

	public void setIdsolicitud(Integer idsolicitud) {
		this.idsolicitud = idsolicitud;
	}

	public Integer getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}

	public Character getEstado() {
		return estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}

	public Character getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Character prioridad) {
		this.prioridad = prioridad;
	}

	public String getDnipac() {
		return dnipac;
	}

	public void setDnipac(String dnipac) {
		this.dnipac = dnipac;
	}

	public String getFechaentrega() {
		return fechaentrega;
	}

	public void setFechaentrega(String fechaentrega) {
		this.fechaentrega = fechaentrega;
	}

	public String getFechapedido() {
		return fechapedido;
	}

	public void setFechapedido(String fechapedido) {
		this.fechapedido = fechapedido;
	}


	public Prueba getPaciente() {
		return paciente;
	}

	public void setPaciente(Prueba paciente) {
		this.paciente = paciente;
	}

	

	

}