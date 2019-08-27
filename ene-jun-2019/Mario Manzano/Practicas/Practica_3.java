import java.util.*;

public class Practica_3
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] name = new String[n];
        int[] size = new int[n];
        for (int i=0; i<n; i++) {
            name[i] = s.next();
            size[i] = s.nextInt();
        }
        String ts = "";
        int ti = 0;
        for(int i=0; i<n; i++) {
            for(int j=1; j<(n-i); j++) {
               if(size[j-1] < size[j]) {
                   ti = size[j-1];
                   ts = name[j-1];
                   size[j-1] = size[j];
                   name[j-1] = name[j];
                   size[j] = ti;
                   name[j] = ts;
               }    
            }
         }
         Print(name);
    }
      private static void Print(String[] arr) {
      for(int i=0;i<arr.length;i++) {
         System.out.println(arr[i]);
      }
      System.out.println("");
    }
}