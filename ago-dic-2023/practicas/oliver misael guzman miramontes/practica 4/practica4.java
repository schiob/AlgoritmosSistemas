import java.util.Scanner;
public class practica4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(" ");
        String[] palabras = new String [n];

        for(int i=0;i<n;i++){
            palabras[i]=scanner.next();
        }

        bubbleSort(palabras);
        for (String palabra : palabras) {
            System.out.print(palabra + " ");
        }
    }

    
    private static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
