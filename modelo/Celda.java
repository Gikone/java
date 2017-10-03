package juego.modelo;

public class Celda {
	
	private int fila;
	
	private int columna;
	
	private Pieza pieza;
	
	public Celda(int fila, int columna){
		this.fila = fila;
		this.columna = columna;
	}
	
	public int obtenerFila() {
		return fila;
	}
	
	public int obtenerColumna() {
		return columna;
	}
	
	public void establecerPieza(Pieza pieza) {
		this.pieza = pieza;
	}
	
	public Pieza obtenerPieza() {
		return pieza;
	}
	
	public boolean estaVacia() {
		boolean estado;
		if (pieza == null) {
			estado = true;
		} else {
			estado = false;
		}
		return estado; //version reducida -> return pieza == null;
	}
	
}
