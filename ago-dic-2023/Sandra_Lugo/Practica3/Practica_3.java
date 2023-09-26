
package Practicas;

    import java.util.Scanner;
public class Practica_3 {

    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        // Leer el número de Pokémon
        System.out.println("ingresa el numero de pokémon");
        int n = scanner.nextInt();

        // Leer los CP de los Pokémon
                System.out.println("teclea los numeros");

        int[] cps = new int[n];
        for (int i = 0; i < n; i++) {
            cps[i] = scanner.nextInt();
        }

        // Ordenar los CP de mayor a menor
        for (int i = 0; i < n; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (cps[j] > cps[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Intercambiar los CP en las posiciones i y maxIndex
            int temp = cps[i];
            cps[i] = cps[maxIndex];
            cps[maxIndex] = temp;
        }

        // Imprimir los CP ordenados
        System.out.println("Aqui tienes los numero ordenados");
        for (int cp : cps) {
            System.out.print(cp + " ");
        }
    }
}
    
    
