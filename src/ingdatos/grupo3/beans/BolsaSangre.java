package ingdatos.grupo3.beans;

public class BolsaSangre {
private int idBolsaSangre;
private int idLocal;
private String TipoSangre;
private int DNI;
private int estado;
private int idPrueba;
private String FechaDonacion;


public BolsaSangre() {
	super();
}



public BolsaSangre(int idBolsaSangre, int idLocal, String tipoSangre, int dNI, int estado, int idPrueba,
		String fechaDonacion) {
	super();
	this.idBolsaSangre = idBolsaSangre;
	this.idLocal = idLocal;
	TipoSangre = tipoSangre;
	DNI = dNI;
	this.estado = estado;
	this.idPrueba = idPrueba;
	FechaDonacion = fechaDonacion;
}



public int getIdPrueba() {
	return idPrueba;
}



public void setIdPrueba(int idPrueba) {
	this.idPrueba = idPrueba;
}



public String getFechaDonacion() {
	return FechaDonacion;
}



public void setFechaDonacion(String fechaDonacion) {
	FechaDonacion = fechaDonacion;
}



public int getIdBolsaSangre() {
	return idBolsaSangre;
}


public void setIdBolsaSangre(int idBolsaSangre) {
	this.idBolsaSangre = idBolsaSangre;
}


public int getIdLocal() {
	return idLocal;
}


public void setIdLocal(int idLocal) {
	this.idLocal = idLocal;
}


public String getTipoSangre() {
	return TipoSangre;
}


public void setTipoSangre(String tipoSangre) {
	TipoSangre = tipoSangre;
}


public int getDNI() {
	return DNI;
}


public void setDNI(int dNI) {
	DNI = dNI;
}


public int getEstado() {
	return estado;
}


public void setEstado(int estado) {
	this.estado = estado;
}

}
