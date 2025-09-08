package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTestCase {
	private Point punto;	
		
	@BeforeEach
	void setUp() throws Exception {
		punto = new Point(5,3);
	}

	@Test
	void testComprobarPosicionDelPunto() {
		assertEquals(5,punto.getCoordenadaX() );
		assertEquals(3,punto.getCoordenadaY() );
	}
	
	@Test
	void testMoverPosicionDelPunto() {
		punto.moverPosicion(4, 8);
		
		assertEquals(4,punto.getCoordenadaX() );
		assertEquals(8,punto.getCoordenadaY() );
	}
	
	@Test
	void testNuevoPuntoAlSumarDoPuntos() {
		Point punto2 = new Point(4, 8);
		Point puntoNuevo = punto.nuevoPuntoAlSumar_Y_(punto, punto2);
		
		assertEquals(9,  puntoNuevo.getCoordenadaX() );
		assertEquals(11, puntoNuevo.getCoordenadaY() );
	}


}
