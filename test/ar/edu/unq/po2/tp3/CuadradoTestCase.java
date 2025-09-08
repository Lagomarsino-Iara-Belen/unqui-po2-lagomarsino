package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuadradoTestCase {
	private Cuadrado cuadrado;

	@BeforeEach
	void setUp() throws Exception {
		cuadrado = new Cuadrado(4);
	}

	@Test
	void testAreaDelRectangulo() {
		assertEquals(16, cuadrado.areaDelCuadrado() );
	}
	
	@Test
	void testPerimetroDelRectangulo() {
		assertEquals(16, cuadrado.perimetroDelCuadrado() );
	}
	
	@Test
	void testEstaHorizontalElRectangulo() {
		assertFalse( cuadrado.estaEnHorizontalElCuadrado() );
	}
	
	@Test
	void testEstaVerticalElRectangulo() {
		assertFalse( cuadrado.estaEnVerticalElCuadrado() );
	}
}
