package ejercicio01;

public class Main {

	/*
	 * Crearemos un programa con una clase que contenga una función para sumar todo
	 * lo que haya dentro de un Array para luego guardarlo en una variable, que
	 * luego imprimiremos en pantalla.
	 */
	public static void main(String[] args) {
		// Creamos el Array en cuestión para probar su funcionamiento
		int[] tabla = { 20, 35, 34, 100, 404 };

		// Invocamos la función y guardamos lo que retorne al result.
		int result = TablaParametros.sumarTabla(tabla);

		// Imprimimos lo retornado.
		System.out.println(result);

	}

}
