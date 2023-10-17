
import javax.swing.JOptionPane;

public class parcialP2 {

    public static void main(String[] args) {

        // CUANTAS PELICULAS UTILIZA FILOMENO
        String n = JOptionPane.showInputDialog("Inserta el número de películas que va a utilizar Filomeno: ");
        int pelis = Integer.parseInt(n);

        // NOMBRE Y DURACION DE CADA PELICULA
        String[][] info = new String[pelis][3];
        for (int i = 0; i < pelis; i++) {
            info[i][0] = JOptionPane.showInputDialog("Inserta el nombre de la película " + (i + 1));
            info[i][1] = JOptionPane.showInputDialog("Inserta la duración en horas de la película " + (i + 1));
            info[i][2] = JOptionPane.showInputDialog("Inserta el resto de la duración en minutos de la película " + (i + 1));
        }

        System.out.println("Información de las películas sin ordenar:");
        infoPelis(info);

        // MERGESORT
        mergeSort(info, 0, pelis - 1);

        // LISTA ORDENADA
        System.out.println("PELICULAS ORDENADAS:");
        infoPelis(info);
    }

    public static void mergeSort(String[][] arr, int inicio, int fin) {
        if (inicio < fin) {
            int mitad = (inicio + fin) / 2;
            mergeSort(arr, inicio, mitad);
            mergeSort(arr, mitad + 1, fin);
            combinar(arr, inicio, mitad, fin);
        }
    }

    public static void combinar(String[][] arr, int inicio, int mitad, int fin) {
        int izq = mitad - inicio + 1;
        int der = fin - mitad;

        String[][] izquierda = new String[izq][3];
        String[][] derecha = new String[der][3];

        // Copiar los elementos a los subarreglos izquierdo y derecho
        for (int i = 0; i < izq; ++i) {
            izquierda[i] = arr[inicio + i].clone();
        }
        for (int j = 0; j < der; ++j) {
            derecha[j] = arr[mitad + 1 + j].clone();
        }

        // Fusionar los subarreglos izquierdo y derecho
        int i = 0, j = 0, k = inicio;
        while (i < izq && j < der) {
            // Comparar por el nombre de la película (índice 0)
            if (izquierda[i][0].compareToIgnoreCase(derecha[j][0]) <= 0) {
                arr[k] = izquierda[i];
                i++;
            } else {
                arr[k] = derecha[j];
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes de izquierda[] si los hay
        while (i < izq) {
            arr[k] = izquierda[i];
            i++;
            k++;
        }

        // Copiar los elementos restantes de derecha[] si los hay
        while (j < der) {
            arr[k] = derecha[j];
            j++;
            k++;
        }
    }

    public static void infoPelis(String[][] info) {
        for (int i = 0; i < info.length; i++) {
            int j=0;
            System.out.println("Película " + (i + 1) + ":");
            System.out.println("   " + "Nombre" + ": " + info[i][j]);
            System.out.println("   " + "Horas" + ": " + info[i][j + 1]);
            System.out.println("   " + "Minutos" + ": " + info[i][j + 2]);

        }
        System.out.println();
    }
}
