package juego.modelo;

/**
 * 
 * @author Diego Gonz�lez Rom�n & Jes�s Mart�nez Taboada
 *
 */

public enum Color {

	BLANCO('X'), NEGRO('O');
	private char car�cter;
	
	private Color(char letra){  //constructor siempre se llama igual que la clase
		car�cter = letra;
	}
	public char toChar() {
		return car�cter;
	}
	Color c1, c2;
}
