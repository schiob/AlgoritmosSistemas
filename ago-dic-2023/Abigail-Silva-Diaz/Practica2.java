import java.util.Scanner;
import java.util.Arrays;
public class Practica2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa dos numeros enteros separados por un espacio: ");
        int n = entrada.nextInt(); // Numero de problemas
        int m = entrada.nextInt(); // Minutos disponibles
        
        int[] tiemposdisp = new int[n];
        for (int i = 0; i < n; i++) {
            tiemposdisp[i] = entrada.nextInt(); 
        }

        Arrays.sort(tiemposdisp);//el sort nos va a ayudar a acomodar el arreglo de los tiempos
        System.out.println(tiemposdisp);
        int problemasResueltos = 0;
        int tiempoTotal = 0;
        
        for (int i = 0; i < n; i++) {
            if (tiempoTotal + tiemposdisp[i] <= m) {
                problemasResueltos++;
                tiempoTotal += tiemposdisp[i];
            } else {
                break; // No hay suficiente tiempo para resolver problemas
            }
        }
        
        System.out.println(problemasResueltos+" Fueron los problemas resueltos dentro de los "+m+" minutos disponibles");
    }
}
