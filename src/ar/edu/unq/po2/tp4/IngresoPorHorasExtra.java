package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtra extends Ingreso {
	private int horasExtra;

	public IngresoPorHorasExtra(int mes, String concepto, Double montoPercibido, int horasExtra) {
		super(mes, concepto, montoPercibido);
		this.horasExtra = horasExtra;
	}
	
	private int getHorasExtras() {
		return horasExtra;
	}
	
	public int horasExtra() {
		return getHorasExtras();
	}
	
	@Override
	public Double montoImponible() {
		return 0d;
	}
	
	
}
