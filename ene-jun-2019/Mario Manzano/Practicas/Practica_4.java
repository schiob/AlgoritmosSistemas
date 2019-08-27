import java.util.*;

public class Practica_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String ln = s.nextLine();
        String[] arr = ln.split(" ");
        print(merge(arr));
    }
    
    private static String[] merge(String[] arr) {
        if(arr.length>1) {
            int x = arr.length/2;
            String[] a = Arrays.copyOfRange(arr, 0, x);
            String[] b = Arrays.copyOfRange(arr, x, arr.length);
            return sort(merge(a), merge(b));
        }
        return arr;
    }
    
    private static String[] sort(String[] a, String[] b) {
        String[] arr = new String[(a.length+b.length)];
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length) {
            if(0 >= a[i].compareToIgnoreCase(b[j])) {
                arr[k] = a[i]; i++;
            } else {
                arr[k] = b[j]; j++;
            } k++;
        }
        
        while(i<a.length) {
            arr[k] = a[i];
            i++; k++;
        }
        while(j<b.length) {
            arr[k] = b[j];
            j++; k++;
        }
        return arr;
    }
    
    private static void print(String[] arr) {
      for(int i=0;i<arr.length;i++) {
          System.out.print(arr[i]+" ");
      }
      System.out.println("");
    }
}
