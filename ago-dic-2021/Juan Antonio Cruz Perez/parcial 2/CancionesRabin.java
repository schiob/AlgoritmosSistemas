
import java.util.Arrays;
import java.util.Scanner;

public class CancionesRabin {

    public static String[] merge(String[] arr) {
        if (arr.length > 1) {
            int mitad = arr.length / 2;
            String[] a = Arrays.copyOfRange(arr, 0, mitad);
            String[] b = Arrays.copyOfRange(arr, mitad, arr.length);
            return Qsort(merge(a), merge(b));
        }

        return arr;
    }

    public static String[] Qsort(String[] a, String[] b) {
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

    private static int binarysearch(String[] arr, String n, int r, int f) {
        if (f >= r) {
            int p = r + (f - r) / 2;
            String x = arr[p];
            if (x.compareTo(n) == 0) {
                return p;
            } else if (x.compareTo(n) < 0) {
                return binarysearch(arr, n, p + 1, f);
            } else {
                return binarysearch(arr, n, r, p - 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String pb = s.nextLine();

        String playbusc2[] = pb.split(" ");

        int[] playbusc3 = new int[playbusc2.length];

        for (int i = 0; i < playbusc3.length; i++) {
            playbusc3[i] = Integer.parseInt(playbusc2[i]);
        }

        String canciones = s.nextLine();

        String cancionesb[] = canciones.split(" ");

        String[] cancionesabuscar = new String[playbusc3[1]];

        for (int i = 0; i < cancionesabuscar.length; i++) {
            cancionesabuscar[i] = s.nextLine();
        }

        System.out.println("");

        System.out.println(Arrays.toString(merge(cancionesb)));

        for (int i = 0; i < cancionesabuscar.length; i++) {
            System.out.println(binarysearch(merge(cancionesb), cancionesabuscar[i], 0, cancionesb.length - 1));
        }

    }
}
