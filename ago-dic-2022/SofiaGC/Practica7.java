import java.util.Scanner;
public class Practica7 {
	public static void main(String[] args){
	Scanner teclado = new Scanner(System.in);

	System.out.print("¿Cuántos videojuegos hay y cuántas busquedas hay que hacer? ");
	String entrada = teclado.nextLine();
	String[] separa = entrada.split(" ");
    int juegos = Integer.parseInt(separa[0]);
	String videojuegos[] = new String[juegos];
    int busquedas = Integer.parseInt(separa[1]);
	String busquedasL[] = new String[busquedas];

	System.out.print("Ingresar el nombre de cada uno de los videojuegos ");
	String entrada2 = teclado.nextLine();
	videojuegos = entrada2.split(" ");

	System.out.print("¿Qué videojuegas busca? ");
         for (int i = 0; i < busquedas; i++) {
            busquedasL[i] = teclado.nextLine();
        }

		quickSort(videojuegos, 0, videojuegos.length -1 );
		for (int i = 0; i < videojuegos.length; i++)
            System.out.print(videojuegos[i] + " ");
  
        System.out.println();
		
        for (int i = 0; i < videojuegos.length; i++) {
            System.out.println(videojuegos[i]);
        }
        System.out.println();

        for (int i = 0; i < busquedas; i++) {
            System.out.println(binarySearch(videojuegos, 0, videojuegos.length, busquedasL[i]));
        }
    
	}
	static void quickSort(String[] arr, int low, int high){
        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
	static int partition(int[] arr, int low, int high){
  
        int pivote = arr[high];

        int i = (low - 1);
  
        for (int j = low; j <= high - 1; j++) {
  
            if (arr[j] < pivote) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
	static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	public static int binarySearch(String arr[], int l, int r, String x){
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid].equals(x))
                return mid;
 
            if (arr[mid].compareTo(x) < 0)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
}

