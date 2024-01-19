package ejercicio04;

public class Main {

	/* Programa que dado un array, buscará de forma
	 * secuencial una clave dada en dicho Array.
	 * Lo haremos en una función que le
	 * pasaremos como parámetro un Array
	 * y el valor a buscar. */
	public static void main(String[] args) {
		
		// Array que contendrá los valores.
		int[] tabla = {1, 6, 8, 404, 30, 25};
		
		
		// Variable que contendrá la posición del elemento en el Array.
		int result = TablaFunciones.buscar(tabla, 404);
		
		// Imprimimos los resultados.
		System.out.println("Posición en el Array: " + result);

	}

}
