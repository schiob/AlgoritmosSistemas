package Practicas;
import java.util.Scanner;

public class Practica_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("teclea el numero de palabras");
        int n = sc.nextInt(); // Leemos el número de palabras
        String[] palabras = new String[n]; // Creamos un arreglo para almacenar las palabras
        
        // Leemos las palabras y las almacenamos en el arreglo
        System.out.println("teclea las palabras");
        for (int i = 0; i < n; i++) {
            palabras[i] = sc.next();
        }
        
        insertionSort(palabras); // Ordenamos las palabras con Insertion Sort
        
        // Imprimimos las palabras ordenadas
        System.out.println("Aqui estan las palabras ya ordenadas");
        for (int i = 0; i < n; i++) {
            System.out.print(palabras[i] + " ");
        }
    }
    
    public static void insertionSort(String[] array) {
        for (int i = 1; i < array.length; i++) {
            String key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

}
//no se por que no me ordena correcto el ultimo numero :(