package Actividades__P2;

public class Binary_Search {
	// Crear la funcion de la busqueda binaria siguiendo el enfoque del metodo
	// recursivo de divide y venceras
	int binarySearch(String arr[], int l, int r, String x) {
		// Si r es mayor o igual que l
		if (r >= l) {
			// la variable mid será igual a l mas la resta de r menos l entre dos
			int mid = 1 + (r - l) / 2;

			// Si el elemento está presente en el
			// medio mismo
			if (arr[mid].equals(x))
				return mid; // retornar mid

			// Si el elemento es más pequeño que mid, entonces
			// solo puede estar presente en el subarreglo izquierdo
			if (arr[mid].compareTo(x) < 1)
				return binarySearch(arr, l, mid - 1, x);

			// De lo contrario, el elemento solo puede estar presente
			// en el subarreglo derecho
			else {
				return binarySearch(arr, mid + 1, r, x);
			}
		}

		// Llegamos aquí cuando el elemento no está presente
		// en la matriz
		return -1;
	}

	// Driver method to test above
	public static void main(String args[]) {
		Binary_Search ob = new Binary_Search();
		String arr[] = { "TacosPastor 70", "Teclado 200", "Audífonos 1000", "NintendoSwitch 9000", "Iphone 15000",
				"LaptopLenovo 20000" };
		int n = arr.length;
		String x = "NintendoSwitch 9000";
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Elemento no encontrado");
		else
			System.out.println("Elemento encontrado en el indice:  " + result);
	}
	/*NOTA: El codigo tiene un error al querer buscar los ultimos 
	 * dos campos del array por lo que está incompleto, 
	 * además los arreglos empiezan desde el 0 por lo que al buscar Nintendo switch... 
	 * este se encontrará en el arreglo 3*/

}
