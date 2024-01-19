package ejercicio04;

public class TablaFunciones {

	public static int buscar(int t[], int clave) {
		
		int result = 0;
		
		for(int i = 0; i < t.length; i++) {
			if(t[i] == clave) {
				result = i;
				break;
			}
		}
		
		return result;
	}
	
}
