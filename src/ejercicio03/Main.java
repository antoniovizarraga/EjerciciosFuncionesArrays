package ejercicio03;

import java.util.Arrays;

public class Main {
	
	/* Crearemos un programa con una clase con función
	 * incluida que lo que haga sea devolver un
	 * Array que contenga sólo números pares
	 * generados aleatoriamente. La cosa es
	 * que la función se le pasará como
	 * parámetro la longitud del propio
	 * Array a devolver y hasta qué
	 * valor debe generar los pares. */
	public static void main(String[] args) {
		// Creamos el Array e invocamos la función.
		int[] tabla = TablaFunciones.TablaPares(5, 10);
		
		// Imprimimos el Array.
		System.out.println(Arrays.toString(tabla));

	}

}
