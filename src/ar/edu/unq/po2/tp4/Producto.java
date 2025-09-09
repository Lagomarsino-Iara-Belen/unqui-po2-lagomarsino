package ar.edu.unq.po2.tp4;

public class Producto {
	
	String nombre;
	Double precio;
	boolean precioCuidado;
	int descuento;
	
	public Producto(String nombre, double precio, boolean precioCuidado, int descuento) {
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidado = precioCuidado;
		this.descuento = descuento;
	}
	
	public Producto(String nombre, Double precio) {
		this(nombre,precio,false,0);
	}
	
	public String getNombre() {
		return nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	
	public boolean esPrecioCuidado() {
		return precioCuidado;
	}

	public void aumentarPrecio(double d) {
		this.setPrecio(this.getPrecio() + d);
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getDescuento() {
		return (100 - descuento) * 0.01;
		
	}
}
