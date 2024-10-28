import java.util.Scanner;

public class Practica_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lectura del número de pokemons
        int n = sc.nextInt();

        // Lectura de la lista de pokemons
        //pokemons = arreglo
        
        int[] pokemons = new int[n];
        for (int i = 0; i < n; i++) {
            pokemons[i] = sc.nextInt();
        }

        // Ordenamiento burbuja
        for (int i = 0; i < pokemons.length - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (pokemons[j] < pokemons[j+1]) {
                    int temp = pokemons[j];
                    pokemons[j] = pokemons[j+1];
                    pokemons[j+1] = temp;
                }
            }
        }

        // Impresión de la lista ordenada
        for (int i = 0; i < n; i++) {
            System.out.print(pokemons[i] + " ");
        }
    }
}
