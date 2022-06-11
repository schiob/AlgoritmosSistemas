package extra2;
import java.util.Scanner;
public class Extra2 {

    static int binarySearch(String[] arr, String x){
         int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2; 
            int res = x.compareTo(arr[m]);
            if (res == 0){
                return m;
            }
            if (res > 0){
                l = m + 1;
            }else{
                r = m - 1;
            }
        } 
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String x, palabra[];
        int cp, first, last, middle;
        System.out.println("Introduce cuántas palabras llevará.");
        cp=Integer.parseInt(s.nextLine());
        palabra = new String[cp];
        for (int i = 0; i < cp; i++) {
            System.out.println("¿Qué palabra quieres añadir?");
            palabra[i]=s.nextLine();
        }
        
        String arr[] = palabra;
        System.out.println("¿Qué palabra quieres buscar?");
        x=s.nextLine();
        first = 0;
        last = cp - 1;
        middle = (first + last)/2;
        
        while( first <= last ){
        if ( palabra[middle].length() < x.length() ){
           first = middle + 1;
        }else if (palabra[middle].length() == x.length()){        
           System.out.println(x + " encontrado(a) en la posición " + (middle + 1) + ".");
           break;
         }
         else
         {
             last = middle - 1;
         }
         middle = (first + last)/2;
      }
      if ( first > last )
          System.out.println("-1");
   }
}
     