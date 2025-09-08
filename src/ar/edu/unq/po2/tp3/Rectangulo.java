package ar.edu.unq.po2.tp3;

public class Rectangulo {

	Point dimension;
	
	/**
	 * Se crea un rectángulo de dimension x e y
	 * @param base el nro x que repressenta el largo de la base
	 * @param altura el nro y que representa el largo de la altura
	 */
	public Rectangulo(int base, int altura) {
		dimension = new Point(base, altura);
	}
	
	
	/**
	 * Devuelve la longitud de la base del rectángulo
	 * @return longitud de la base
	 */
	public int getBase() {
		return dimension.getCoordenadaX();
	}
	
	
	/**
	 * Devuelve la longitud de la altura del rectángulo
	 * @return longitud de la altura
	 */
	public int getAltura(){
		return dimension.getCoordenadaY();
	}
	
	
	/**
	 * Devuelve el area que ocupa el rectágulo 
	 * @return area del rectángulo
	 */
	public int areaDelRectangulo() {
		return this.getBase() * this.getAltura();
	}
	
	
	/**
	 * Devuelve el perimetro que tiene el rectágulo 
	 * @return perimetro del rectángulo
	 */
	public int perimetroDelRectangulo() {
		return 2 *( this.getBase() + 
				    this.getAltura() );
	}
	
	
	/**
	 * Denota si el rectángulo esta en horizontal
	 * @return verdadero si el rectángulo esta en horizontal
	 */
	public boolean estaEnHorizontalElRectangulo() {
		return this.getBase() > this.getAltura();
	}
	
	
	/**
	 * Denota si el rectángulo esta en vertical
	 * @return verdadero si el rectángulo esta en vertical
	 */
	public boolean estaEnVerticalElRectangulo() {
		return this.getBase() < this.getAltura();
	}
}
