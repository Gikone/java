package juego.modelo;

/**
 * 
 * @author Diego González Román & Jesús Martínez Taboada
 *
 */

public class Jugador {

	private String nombre;
	
	private Color color;
	
	Jugador(String nombre, Color color){
		this.nombre = nombre;
		this.color = color;
	}
	
	public Color obtenerColor() {
		return color;
	}
	
	public String obtenerNombre() {
		return nombre;
	}
	
	public String toString() {
		//devuelve el contenido del objeto en
		//formato cadena de caracteres
		String resultado = nombre + "-" + color;
		return resultado;
	}
	
	//Genera una nueva pieza del color actual del jugador
	public Pieza generarPieza() {
		Pieza pieza = new Pieza(this.obtenerColor());
		return pieza;
	}
}
