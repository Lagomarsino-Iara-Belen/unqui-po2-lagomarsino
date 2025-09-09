package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		// para indicar que un nro es de tipo Double, una de las manerass de asignar es: 29d
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 10);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals( 7.2d, leche.getPrecio());
	}
	
	@Test
	public void testCalcularPrecio2() {
		ProductoPrimeraNecesidad carne = new ProductoPrimeraNecesidad("carne", 12d, false, 15);
		
		assertEquals( 10.2d, carne.getPrecio());
	}
}
