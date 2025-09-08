package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {
	private Multioperador multioperador;

	@BeforeEach
	void setUp() throws Exception {
		multioperador = new Multioperador();
		
		multioperador.addNumber(2);
		multioperador.addNumber(10);
		multioperador.addNumber(5);
		multioperador.addNumber(3);
		multioperador.addNumber(6);
	}

	@Test
	public void testSumaDeNrosDeLaLista() {
		assertEquals(26, multioperador.sumaNrosDeList() );
	}
	
	@Test
	public void testRestaDeNrosDeLaLista() {
		assertEquals(-22, multioperador.restaNrosDeList() );
	}
	
	@Test
	public void testMultiplicacionDeNrosDeLaLista() {
		assertEquals(1800, multioperador.multiplicacionNrosDeList() );
	}

}
