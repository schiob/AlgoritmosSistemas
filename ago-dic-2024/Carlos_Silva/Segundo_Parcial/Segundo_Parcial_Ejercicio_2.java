package Segundo_Parcial;

import java.util.Scanner;

public class Segundo_Parcial_Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de numeros positivos y los numeros positivos: ");
        int num = sc.nextInt();
        int[] numeros = new int[num];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        radixSort(numeros);

        System.out.println("-------ARREGLO ORDENADO------");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        sc.close();
    }

    //FUNCION RADIX SORT

    public static void radixSort(int[] array) {
        //OBTENEMOS EL VALOR MAXIMO
        int valorMaximo = getMax(array);
        //APLICAMOS EL METODO COUNTING SORT
        for (int pivote = 1; valorMaximo / pivote > 0; pivote *= 10) {
            countingSort(array, pivote);
        }
    }

    //FUNCION PARA OBTENER EL VALOR MAXIMO

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    //METODO COUNTING SORT COMO SUBRUTINA

    public static void countingSort(int[] array, int pivote) {
        int size = array.length;
        int[] output = new int[size];
        int[] count = new int[10];

        //CALCULAMOS EL RECUENTO DE ELEMENTOS EN EL ARREGLO
        for (int i = 0; i < size; i++) {
            int index = (array[i] / pivote) % 10;
            count[index]++;
        }

        //CALCULAMOS EL RECUENTO ACUMULADO
        for (int i = 1 ; i < 10; i++) {
            count[i] += count[i - 1];
        }

        //POSICIONAMOS LOS ELEMENTOS EN ORDEN
        for (int i = size - 1; i >= 0; i--) {
            int index = (array[i] / pivote) % 10;
            output[count[index] - 1] = array[i];
            count[index]--;
        }

        //COPIAMOS LOS ELEMENTOS ORDENADOS DENTRO DE EL ARREGLO ORIGINAL
        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }
    }
}
