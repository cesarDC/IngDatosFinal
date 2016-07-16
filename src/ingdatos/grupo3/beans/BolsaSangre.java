package ingdatos.grupo3.beans;

public class BolsaSangre {
private int idBolsaSangre;
private int idLocal;
private String TipoSangre;
private int DNI;
private int estado;
private int idPruebaA;
private int idPruebaB;
private int idPruebaC;
private String FechaDonacion;


public BolsaSangre() {
	super();
}



public BolsaSangre(int idBolsaSangre, int idLocal, String tipoSangre, int dNI, int estado, int idPruebaA, int idPruebaB, int idPruebaC,
		String fechaDonacion) {
	super();
	this.idBolsaSangre = idBolsaSangre;
	this.idLocal = idLocal;
	TipoSangre = tipoSangre;
	DNI = dNI;
	this.estado = estado;
	this.idPruebaA = idPruebaA;
	this.idPruebaB = idPruebaB;
	this.idPruebaC = idPruebaC;
	FechaDonacion = fechaDonacion;
}





public int getIdPruebaA() {
	return idPruebaA;
}



public void setIdPruebaA(int idPruebaA) {
	this.idPruebaA = idPruebaA;
}



public int getIdPruebaB() {
	return idPruebaB;
}



public void setIdPruebaB(int idPruebaB) {
	this.idPruebaB = idPruebaB;
}



public int getIdPruebaC() {
	return idPruebaC;
}



public void setIdPruebaC(int idPruebaC) {
	this.idPruebaC = idPruebaC;
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
