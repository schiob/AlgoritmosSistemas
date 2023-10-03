
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class algoritmosp4 {

    public static void main(String[] args) {
        String NoOrdenada = "";
        String acomodo = "";
        Scanner scanner = new Scanner(System.in);

        String n = JOptionPane.showInputDialog("Escribe el numero de palabras que tiene la lista de Ricardo");
        int lista = Integer.parseInt(n);

        String[] palabras = new String[lista];
        for (int i = 0; i < lista; i++) {
            String palabra = JOptionPane.showInputDialog("Escribe la palabra numero " + (i + 1));
            palabras[i] = palabra.toUpperCase();
        }

        for (String palabra : palabras) {
            NoOrdenada += palabra + "\n";
        }
        JOptionPane.showMessageDialog(null, "LISTA SIN ORDENAR: \n\n" + NoOrdenada);

        insertionSort(palabras);

        for (String palabra : palabras) {
            acomodo += palabra + "\n";
        }
        JOptionPane.showMessageDialog(null, "\nLA LISTA DE RICARDO EN ORDEN ALFABETICO: \n\n" + acomodo);
    }

//INSERTION SORT
    private static void insertionSort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            String Actual = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(Actual) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = Actual;
        }
    }
}
