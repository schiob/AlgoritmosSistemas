import java.util.Arrays;
import java.util.Scanner;

public class Practica4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántas palabras hay en tu lista?");
        String entrada = teclado.nextLine();
        int palabras = Integer.parseInt(entrada);

        String listaPalabras[] = new String[palabras];

        System.out.println("Escribe la lista de palabras ");
        String entrada2 = teclado.nextLine();
        listaPalabras = entrada2.split(" ");

        mergeSort(listaPalabras, 0, listaPalabras.length - 1);
        System.out.println(Arrays.toString(listaPalabras));
    }

    public static void mergeSort(String[] array, int izq, int der) {
        if (izq == der) {
            return;
        }
        int m = (izq + der) / 2;
        
        mergeSort(array, izq, m);//MS para mitad izquierda
        mergeSort(array, m + 1, der); //MS para mitad derecha
        merge(array, izq, m, der); //se unen ambas mitades
    }

    public static void merge(String[] array, int izq, int m, int der) {
        int a = der - izq + 1; // rango
        String[] b = new String[a]; // arreglo temporal para ambas mitades
        int c = izq;
        int d = m + 1;
        int e = 0;

        while (c <= m && d <= der) {
            if (array[c].compareTo(array[d]) < 0) {
                b[e] = array[c];
                c++;
            } else {
                b[e] = array[d];
                d++;
            }
            e++;
        }

        // Pasar lo que falte a la izquierda
        while (c <= m) {
            b[e] = array[c];
            c++;
            e++;
        }

        // Pasar lo que falte a la derecha
        while (d <= der) {
            b[e] = array[d];
            d++;
            e++;
        }

        // Pasar del arreglo temporal al original
        for (e = 0; e < a; e++) {
            array[izq + e] = b[e];
        }
    }
}
