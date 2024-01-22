package ejercicio05;

import java.util.Arrays;

public class Main {

	/* Creamos un programa donde crearemos un Array  */
	public static void main(String[] args) {
		int[] tabla = {2, 5, 7, 7, 2, 5};
		
		int valor = 7;
		
		tabla = TablaFunciones.buscarTodos(tabla, valor);
		
		System.out.println(Arrays.toString(tabla));
	}

}
