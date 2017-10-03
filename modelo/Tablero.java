package juego.modelo;

public class Tablero {

	private Celda[][] celdas;
	
	public Tablero(int filas, int columnas) {
		celdas = new Celda[filas][columnas];
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < columnas; j++) {
				celdas[i][j] = new Celda(i,j);
			}
		}
	}
	/**
	 * Coloca la pieza en la celda (doble enganche).
	 * 
	 * @param pieza pieza
	 * @param celda celda
	 */
	
	public void colocar(Pieza pieza, Celda celda) {
		celda.establecerPieza(pieza);
		pieza.establecerCelda(celda);
		assert celda.estaVacia();
	}
	
	public Celda obtenerCelda(int fila, int columna) {
		return celdas[fila][columna];
	}
	
	public static void main(String[] args) {
		Tablero tablero = new Tablero(3,3);
		Pieza pieza = new Pieza(Color.BLANCO);
		Celda celda = tablero.obtenerCelda(0, 0);
		tablero.colocar(pieza, celda);
		
	}
}
