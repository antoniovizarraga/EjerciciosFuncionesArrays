package ejercicio04;

public class Main {

	public static void main(String[] args) {
		int[] tabla = {1, 6, 8, 404, 30, 25};
		
		int result = TablaFunciones.buscar(tabla, 404);
		
		System.out.println("Posición en el Array: " + result);

	}

}
