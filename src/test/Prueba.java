package test;

import java.util.List;

import ingdatos.grupo3.beans.Donante;
import ingdatos.grupo3.beans.Usuario;
import ingdatos.grupo3.dao.DonanteDAO;
import ingdatos.grupo3.dao.LoginDAO;

public class Prueba {

	public static void main(String[] args) {
		
		//LoginDAO ldao=new LoginDAO();
		DonanteDAO d = new DonanteDAO();
		
		
		//System.out.println(d.ingresarDonante(don));
		//System.out.println(d.modificarDonante(don1));
		//System.out.println(d.eliminarDonante(don1));
		
		List<Donante> ldon = d.listarDonantes();
		
		for(Donante x : ldon){
			System.out.println(x.getDNI());
		}
		
		
		//System.out.println(ldao.getDonante("cesar", "123456").getNombreUsuario());
		
		
		//d.prueba();
		
	}

}
