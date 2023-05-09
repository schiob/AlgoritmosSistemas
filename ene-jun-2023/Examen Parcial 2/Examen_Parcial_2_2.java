package U2;

/**
 *
 * @author Cancino
 */
import java.util.*;

public class Examen_Parcial_2_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String[] playlist = new String[n];
        for (int i = 0; i < n; i++) {
            playlist[i] = sc.next();
        }
        quicksort(playlist, 0, n - 1);
        for (String song : playlist) {
            System.out.print(song + " ");
        }
        System.out.println();
        for (int i = 0; i < q; i++) {
            String song = sc.next();
            int pos = binarySearch(playlist, song);
            System.out.println(pos);
        }
    }

    private static void quicksort(String[] arr, int left, int right) {
        int i = left, j = right;
        String tmp;
        String pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (arr[i].compareToIgnoreCase(pivot) < 0) {
                i++;
            }
            while (arr[j].compareToIgnoreCase(pivot) > 0) {
                j--;
            }
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }

        if (left < j) {
            quicksort(arr, left, j);
        }
        if (i < right) {
            quicksort(arr, i, right);
        }
    }

    private static int binarySearch(String[] arr, String x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = arr[mid].compareToIgnoreCase(x);
            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
