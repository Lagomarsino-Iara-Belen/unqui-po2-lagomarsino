package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	private String nombre;
	private ArrayList<Persona> listPersonas;
	
	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
		this.listPersonas = new ArrayList<Persona> ();
	}
	
	private String getNombre() {
		return this.nombre;
	}

	
	private ArrayList<Persona> getListPersona() {
		return this.listPersonas;
	}
	
	public void addPersona(Persona p) {
		this.getListPersona().add(p);
	}
	
	public String nombreDeEmpresa() {
		return this.getNombre();
	}

	public int promedioEdadDeIntegrantes() {
		int promedio = 0;
		
		for(Persona persona: listPersonas) {
			promedio += persona.getEdad();
		}
		
		return promedio / listPersonas.size();
	}
	
}
