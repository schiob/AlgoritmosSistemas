import java.util.Scanner;

public class P4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NoManos = scanner.nextInt();

        for (int i = 0; i < NoManos; i++) {

            int NoCartas = scanner.nextInt();

            String[] Cartas = new String[NoCartas];
            for (int j = 0; j < NoCartas; j++) {
                Cartas[j] = scanner.next();
            }

            mergeSort(Cartas);
            System.out.println();
            for (int k = 0; k < Cartas.length; k++) {
                System.out.print(Cartas[k] + " ");
            }
        }
    }

    public static void mergeSort(String[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        String[] temp = new String[arr.length];
        mergeSortHelper(arr, temp, 0, arr.length - 1);
    }

    private static void mergeSortHelper(String[] arr, String[] temp, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSortHelper(arr, temp, left, mid);
            mergeSortHelper(arr, temp, mid + 1, right);
            merge(arr, temp, left, mid, right);
        }
    }

    private static void merge(String[] arr, String[] temp, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (comparaCartas(temp[i], temp[j]) <= 0) {
                arr[k++] = temp[i++];
            } else {
                arr[k++] = temp[j++];
            }
        }
        while (i <= mid) {
            arr[k++] = temp[i++];
        }
    }

    private static int comparaCartas(String carta1, String carta2) {
        int value1 = obtenerValor(carta1);
        int value2 = obtenerValor(carta2);

        if (value1 == value2) {
            return comparaPalos(carta1, carta2);
        }

        return Integer.compare(value1, value2);
    }

    private static int obtenerValor(String carta) {
        switch (carta.charAt(0)) {
            case 'T':
                return 10;
            case 'J':
                return 11;
            case 'Q':
                return 12;
            case 'K':
                return 13;
            case 'A':
                return 1;
            default:
                return Integer.parseInt(carta.substring(0, carta.length() - 1));
        }
    }

    private static int comparaPalos(String carta1, String carta2) {
        char palo1 = carta1.charAt(1); 
        char palo2 = carta2.charAt(1); 

        String palosJerarquia = "ECTD"; 

        return Integer.compare(palosJerarquia.indexOf(palo1), palosJerarquia.indexOf(palo2));
    }
}
