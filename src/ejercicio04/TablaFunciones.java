package ejercicio04;

public class TablaFunciones {

	/*
	 * Creamos la función con los parámetros de Array en el que buscaremos el valor,
	 * y el valor en sí a buscar (Clave).
	 */
	public static int buscar(int t[], int clave) {

		// La variable que retornaremos que contendrá la posición
		// del valor a buscar en el Array.
		int indiceBusqueda = 0;

		// Algoritmo deb búsqueda secuencial.
		while (indiceBusqueda < t.length && clave != t[indiceBusqueda]) {
			indiceBusqueda++;
		}

		/* Si encuentras un valor mayor o igual que la longitud
		 * significa que no lo ha encontrado. Por lo que,
		 * asignaremos -1 para luego retornar dicho -1
		 * como lo especificado en el ejercicio. */
		if (indiceBusqueda >= t.length) {
			indiceBusqueda = -1;
		}

		// Devolvemos la posición del valor.
		return indiceBusqueda;
	}

}
