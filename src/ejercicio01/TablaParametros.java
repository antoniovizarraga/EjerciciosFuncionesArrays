package ejercicio01;

public class TablaParametros {

	/*
	 * Crearemos una clase que dado un array, devuelva la suma de todos sus
	 * elementos.
	 */
	public static int sumarTabla(int[] tabla) {
		// Creamos la variable result para devolverla
		int result = 0;

		// Hacemos un foreach que recorra todo el Array y los valores que encuentre los
		// irá sumando a result.
		for (int i : tabla) {
			result += i;
		}

		// Lo retornamos.
		return result;
	}
}
