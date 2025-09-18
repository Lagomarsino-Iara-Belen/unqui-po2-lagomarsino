package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoTest {
	private Ingreso ingreso;

	@BeforeEach
	void setUp() throws Exception {
		ingreso = new Ingreso(1,"Ventas", 20d);
		
	}

	@Test
	void testMesDelIngreso() {
		assertEquals(1, ingreso.mes());
	}
	
	@Test
	void testConceptoDelIngreso() {
		assertEquals("Ventas", ingreso.concepto());
	}
	
	@Test
	void testMontoPercibidoDelIngreso() {
		assertEquals(20d, ingreso.montoPercibido());
	}

}
