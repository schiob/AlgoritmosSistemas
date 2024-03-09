import java.util.Scanner;

public class practica_4 {

    static void mergeSort(String[][] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(String[][] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        String[][] L = new String[n1][2];
        String[][] R = new String[n2][2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (valorCarta(L[i]) < valorCarta(R[j]) || (valorCarta(L[i]) == valorCarta(R[j]) && paloCarta(L[i]) < paloCarta(R[j]))) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static int valorCarta(String[] carta) {
        String valor = carta[0];
        switch (valor) {
            case "A":
                return 1;
            case "T":
                return 10;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            default:
                return Integer.parseInt(valor);
        }
    }

    static char paloCarta(String[] carta) {
        return carta[1].charAt(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos numeros de manos siguen:");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int t = 0; t < n; t++) {
            int m = scanner.nextInt();
            scanner.nextLine(); 

            String[][] mano = new String[m][2];
            for (int i = 0; i < m; i++) {
                mano[i] = scanner.nextLine().split(" ");
            }

            mergeSort(mano, 0, m - 1);

            for (int i = 0; i < m; i++) {
                System.out.print(mano[i][0] + mano[i][1] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}