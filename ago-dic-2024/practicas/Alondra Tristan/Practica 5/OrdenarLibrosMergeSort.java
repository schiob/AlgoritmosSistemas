import java.util.Scanner;

class Libro {
    String nombre;
    int paginas;

    Libro(String nombre, int paginas) {
        this.nombre = nombre;
        this.paginas = paginas;
    }
}
public class OrdenarLibrosMergeSort {
	
	 public static void mergeSort(Libro[] arr, int left, int right) {
	        if (left < right) {
	            int middle = left + (right - left) / 2;

	            // Ordenar la primera y segunda mitad
	            mergeSort(arr, left, middle);
	            mergeSort(arr, middle + 1, right);

	            // Combinar las mitades ordenadas
	            merge(arr, left, middle, right);
	        }
	    }

	    public static void merge(Libro[] arr, int left, int middle, int right) {
	        // Tamaños de los subarrays temporales
	        int n1 = middle - left + 1;
	        int n2 = right - middle;

	        // Crear arrays temporales
	        Libro[] leftArray = new Libro[n1];
	        Libro[] rightArray = new Libro[n2];

	        // Copiar los datos a los arrays temporales
	        for (int i = 0; i < n1; ++i)
	            leftArray[i] = arr[left + i];
	        for (int j = 0; j < n2; ++j)
	            rightArray[j] = arr[middle + 1 + j];

	        // Combinar los arrays temporales
	        int i = 0, j = 0;
	        int k = left;
	        while (i < n1 && j < n2) {
	            if (leftArray[i].paginas <= rightArray[j].paginas) {
	                arr[k] = leftArray[i];
	                i++;
	            } else {
	                arr[k] = rightArray[j];
	                j++;
	            }
	            k++;
	        }

	        // Copiar los elementos restantes de leftArray, si quedan
	        while (i < n1) {
	            arr[k] = leftArray[i];
	            i++;
	            k++;
	        }

	        // Copiar los elementos restantes de rightArray, si quedan
	        while (j < n2) {
	            arr[k] = rightArray[j];
	            j++;
	            k++;
	        }
	    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Leer el número de libros
		System.out.print("Introduce el num de libros, titula y páginas: ");
        int n = Integer.parseInt(scanner.nextLine());
        Libro[] libros = new Libro[n];

        // Leer los libros y almacenarlos en un array
        for (int i = 0; i < n; i++) {
            String[] entrada = scanner.nextLine().split(" ");
            String nombre = entrada[0];
            int paginas = Integer.parseInt(entrada[1]);
            libros[i] = new Libro(nombre, paginas);
        }

        // Ordenar los libros usando Merge Sort
        mergeSort(libros, 0, n - 1);

        // Imprimir los nombres de los libros ordenados
        for (Libro libro : libros) {
            System.out.print(libro.nombre + " ");
        }

        scanner.close();

	}//end main

}//end class