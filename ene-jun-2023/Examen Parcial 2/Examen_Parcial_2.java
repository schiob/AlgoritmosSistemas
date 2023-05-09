package U2;

/**
 *
 * @author Cancino
 */
import java.util.*;

public class Examen_Parcial_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String x = sc.next();

        String[] libros = new String[n];
        for (int i = 0; i < n; i++) {
            libros[i] = sc.next();
        }

        Arrays.sort(libros);

        int pos = binarySearch(libros, x);
        System.out.println(pos);
    }

    public static int binarySearch(String[] arr, String x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid].equals(x)) {
                return mid;
            } else if (arr[mid].compareTo(x) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
