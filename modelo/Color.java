package juego.modelo;

/**
 * 
 * @author Diego González Román & Jesús Martínez Taboada
 *
 */

public enum Color {

	BLANCO('X'), NEGRO('O');
	private char carácter;
	
	private Color(char letra){  //constructor siempre se llama igual que la clase
		carácter = letra;
	}
	public char toChar() {
		return carácter;
	}
	Color c1, c2;
}
