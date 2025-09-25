package ar.edu.unq.po2.tp5;

public abstract class Factura implements Pagable {
	private Agencia agencia;
	
	public Factura(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public abstract double getPrecio();
	
	public void notificarPago() {
		agencia.registarPago(this);
	}
}
