package test;

import ingdatos.grupo3.beans.Donante;
import ingdatos.grupo3.dao.DonanteDAO;

public class Prueba {

	public static void main(String[] args) {
		
		Donante don = new Donante(5161, "mitch22", "prueba", "M", 456789, 80, "10/10/1994");
		
		DonanteDAO d = new DonanteDAO();
		
		System.out.println(d.ingresarDonante(don));
		
		//d.prueba();
		
	}

}
