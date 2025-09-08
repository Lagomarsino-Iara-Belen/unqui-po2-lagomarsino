package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {
	private Persona persona;

	@BeforeEach
	void setUp() throws Exception {
		//con LocalDate.of creo un LocalDate con una fecha específica
		LocalDate fechaNacimiento = LocalDate.of(2000, 6, 21);
		persona = new Persona("Tamara", fechaNacimiento );
	}

	@Test
	void testNombreDePersona() {
		assertEquals("Tamara", persona.getNombre() );
	}
	
	@Test
	void testFechaNacimientoDePersona() {
		LocalDate fechaNacimiento = LocalDate.of(2000, 6, 21);
		assertEquals(fechaNacimiento, persona.getFechaNacimiento() );
	}
	
	@Test
	void testEdadDePersona() {
		assertEquals(25, persona.getEdad() );
	}
	
	@Test
	void testEsMenorQue() {
		LocalDate fechaNacimiento = LocalDate.of(2005, 9, 2);
		Persona persona2 = new Persona("Kevin", fechaNacimiento);
		
		assertFalse( persona.esMenorQue(persona2) );
	}
	
	@Test
	void testEsMenorQue2() {
		LocalDate fechaNacimiento = LocalDate.of(1986, 4, 16);
		Persona persona2 = new Persona("Kevin", fechaNacimiento);
		
		assertTrue( persona.esMenorQue(persona2) );
	}

}
