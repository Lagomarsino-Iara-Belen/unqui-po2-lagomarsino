package ar.edu.unq.po2.tp4;

public class Ingreso {
	
	private int mes;
	private String concepto;
	private Double montoPercibido;
	
	public Ingreso(int mes, String concepto, Double montoPercibido) {
		this.mes = mes;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
		
	}
	
	
	private int getMes() {
		return mes;
	}
	
	public int mes() {
		return getMes();
	}
	
	private String getConcepto() {
		return concepto;
	}
	
	public String concepto() {
		return getConcepto();
	}
	
	private Double getMontoPercibido() {
		return montoPercibido;
	}
	
	public Double montoPercibido() {
		return getMontoPercibido();
	}

	public Double montoImponible() {
		return getMontoPercibido();
	}

}
