package ar.edu.unq.po2.tp3;

public class Point {
	
	private int coordenadaX;
	private int coordenadaY;
	
	public Point (int x, int y) {
		this.setCoordenadaX(x);
		this.setCoordenadaY(y);
	}
	
	public Point () {
		this.setCoordenadaX(0);
		this.setCoordenadaY(0);
	}
	
	private void setCoordenadaX(int x) {
		this.coordenadaX = x;
	}
	private void setCoordenadaY(int y) {
		this.coordenadaY = y;
	}
	
	public int getCoordenadaX() {
		return this.coordenadaX;
	}
	
	public int getCoordenadaY() {
		return this.coordenadaY;
	}
	
	public void moverPosicion(int x, int y) {
		this.setCoordenadaX(x);
		this.setCoordenadaY(y);
	}
	
	public Point nuevoPuntoAlSumar_Y_(Point a, Point b) {
		Point nuevoPunto = 
				new Point(a.coordenadaX + b.coordenadaX,
						  a.coordenadaY + b.coordenadaY);
		return nuevoPunto;
	}

}
