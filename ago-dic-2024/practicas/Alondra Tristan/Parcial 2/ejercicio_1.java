import java.util.Scanner;

public class OrdenarColores {
	class Color {
	    public String nombre;
	    public int numero;

	    Color(String nombre, int numero) {
	        this.nombre = nombre;
	        this.numero = numero;
	    }
	}
	
	public static void quickSort(Color[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Ordenar los elementos antes y después de la partición
            quickSort(arr, low, pi - 1);  
            quickSort(arr, pi + 1, high); 
        }
    }
	
	public static int partition(Color[] arr, int low, int high) {
        Color pivot = arr[high];
        int i = (low - 1); 

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                Color temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Color temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el color y el num: ");
        int n = Integer.parseInt(scanner.nextLine());
        Color[] colores = new Color[n];

        // Leer los colores y almacenarlos en un arreglo
        for (int i = 0; i < n; i++) {
            String[] entrada = scanner.nextLine().split(" ");
            String nombre = entrada[0];
            int numero = Integer.parseInt(entrada[1]);
            colores[i] = new Color(nombre, numero);
        }
        
        // Ordenar los numeros usando Quick Sort
        quickSort(colores, 0, n - 1);
        
        for (Color color : colores) {
            System.out.print(color.nombre + " ");
        }

        scanner.close();

	}//end main

}//end class