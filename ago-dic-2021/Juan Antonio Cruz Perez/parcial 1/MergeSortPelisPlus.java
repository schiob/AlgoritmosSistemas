import java.util.Arrays;
import java.util.Scanner;


public class MergeSortPelisPlus {
    public static void main(String[] args) {
        
 Scanner l = new Scanner (System.in);
        String s = " ";
        //cuantas peliculas tiene juan filomeno
        int n = l.nextInt();
        for (int i = 0; i < n; i++) {
            s = l.nextLine();
            String[] maraton = s.split("\\s+");
        }
        
     

        String arrOrd [] = MergeSort(pelis);
        for (int i = 0; i < pelis.length; i++) {
            System.out.println(pelis[i]);
        }
        System.out.println();
        for (int i = 0; i < arrOrd.length; i++) {
            System.out.printf("%d " , arrOrd[i]);         
        }
    }
    
    public static String [] MergeSort(String arr[]){
    if (arr.length == 1){
        return arr;
    } 
    int middle = arr.length/2;
    int izq[] = Arrays.copyOfRange(arr, 0, middle);
    int der [] = Arrays.copyOfRange(arr, middle, arr.length);
   
    izq = MergeSort(izq);
    der = MergeSort(der);
    
    int res[] = Merge(izq,der);
    
    return res;
    
    
    
    }
    
    public static int [] Merge(int izq[],int der[]){
        int res [] = new int [izq.length + der.length];
        
       int r = 0 ,i = 0,d = 0; 
        for (;r <res.length&& i < izq.length && d< der.length ;r++) {
            if(izq[i]<der[d]){
                res[r] = izq[i];
            i++;
            }else{
                res[r] = der[d];
                d++;
            }
        }
        
        for (; i < izq.length; i++) {
            res[r] = izq[i];
            r++;
        }
        
        for (;d  < der.length; d++) {
            res[r] = der[d];
            r++;
        }
    return res;
    }
}
