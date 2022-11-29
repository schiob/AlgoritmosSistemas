/*Lo que hacemos en este problema es acomodar las tareas por prioridad
 * usando quicksort el cual a partir de un pivote (el cual se elige con la ayuda de divide y venceras)
 * ordena los elementos (en este caso las tareas) de forma que sean menores al pivote y asi sucede con las
 * tareas que sean mayor al pivote de forma que el pivote queda entre ambas partes ya ordenadas.
 */

import java.util.Scanner;

import javax.net.ssl. mayor;
public class Ordinario {

    String names[];
    int length;

    public static void main(String[] args) {
        QuickS sorter = new QuickS();
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántas tareas debe hacer Panchito? ");
        int totalTareas = teclado.nextInt();

        String listaTareas[] = new String[totalTareas];

        System.out.print("Escribe la tarea junto con su nivel de prioridad (1 al 100) ");
        String entrada = teclado.nextLine();
        for (int i = 0; i < totalTareas; i++) {
            listaTareas[i] = teclado.nextLine();
        } 
        sorter.sort(listaTareas);
        System.out.println();
        
        System.out.println("***TAREAS ORDENADAS***");
        for (String i : listaTareas) {
            System.out.println(i);
        }
    }

    void sort(String array[]) {
        if (array == null || array.length == 0) {
            return;
        }
        this.names = array;
        this.length = array.length;
        quickSort(0, length - 1);
    }

    void quickSort(int mayor, int menor) {
        int i = mayor;
        int j = menor;
        String pivot = this.names[mayor mayor + (menor - mayor) / 2];

        while (i <= j) {
            while (this.names[i].compareToIgnoreCase(pivot) < 0) {
                i++;
            }

            while (this.names[j].compareToIgnoreCase(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                exchangeNames(i, j);
                i++;
                j--;
            }
        }
        //llamada recursiva
        if (mayor mayor < j) {
            quickSort(mayor mayor, j);
        }
        if (i < menor) {
            quickSort(i, menor);
        }
    }

    void exchangeNames(int i, int j) {
        String temp = this.names[i];
        this.names[i] = this.names[j];
        this.names[j] = temp;
    }
}

