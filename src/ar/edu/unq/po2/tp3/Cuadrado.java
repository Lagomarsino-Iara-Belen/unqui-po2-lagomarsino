package ar.edu.unq.po2.tp3;

public class Cuadrado {

	Point dimension;
	
	/**
	 * Se crea un cuadrado de la dimension dada
	 * @param dimension es la dimension del cuadrado
	 */
	public Cuadrado(int dimension) {
		this.dimension = new Point(dimension, dimension);
	}
	
	
	/**
	 * Devuelve la longitud que tiene cada uno de los lados del cuadrado
	 * @return longitud del lado
	 */
	public int getLado() {
		return dimension.getCoordenadaX();
	}
	
	
	/**
	 * Devuelve el area que ocupa el cuadrado
	 * @return area del cuadrado
	 */
	public int areaDelCuadrado() {
		return this.getLado() * this.getLado();
	}
	
	
	/**
	 * Devuelve el perimetro que tiene el cuadrado
	 * @return perimetro del cuadrado
	 */
	public int perimetroDelCuadrado() {
		return 4 * this.getLado();
	}
	
	
	/**
	 * Denota si el cuadrado esta en horizontal
	 * @return verdadero si el cuadrado esta en horizontal
	 */
	public boolean estaEnHorizontalElCuadrado() {
		return this.getLado() > this.getLado();
	}
	
	
	/**
	 * Denota si el rectángulo esta en vertical
	 * @return verdadero si el cuadrado esta en vertical
	 */
	public boolean estaEnVerticalElCuadrado() {
		return this.getLado() < this.getLado();
	}
	
}
