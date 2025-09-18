package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Trabajador {
	private ArrayList<Ingreso> ingresos;
	
	public Trabajador() {
		this.ingresos = new ArrayList<Ingreso>();
	}
	
	private ArrayList<Ingreso> getListaDeIngresos() {
		return ingresos;
	}
	
	public ArrayList<Ingreso> listaDeIngresos(){
		return getListaDeIngresos();
	}
	
	public void addIngresoDelMes(Ingreso ingreso) {
		this.listaDeIngresos().add(ingreso);
	}
	
	public Double getTotalPercibido() {
		Double resultado = 0d;
		for(Ingreso ingreso : getListaDeIngresos()) {
			resultado += ingreso.montoPercibido(); 
		}
		return resultado;
	}
	
	public Double getMontoImponible() {
		Double resultado = 0d;
		for(Ingreso ingreso : getListaDeIngresos()) {
			resultado += ingreso.montoImponible(); 
		}
		return resultado;
	}
	
	public Double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.2;
	}

}
