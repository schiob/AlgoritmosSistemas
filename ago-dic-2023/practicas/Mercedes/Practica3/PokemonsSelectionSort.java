
package Parcial1;
import java.util.Scanner;

public class PokemonsSelectionSort{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // n pokemones
        System.out.println("Ingresa numero de pokemones que capturaste:");
        int n = s.nextInt();

        // cp pokemones y guarda en arreglo
        System.out.println("Ingresa CP de cada pokemon uno por uno:");
        int[] cp = new int[n];
            for (int i = 0; i < n; i++) {
                cp[i] = s.nextInt();
        }

        selectionSort(cp);
        System.out.println("CP de Pokemones ordenados de mayor a menor:");
        for (int i = 0; i < n; i++) {
            System.out.print(cp[i] + " ");
        }

        s.close();
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length; //obtiene long de arreglo

        for (int i = 0; i < n - 1; i++) { //itera con todos los datos menos el ultimo
            int CPmayor = i; //CP mayor sera el pokemon mas alto en los datos no ordenados

            for (int j = i + 1; j < n; j++) { //busca en todos los datos NO ordenados el pokemon mas alto
                if (arr[j] > arr[CPmayor]) {//compara el dato con el del arreglo y si si, lo sustituye en i
                    CPmayor = j;
                }
            }

            int temp = arr[CPmayor]; //nos guarda temporalmente el cp mas alto 
            arr[CPmayor] = arr[i];//actualiza el valor mayor encontrado
            arr[i] = temp;//ahora el valor de temp es el nuevo maximo despues del que ya estaba anteriormente
        }
    }
}