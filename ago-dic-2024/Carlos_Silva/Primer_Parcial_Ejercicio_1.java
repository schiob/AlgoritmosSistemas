import java.util.Scanner;

public class Primer_Parcial_Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de medicinas recetadas: ");
        int med = sc.nextInt();
        String arr[] = new String[med];

        System.out.println("Medicinas recetadas son: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        for(int i = 0; i < arr.length; i++) {
            int aux = i;
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[aux].charAt(0) > arr[j].charAt(0)) {
                    aux = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[aux];
            arr[aux] = temp;
        }

        System.out.println("lista Ordenada de medicinas");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}