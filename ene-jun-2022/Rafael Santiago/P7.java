
package p7;
import java.util.Scanner;

public class P7 {

    public static void mergeSort(String[] a, int n) {
    if (n < 2) {
        return;
    }
    int mid = n / 2;
    String[] l = new String[mid];
    String[] r = new String[n - mid];

    for (int i = 0; i < mid; i++) {
        l[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
        r[i - mid] = a[i];
    }
    mergeSort(l, mid);
    mergeSort(r, n - mid);

    merge(a, l, r, mid, n - mid);
}
    
    public static void merge(String[] a, String[] l, String[] r, int left, int right) {
 
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (l[i].compareToIgnoreCase(r[j])<0) {
            a[k++] = l[i++];
        }
        else {
            a[k++] = r[j++];
        }
    }
    while (i < left) {
        a[k++] = l[i++];
    }
    while (j < right) {
        a[k++] = r[j++];
    }
}   
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String actual[], arreglo;
        System.out.println("Cuantas palabras habrá?");
        int c=Integer.parseInt(s.nextLine());
        actual = new String[c];
        for(int i=0; i<c; i++){
            System.out.println("Nombre: ");
            actual[i]=s.nextLine();
        }
        for(int i=0; i<c; i++){
            System.out.print(actual[i]+" ");
        }
        System.out.println();
        mergeSort(actual, c);
        for(int i=0; i<actual.length; i++){
            System.out.print(actual[i]+" ");
        }
        System.out.println();
    }
    
}
