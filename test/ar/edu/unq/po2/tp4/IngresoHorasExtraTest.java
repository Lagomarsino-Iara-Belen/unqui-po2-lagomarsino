package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoHorasExtraTest {
	private IngresoPorHorasExtra ingreso;
	
	@BeforeEach
	void setUp() throws Exception {
		ingreso = new IngresoPorHorasExtra(2, "Ventas", 20d, 6);
	}

	@Test
	void testCantidadDeHorasExtraDeIngreso() {
		assertEquals(6, ingreso.horasExtra());
	}

}
