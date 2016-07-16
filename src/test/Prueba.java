package test;

import java.util.List;

import ingdatos.grupo3.beans.Donante;
import ingdatos.grupo3.dao.DonanteDAO;

public class Prueba {

	public static void main(String[] args) {
		
		Donante don = new Donante(123456, "prueba", "apellido1", "apellido2", "F", 789456, 80,
				"05/05/1980", "A", 1);
		
		Donante don1 = new Donante(123456, "prueba2", "apellido1", "apellido2", "F", 789456, 80,
				"05/05/1980", "A", 1);
		
		
		DonanteDAO d = new DonanteDAO();
		
		
		//System.out.println(d.ingresarDonante(don));
		//System.out.println(d.modificarDonante(don1));
		//System.out.println(d.eliminarDonante(don1));
		/*
		List<Donante> ldon = d.listarDonantes();
		
		for(Donante x : ldon){
			System.out.println(x);
		}
		*/
		
		System.out.println(d.getDonante(456789));
		
		
		
		
		//d.prueba();
		
	}

}
