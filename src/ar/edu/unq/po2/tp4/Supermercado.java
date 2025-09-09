package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {
	
	String nombre;
	String direccion;
	ArrayList<Producto> productos;
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public Integer getCantidadDeProductos() {
		return this.getProductos().size();
	}

	public void agregarProducto(Producto producto) {
		this.getProductos().add(producto);
	}

	public Double getPrecioTotal() {
		Double result = 0.0;
		for (Producto producto : this.getProductos()) {
			result = result + producto.getPrecio();
		}
		return result;
	}

}
