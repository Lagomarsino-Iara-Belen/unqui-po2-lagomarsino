package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {
	private Rectangulo rectangulo;

	@BeforeEach
	void setUp() throws Exception {
		rectangulo = new Rectangulo(4,9);
	}

	@Test
	void testAreaDelRectangulo() {
		assertEquals(36, rectangulo.areaDelRectangulo() );
	}
	
	@Test
	void testPerimetroDelRectangulo() {
		assertEquals(26, rectangulo.perimetroDelRectangulo() );
	}
	
	@Test
	void testEstaHorizontalElRectangulo() {
		assertFalse( rectangulo.estaEnHorizontalElRectangulo() );
	}
	
	@Test
	void testEstaVerticalElRectangulo() {
		assertTrue( rectangulo.estaEnVerticalElRectangulo() );
	}

}
