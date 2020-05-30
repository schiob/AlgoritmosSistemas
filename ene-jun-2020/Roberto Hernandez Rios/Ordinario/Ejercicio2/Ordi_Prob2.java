
package algoritmos;
import java.util.Scanner;
public class Ordi_Prob2 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String q = in.next();
        String actividades[] = new String[n];
        int precio[] = new int[n];
        int indices[] = new int [n];
        for (int i = 0; i < n; i++) {
            actividades[i] = in.next();
            precio[i] = in.nextInt();
            indices[i] = i+1;
        }
        QuickSort(indices,actividades,0,n-1);
        System.out.println("");                
        System.out.println(BinarySearch(actividades,indices,q,0,n-1));
    }    
        public static void QuickSort(int arr[],String arre[],int low, int n){
            int lo = low;
            int hi = n;
            String aux;
            if (lo >= n) {
                return;
            }
            String mid = arre[(lo + hi)/2];
            while(lo < hi){
                while(lo < hi && arre[lo].compareTo(mid) < 0){
                    lo++;
                }
                while(lo < hi && arre[hi].compareTo(mid) > 0){
                    hi--;
                }
                if (lo < hi) {
                    int t = arr[lo];
                    arr[lo] = arr[hi];
                    arr[hi] = t;
                    aux = arre[lo];
                    arre[lo] = arre[hi];
                    arre[hi] = aux;
                }
            }
            if (hi < lo) {
                int t = hi;
                hi = lo;
                lo = t;                
            }
            QuickSort(arr,arre,low,lo);
            QuickSort(arr,arre,lo == low? lo+1 : lo,n);
        }
        public static int BinarySearch(String arr[],int array[],String busqueda,int left,int right){
        if (left > right) {
            return -1;
        }
        int indice = (int)Math.floor((left+right)/2);
        String elementoMedio = arr[indice];
        int resultComp = busqueda.compareTo(elementoMedio);
        if (resultComp == 0) {
            return array[indice];
        }
        if (resultComp < 0) {
            right = indice - 1;
            return BinarySearch(arr,array,busqueda,left,right);
        }else{
            left = indice + 1;
            return BinarySearch(arr,array,busqueda,left,right);
        }
    }
}
