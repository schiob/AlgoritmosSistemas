
import java.util.Arrays;
import java.util.Scanner;

public class algoritmosp2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cuantos problemas vas a resolver?");
        int n = entrada.nextInt();
        System.out.println("¿Cuanto tiempo tienes para resolverlos? En minutos");
        int m = entrada.nextInt();
        int[] tiempos = new int[n];

        System.out.println("\nESCRIBE EN MINUTOS CUANTO TIEMPO TARDAS CON CADA PROBLEMA");
        for (int i = 0; i < n; i++) {
            System.out.println("\n Problema " + (i + 1) + ":");
            tiempos[i] = entrada.nextInt();
        }
        
        System.out.println("\nArreglo desordenado");
        System.out.println(Arrays.toString(tiempos));
        // Ordenar usando insertion sort
        for (int i = 1; i < n; i++) {
            int valorActual = tiempos[i];
            int j = i - 1;

            while (j >= 0 && tiempos[j] > valorActual) {
                tiempos[j + 1] = tiempos[j];
                j--;
            }

            tiempos[j + 1] = valorActual;
        }

        int problemasResueltos = 0;
        int tiempoTotal = 0;

        // Calcular cuantos puede resolver recorriendo el arreglo
        for (int i = 0; i < n; i++) {
            if (tiempoTotal + tiempos[i] <= m) {
                problemasResueltos++;
                tiempoTotal += tiempos[i];
            } else {
                break;
            }
        }
        System.out.println("\n Arreglo ordenado:");
        System.out.println(Arrays.toString(tiempos));
        
        System.out.println("\n Problemas resueltos en el tiempo requerido:" + problemasResueltos);
    }
}
