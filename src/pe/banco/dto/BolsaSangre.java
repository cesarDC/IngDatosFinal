package pe.banco.dto;

public class BolsaSangre {
private Integer idunidadsangre;
private Integer idsolicituddon;
private Integer idsolicitud;
private String fechaingreso;
private String duracion;
private String fechacaducidad;
public BolsaSangre() {
	super();
}

public BolsaSangre(Integer idunidadsangre, Integer idsolicituddon, Integer idsolicitud, String fechaingreso,
		String duracion, String fechacaducidad) {
	super();
	this.idunidadsangre = idunidadsangre;
	this.idsolicituddon = idsolicituddon;
	this.idsolicitud = idsolicitud;
	this.fechaingreso = fechaingreso;
	this.duracion = duracion;
	this.fechacaducidad = fechacaducidad;
}

public Integer getIdunidadsangre() {
	return idunidadsangre;
}
public void setIdunidadsangre(Integer idunidadsangre) {
	this.idunidadsangre = idunidadsangre;
}
public Integer getIdsolicituddon() {
	return idsolicituddon;
}
public void setIdsolicituddon(Integer idsolicituddon) {
	this.idsolicituddon = idsolicituddon;
}
public Integer getIdsolicitud() {
	return idsolicitud;
}
public void setIdsolicitud(Integer idsolicitud) {
	this.idsolicitud = idsolicitud;
}
public String getFechaingreso() {
	return fechaingreso;
}
public void setFechaingreso(String fechaingreso) {
	this.fechaingreso = fechaingreso;
}
public String getDuracion() {
	return duracion;
}
public void setDuracion(String duracion) {
	this.duracion = duracion;
}
public String getFechacaducidad() {
	return fechacaducidad;
}
public void setFechacaducidad(String fechacaducidad) {
	this.fechacaducidad = fechacaducidad;
}

}
