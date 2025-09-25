package ar.edu.unq.po2.tp5;

import java.time.LocalDate;
import java.util.ArrayList;

class PedirNombreTest {
	
	public static void main(String[] args) {
		Mascota m1 = new Mascota("Firulais", "Chaniche");
		Mascota m2 = new Mascota("Fatiga", "BullDog");
		LocalDate fn1 = LocalDate.of(2000, 6, 21);
		Persona p1 = new Persona("Tamara", fn1 );
		Persona p2 = new Persona("Violeta", fn1);
		
		ArrayList<Nombrable> listaDeNombrables = new ArrayList<Nombrable>();
		
		listaDeNombrables.add(m1);
		listaDeNombrables.add(m2);
		listaDeNombrables.add(p1);
		listaDeNombrables.add(p2);
		
		for(Nombrable n : listaDeNombrables) {
			System.out.println( n.getNombre() );
		}
	}


}
