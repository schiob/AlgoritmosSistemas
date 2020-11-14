
import java.util.Scanner;
public class Parcial2E2
{
    public static void main (String[]arg)
    {
      Scanner f= new Scanner(System.in);
      System.out.println("Cuantos tazos tienes y que numero buscas");
      String ca=f.nextLine();// linea  n string
      System.out.println("numeros de serie");
      String [] aux=ca.split(" "); // n
      int n=Integer.parseInt(aux[0]);//n
      int m=Integer.parseInt(aux[1]);//n
      int [] resu= new int[n];
      String re=f.nextLine();
      String [] aux2=re.split(" ");
      for(int i=0;i<n;i++)
      {
          resu[i]=Integer.parseInt(aux2[i]);
      }
      quick_srt(resu,0,resu.length-1);
      binarySearch(resu,0,resu.length-1,m);
    }
    public static void quick_srt(int array[],int low, int n)
    {
      int lo = low;
      int hi = n;
      if (lo >= n) {
          return;
      }
      int mid = array[(lo + hi) / 2];
      while (lo < hi) {
          while (lo<hi && array[lo] < mid) {
              lo++;
          }
          while (lo<hi && array[hi] > mid) {
              hi--;
          }
          if (lo < hi) {
              int T = array[lo];
              array[lo] = array[hi];
              array[hi] = T;
          }
      }
      if (hi < lo) {
          int T = hi;
          hi = lo;
          lo = T;
      }
      quick_srt(array, low, lo);
      quick_srt(array, lo == low ? lo+1 : lo, n);
     }
    public static int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 

            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) 
                {
                    System.out.println(mid +1);
                    return mid;
                } 

            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 

            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid + 1, r, x); 
        } 

        // We reach here when element is not present 
        // in array 
        return -1; 
    } 
}
