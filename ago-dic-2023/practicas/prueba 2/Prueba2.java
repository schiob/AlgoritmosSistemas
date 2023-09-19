import javax.swing.JOptionPane;
import java.util.Scanner;
public class Prueba2 {

    public static void main(String[] args) {


        String input = JOptionPane.showInputDialog("Ingrese el número de problemas (separa por un espacio):");
        String[] inputArray = input.split(" ");
        int n = Integer.parseInt(inputArray[0]);
        int m = Integer.parseInt(inputArray[1]);


        input = JOptionPane.showInputDialog("Ingrese los tiempos para cada problema (separa por espacios):");
        String[] tiemposArray = input.split(" ");
        int[] tiempos = new int[n];
        for (int i = 0; i < n; i++) {
            tiempos[i] = Integer.parseInt(tiemposArray[i]);
        }

        for (int i = 1; i < n; i++) {
            int key = tiempos[i];
            int j = i - 1;
            while (j >= 0 && tiempos[j] > key) {
                tiempos[j + 1] = tiempos[j];
                j = j - 1;
            }
            tiempos[j + 1] = key;
        }

        int problemasHechos = 0;
        int tiempoTotal = 0;
        for (int i = 0; i < n; i++) {
            if (tiempoTotal + tiempos[i] <= m) {
                problemasHechos++;
                tiempoTotal += tiempos[i];
            } else {
                break;
            }
        }


        JOptionPane.showMessageDialog(null, "La mayor cantidad de problemas que David puede hacer es: " + problemasHechos);
    }
}
