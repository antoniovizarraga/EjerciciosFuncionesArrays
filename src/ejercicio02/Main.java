package ejercicio02;

public class Main {

	/* Crearemos un programa con una clase que contenga una
	 * función que devuelva el máximo valor de una tabla.
	 * Probaremos su funcionamiento en el método Main. */
	
	public static void main(String[] args) {
		
		// Array que contiene los valores.
		int[] tabla = {1, 2, 3, 4, 5};

		// Guardamos lo que retorna en una variable.
		int result = TablaFunciones.maximo(tabla);
		
		// Lo imprimimos.
		System.out.println(result);
	}

}
