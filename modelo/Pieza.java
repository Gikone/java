package juego.modelo;

/**
 * 
 * @author Diego Gonz�lez Rom�n & Jes�s Mart�nez Taboada
 *
 */

public class Pieza {
	
	private Color color;
	
	private Celda celda;
	
	public Pieza(Color color) {
		this.establecerColor(color);
	}
	
	private void establecerColor(Color color) {
		this.color = color;
	}
	
	public Color obtenerColor() {
		return color;
	}
	
	public void establecerCelda(Celda celda) {
		this.celda = celda;
	}
	
	public Celda obtenerCelda() {
		return celda;
	}
	
	public String toString() {
		return obtenerCelda().toString() + "-" + obtenerColor().toString();
	}
}
