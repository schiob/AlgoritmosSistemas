import java.util.Scanner;

public class Practica3
 {

    static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j].length() > arr[j+1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] medicamentos = new String[n];

        for (int i = 0; i < n; i++) {
            medicamentos[i] = scanner.nextLine();
        }

        bubbleSort(medicamentos);

        for (String medicamento : medicamentos) {
            System.out.println(medicamento);
        }

        scanner.close();
    }
}
