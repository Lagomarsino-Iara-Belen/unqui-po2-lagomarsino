package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {
	private Trabajador trabajador = new Trabajador();
	
	private Ingreso ingreso1 = new Ingreso(2, "Ventas", 20d);
	
	private Ingreso ingreso2 = new Ingreso(4, "Alquiler", 50d);
	
	private IngresoPorHorasExtra ingreso3 = new IngresoPorHorasExtra(5, "Ventas", 40d, 3);

	@BeforeEach
	void setUp() throws Exception {
		trabajador.addIngresoDelMes(ingreso1);
		trabajador.addIngresoDelMes(ingreso2);
		trabajador.addIngresoDelMes(ingreso3);

	}

	@Test
	void testTotalPercibido() {
		assertEquals(110d, trabajador.getTotalPercibido());
	}
	
	@Test
	void testMontoImponible() {
		assertEquals(70d, trabajador.getMontoImponible());
	}

	@Test
	void testImpuestoAPagar() {
		assertEquals(14d, trabajador.getImpuestoAPagar());
	}

}
