package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado, int descuento) {
		super(nombre, precio, precioCuidado, descuento);
	}
	
	@Override
	public Double getPrecio() {
		return ( super.getPrecio() * super.getDescuento() );
	}
}
