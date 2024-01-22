package ejercicio05;

public class TablaFunciones {

	public static int[] buscarTodos(int t[], int valor) {
		
		int aux = 0;
		
		int indiceBusqueda = 0;
		
		while(indiceBusqueda < t.length && valor != t[indiceBusqueda]) {
			indiceBusqueda++;
		}
		
		int[] tabla = new int[indiceBusqueda];
		
		indiceBusqueda = 0;
		
		while(indiceBusqueda < t.length - 1) {
			indiceBusqueda++;
			if(valor == t[indiceBusqueda]) {
				tabla[aux] = indiceBusqueda;
				aux++;
			}
		}
	
		return tabla;
	}
}
