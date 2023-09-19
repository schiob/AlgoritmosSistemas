

package Practicas;
import java.util.Scanner;

public class Tarea_De_Calculo {

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Leer la cantidad de problemas y el tiempo disponible
        System.out.println("INGRESA LA CANTIDAD DE PROBLEMAS");
        int n = sc.nextInt();
        System.out.println("INGRESA EL TIEMPO DISPONIBLE");
        int m = sc.nextInt();
        
        // Leer los tiempos de resolución de los problemas y almacenarlos en un arreglo
       System.out.println("INGRESA EL TIEMPO DE CADA PROBLEMA");
        int[] tiempos = new int[n];
        for (int i = 0; i < n; i++) {
            tiempos[i] = sc.nextInt();
        }
        
        // Ordenar la lista de problemas usando Insertion Sort
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && tiempos[j - 1] > tiempos[j]) {
                int temp = tiempos[j];
                tiempos[j] = tiempos[j - 1];
                tiempos[j - 1] = temp;
                j--;
            }
        }
        
        // Calcular cuántos problemas David puede hacer
        int problemasHechos = 0;
        int tiempoRestante = m;
        
        for (int i = 0; i < n; i++) {
            if (tiempos[i] <= tiempoRestante) {
                problemasHechos++;
                tiempoRestante -= tiempos[i];
            } else {
                break; // No hay suficiente tiempo para más problemas
            }
        }
        
        // Imprimir la cantidad de problemas hechos
        System.out.println("LA CANTIDAD DE PROBLEMAS QUE ´PUEDES RESOLVER EN "+m+" MINUTOS SON:"+problemasHechos);
        
        sc.close();
    }
}