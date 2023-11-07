//SEGUNDO PARCIAL ALGORITMOS DE ORDENAMIENTO Y BUSQUEDA
//MERCEDES ADAMARI MENDOZA ALVARADO | ISC 
package Parcial2.Examenparcial;

import java.util.Scanner;

public class OrdenarNumerosRadixSort {
   
    public static void radixSort(int[] arr) {
        int n = arr.length;
        int tamaximo = 0;

        
        
        for (int num : arr) {//encontrar el numero de cifra mas grande
            tamaximo = Math.max(tamaximo, (int)(Math.log10(num) + 1));
        }

        for (int i = 0; i < tamaximo; i++) {
            countingSort(arr, i);//couting para cada digito
        }
    }//endradix

    public static void countingSort(int[] arr, int pos) {
        int n = arr.length;
        int[] salida = new int[n];
        int[] count = new int[10]; // diigitos del 0 al 9

        for (int num : arr) {
            int cifra = (int) (num / Math.pow(10, pos)) % 10;
            count[cifra]++;
        }

        for (int i = 1; i < count.length; i++) {//suma acumukativa
            count[i] += count[i - 1];
        }
                //conteo de cada digito de la posicion actual
        for (int i = n - 1; i >= 0; i--) {
            int cifra = (int) (arr[i] / Math.pow(10, pos)) % 10;
            salida[count[cifra] - 1] = arr[i];
            count[cifra]--;
        }

        for (int i = 0; i < n; i++) {//reemplaza array con ordenado
            arr[i] = salida[i];
        }
    }//end countingsort

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cantidad de numeros:");
        int n = scanner.nextInt();
        int[] numeros = new int[n];
        
        System.out.println("numeros separados por espacio:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        radixSort(numeros);

        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + " ");
        }
    }//end main
}//end
