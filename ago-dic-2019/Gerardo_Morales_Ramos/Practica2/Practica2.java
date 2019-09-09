package P1;

import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite el número de minutos disponibles: ");
        int m = sc.nextInt();

        int[] arreglo = {4, 2, 3, 7, 5, 1, 2, 1, 3, 2};
      
        for (int i = 1; i < arreglo.length; i++) {
            int aux = arreglo[i];
            for (int j = (i - 1); j >= 0 && arreglo[j] > aux; j--) {
                arreglo[j + 1] = arreglo[j];
                arreglo[j] = aux;
            }
        }
        
        int contador = 0, suma = 0, aux;
        while(suma != m){
            aux = arreglo[contador];
            suma += aux;
            if (suma > m) {
                break;
            }
            contador ++;
        }
        
        System.out.println("Puedes hacer " + contador + " problemas");
    }
}