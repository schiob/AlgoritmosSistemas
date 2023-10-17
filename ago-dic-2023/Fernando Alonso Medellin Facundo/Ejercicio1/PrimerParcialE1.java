import java.util.Scanner;

public class PrimerParcialE1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingresa el numero de Medicamentos");
        int n = scn.nextInt();
        scn.nextLine();
        System.out.println("Nombre de Medicinas");
        String[] arr = scn.nextLine().split(" ");
        for (int j = 1; j < arr.length; j++) {
            String actual = arr[j];
            int i = j - 1;
            while (i >= 0 && arr[i].compareTo(actual) > 0) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = actual;
        }

        for (String palabra : arr) {
            System.out.print(palabra +" ");

        }
    }
}
