import java.util.Scanner;
public class Practica_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número total de problemas: ");
        int n = scanner.nextInt();

        int[] problemas = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el tiempo en minutos para el problema " + (i + 1) + ": ");
            problemas[i] = scanner.nextInt();
        }

        
        insertionSort(problemas);

        System.out.print("Ingrese el tiempo disponible en minutos: ");
        int tiempoDisponible = scanner.nextInt();

        
        int[] resultados = problemasPorHacer(n, problemas, tiempoDisponible);
        int cantidadProblemas = resultados[0];
        int tiempoTotal = resultados[1];

        System.out.println("David puede hacer " + cantidadProblemas + " problemas en " + tiempoTotal + " minutos.");

        scanner.close();
     
  	}
	public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int temp = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }

    public static int[] problemasPorHacer(int n, int[] problemas, int tiempoDisponible) {
        int problemasHechos = 0;
        int tiempoTotal = 0;

       
        for (int i = 0; i < n; i++) {
          
            if (tiempoDisponible >= problemas[i]) {
                problemasHechos++;
                tiempoTotal = tiempoTotal + problemas[i];
                tiempoDisponible = tiempoDisponible - problemas[i];
            }
        }

        return new int[]{problemasHechos, tiempoTotal};
    }

}


 



