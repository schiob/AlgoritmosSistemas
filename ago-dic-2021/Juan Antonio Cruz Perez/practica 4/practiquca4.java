
import java.util.Arrays;
import java.util.Scanner;

public class practiquca4 {

    public static String[] merge(String[] arr) {
        if (arr.length > 1) {
            int mitad = arr.length / 2;
            String[] a = Arrays.copyOfRange(arr, 0, mitad);
            String[] b = Arrays.copyOfRange(arr, mitad, arr.length);
            return sort(merge(a), merge(b));
        }

        return arr;
    }

    public static String[] sort(String[] a, String[] b) {
        String[] arr = new String[(a.length + b.length)];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i].compareTo(b[j]) <= 0) {
                arr[k] = a[i];
                i++;
            } else {
                arr[k] = b[j];
                j++;
            }

            k++;
        }

        while (i < a.length) {
            arr[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            arr[k] = b[j];
            j++;
            k++;
        }

        return arr;
    }



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        String pderichi = s.nextLine();

        String[] richardo = pderichi.split(" ");

        System.out.println("");

        System.out.println(Arrays.toString(merge(richardo)));



    }
}
