package ejercicio03;

import java.util.Arrays;
import java.util.Random;

public class TablaFunciones {

	/*
	 * Clase que tendrá como función la longitud del Array que devolveremos, y el
	 * límite del valor par que se generará.
	 */
	public static int[] TablaPares(int longitud, int fin) {

		// Creamos el Array con la longitud deseada.
		int[] tabla = new int[longitud];

		// Creamos el Random.
		Random rand = new Random();

		/*
		 * Creamos un valor que será el que contendrá el valor generado. Lo hacemos así
		 * para no machacar directamente el valor e ir desgranando el proceso poco a
		 * poco.
		 */
		int randomGenerated = -1;

		// Creamos el For que irá metiendo los valores pares.
		for (int i = 0; i < tabla.length; i++) {
			// Genera valores aleatorios hasta que éstos sean pares.
			while (randomGenerated % 2 != 0) {
				randomGenerated = rand.nextInt(2, fin + 1);
			}
			// Una vez haya sido generado correctamente, insértalo en la tabla.
			tabla[i] = randomGenerated;

			// Vuelve a inicializar la variable (Para que así
			// siga funcionando el algoritmo en la siguiente
			// iteración.
			randomGenerated = -1;
		}

		// Ordenamos el Array.
		Arrays.sort(tabla);

		// Y lo retornaremos.
		return tabla;
	}

}
