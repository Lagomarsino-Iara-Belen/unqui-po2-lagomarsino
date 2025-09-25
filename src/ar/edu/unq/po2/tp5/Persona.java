package ar.edu.unq.po2.tp5;

import java.time.LocalDate;
import java.time.Period;

public class Persona implements Nombrable {
	
	private String nombre;
	private int edad;
	private LocalDate fechaNacimiento;
	
	/**
	 * Crea una Persona que conoce su nombre, fecha de nacimiento y su edad 
	 * @param nombre String que va ser el nombre  
	 * @param fechaNacimiento int que va ser la fecha de nacimiento
	 */
	public Persona(String nombre, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = calcularEdad();
	}
	
	
	/**
	 * Calcula la edad de la persona 
	 * @return Devuelve la edad
	 */
	private int calcularEdad() {
		LocalDate fechaDeHoy = LocalDate.now();
		//Calculo con Period la edad, mes y días exactos que tiene la persona. EJ: 22 años con 9 meses y 14 días
		Period periodo = Period.between(this.getFechaNacimiento(), fechaDeHoy);
		
		return periodo.getYears();
			
	}

	
	/**
	 * Devuelve el nombre de la persona
	 * @return String que es el nombre 
	 */
	public String getNombre() {
		return nombre;
	}
	
	
	/**
	 * Devuelve la edad de la persona
	 * @return int que es la edad 
	 */
	public int getEdad() {
		return edad;
	}
	
	
	/**
	 * Devuelve la fecha de nacimiento de la persona
	 * @return LocalDate que es la fecha de nacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	
	/**
	 * Denota si la persona que se recibe como parametro es mayor
	 * @param p1 Persona a comparar
	 */
	public boolean esMenorQue(Persona p1) {
		return this.getEdad() < p1.getEdad();
	}

}
