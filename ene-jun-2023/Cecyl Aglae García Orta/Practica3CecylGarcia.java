package algoritmos;
import java.util.Scanner;
import java.util.Arrays;

/*@author cecyl*/
public class Practica3 {
    //Método insertion sort.
    public static void sort(String[] A) {
    String C;
        for (int i = 0; i < A.length; i++) {
            C = A[i];
            int j = i - 1;
            while (j >= 0 && A[j].length() > C.length()) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = C;
        }
    }

    //Main.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0;
        do {
            System.out.println("Ingrese cuantos medicamentos va a comparar: ");
            x = Integer.parseInt(s.nextLine());
        } while (!(x >= 1 && x <= 100));
        String[] Palabras = new String[x];
        for (int i = 0; i < Palabras.length; i++) {
            System.out.println("Ingrese los datos en el lugar " + (i+1) + " :");

            Palabras[i] = s.nextLine();
        }
        
        //Impresión.
        System.out.println("Medicamentos iniciales: " + "\n" + Arrays.toString(Palabras));
        sort(Palabras);
        System.out.println("Medicamentos finales: " + "\n" + Arrays.toString(Palabras));

    }
    
}
