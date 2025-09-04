package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {
	private Counter counter;
	/**
	 * Crea un escenario de test básico, que consiste en un contador
	 * con 10 enteros
	 *
	 * @throws Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		
		//Se crea el contador
		counter = new Counter();
		
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1); 
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4); //único par
	}
	
	
	/**
	 * Verifica la cantidad de pares
	 */
	@Test
	public void testCantidadDeImpares() {
		
		// Getting the even occurrences
		int amount = counter.counterIntImpar();
		
		// I check the amount is the expected one
		assertEquals(amount, 9);
	}
	
	@Test
	public void testCantidadDePares() {
		int resultadoObtenido = counter.counterIntPar();
		assertEquals(1, resultadoObtenido);
	}
	
	@Test
	public void testCantidadDeMultiplos() {
		Integer nroDePrueba = 3 ;
		int resultadoObtenido = counter.counterIntMultiplos(nroDePrueba);
		assertEquals(2, resultadoObtenido);
	}
	
	@Test
	public void testDesarmandoNros() {
		counter.addNumber(122); 
		counter.addNumber(3015);
		counter.addNumber(548);
		counter.addNumber(1024);
		counter.addNumber(9111);
		counter.addNumber(70);
		
		
		int resultadoObtenido = counter.desarmandoNros();
		assertEquals(1024, resultadoObtenido);
	}
	
	/* Punto 3 */
	
	@Test
	public void testMultiploMasGrandeEntreCeroYMilDe_Y_() {
		
		int resultadoObtenido = counter.multiploMasGrandeEntreCeroYMilDe_Y_(3,9);
		assertEquals(999, resultadoObtenido);	
	}
	
	@Test
	public void testMultiploMasGrandeEntreCeroYMilDe_Y_2() {
		
		int resultadoObtenido = counter.multiploMasGrandeEntreCeroYMilDe_Y_(12,35);
		assertEquals(840, resultadoObtenido);	
	}
	
	@Test
	public void testMultiploMasGrandeEntreCeroYMilDe_Y_3() {
		
		int resultadoObtenido = counter.multiploMasGrandeEntreCeroYMilDe_Y_(1000,1203);
		assertEquals(-1, resultadoObtenido);	
	}
	
}

