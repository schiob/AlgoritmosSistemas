package parcial1;
import java.util.Scanner;

public class ProfeChio {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Ingrese el numero de medicinas a ordenar: ");
        int numeroMedicinas = scn.nextInt();
        scn.nextLine();
        
        System.out.print("Ingrese los nombres de las medicinas a ordenar: ");
        String[] listaMedicinas = scn.nextLine().split(" ");

        scn.close();
        // Implementacion con Insertion Sort
        for (int j = 1; j < listaMedicinas.length; j++) {
            String actual = listaMedicinas[j];

            int i = j - 1;
            while (i >= 0 && actual.compareTo(listaMedicinas[i]) < 0) {
                listaMedicinas[i + 1] = listaMedicinas[i];
                i--;
            }
            listaMedicinas[i + 1] = actual;
        }

        System.out.println("\n");
        for (String elem : listaMedicinas) {
            System.out.print(elem + " ");
        }
    }
}
