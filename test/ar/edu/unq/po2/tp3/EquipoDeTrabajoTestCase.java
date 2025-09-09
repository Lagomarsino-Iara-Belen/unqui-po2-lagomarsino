package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {
	private EquipoDeTrabajo equipo;
	
	LocalDate fechaNac1 = LocalDate.of(1986, 4, 16);
	Persona p1 = new Persona("Ana",fechaNac1 );
	
	LocalDate fechaNac2 = LocalDate.of(1990, 1, 22);
	Persona p2 = new Persona("Fernando",fechaNac2 );
	
	LocalDate fechaNac3 = LocalDate.of(2000, 2, 8);
	Persona p3 = new Persona("Luisa",fechaNac3 );
	
	LocalDate fechaNac4 = LocalDate.of(2001, 6, 6);
	Persona p4 = new Persona("Victor",fechaNac4 );
	
	LocalDate fechaNac5 = LocalDate.of(1995, 3, 10);
	Persona p5 = new Persona("Damian",fechaNac5 );
	

	@BeforeEach
	void setUp() throws Exception {
		equipo = new EquipoDeTrabajo("RedKeys");
		
		equipo.addPersona(p1);
		equipo.addPersona(p2);
		equipo.addPersona(p3);
		equipo.addPersona(p4);
		equipo.addPersona(p5);
	}

	@Test
	void testNombreDeEquipoDeTrabajo() {
		assertEquals("RedKeys", equipo.nombreDeEmpresa() );
	}
	
	@Test
	void testPromedioEdadIntegrantes() {
		assertEquals(30, equipo.promedioEdadDeIntegrantes() );
	}
	

}
