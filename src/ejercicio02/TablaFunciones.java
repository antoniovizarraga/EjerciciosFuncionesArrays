package ejercicio02;

import java.util.Arrays;

/* Crearemos una clase que tenga una función que coja como parámetro un Array,
 * y con dicho Array devuelva cuál es el valor máximo. */
public class TablaFunciones {
	
	// Función que devolverá el valor máximo.
	public static int maximo(int[] t) {
		// Variable que contendrá el valor máximo.
		int maxValue = 0;
		
		// Ordenamos el Array para poder extraer el valor máximo.
		Arrays.sort(t);
		
		/* Guardamos el valor de la última posición. Le restamos 1
		 * porque los Arrays van desde 0 hasta la longitud del
		 * Array -1. Ejemplo: Si hay Array que tiene de
		 * longitud 5, las posiciones son desde 0 hasta
		 * 4. */
		maxValue = t[t.length - 1];
		
		
		// Devolvemos el valor máximo.
		return maxValue;
	}
}
