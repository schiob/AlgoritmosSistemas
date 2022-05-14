import java.util.Arrays;
import java.util.Scanner;

public class parcial2 {
       public static String[] merge(String[] arreglo) {
        if (arreglo.length > 1) {
            int mitad = arreglo.length / 2;
            String[] e = Arrays.copyOfRange(arreglo, 0, mitad);
            String[] a = Arrays.copyOfRange(arreglo, mitad, arreglo.length);
            return Qsort(merge(a), merge(e));
        }
        return arreglo;
    }

    public static String[] Qsort(String[] a, String[] b) {
        String[] arr = new String[(a.length + b.length)];
        int r = 0, f = 0, k = 0;

        while (r < a.length && f < b.length) {
            if (a[r].compareTo(b[f]) <= 0) {
                arr[k] = a[r];
                r++;
            } else {
                arr[k] = b[f];
                f++;
        }
       k++;
        }
         while (r < a.length) {
            arr[k] = a[r];
        r++;
            k++;
        }while (f < b.length) {
            arr[k] = b[f];
            f++;
            k++;
        }
      return arr;
    }
  private static int binarysearch(String[] arreglo, String n, int e, int j) {
        if (j >= e) {
            int p = e + (j - e) / 2;
            String x = arreglo[p];
            if (x.compareTo(n) == 0) {
                return p;
            } else if (x.compareTo(n) < 0) {
                return binarysearch(arreglo, n, p + 1, j);
            } else {
                return binarysearch(arreglo, n, e, p - 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String sc = s.nextLine();

        String canbusca4[] = sc.split(" ");

        int[] canbusca5 = new int[canbusca4.length];

        for (int i = 0; i < canbusca5.length; i++) {
            canbusca5[i] = Integer.parseInt(canbusca4[i]);
        }

        String canciones = s.nextLine();

        String cancionesb[] = canciones.split(" ");

        String[] cancionesbusca= new String[canbusca5[1]];

        for (int i = 0; i < cancionesbusca.length; i++) {
            cancionesbusca[i] = s.nextLine();
        }
                System.out.println("");

        System.out.println(Arrays.toString(merge(cancionesb)));

        for (int i = 0; i < cancionesbusca.length; i++) {
            System.out.println(binarysearch(merge(cancionesb), cancionesbusca[i], 0, 
            cancionesb.length - 1));
        }

   
    }
}