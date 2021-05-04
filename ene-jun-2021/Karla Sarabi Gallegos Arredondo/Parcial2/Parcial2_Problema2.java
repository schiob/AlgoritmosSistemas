package Parcial2;
import java.util.Scanner;
public class Parcial2_Problema2 {
    
    static Scanner s = new Scanner(System.in);
    static Scanner s2 = new Scanner(System.in);
    
    public static void main(String[] args) {
        int N = s.nextInt();
        int Q = s.nextInt();
        
        String playlist[] = new String[N];
        
        for (int i = 0; i < N; i++) {
            playlist[i] = s2.next();
        }
        
        quickSort(playlist, 0, playlist.length-1);
        
        int[] busqueda = new int[Q];
        
       for (int i = 0; i < Q; i++) {
           String b = s2.next();
           int resultado = binarySearch(playlist, 0, playlist.length-1, b);
           busqueda[i] = resultado;
       }
       
        for (String elem : playlist) {
            System.out.print(elem + " ");
        }
        
        System.out.println();
        for (int elem : busqueda) {
           System.out.println(elem);
        }  
    }
    
    public static void quickSort(String arr[], int izq, int der){ 
        if(izq>=der){
            return;
        }
        
        String pivote = arr[izq];
        
        int i = izq; 
        int j = der; 
        String aux;
           
        while(i<j){
            while (arr[i].compareTo(pivote)<=0 && i < j){ 
                i++; 
            }
            
            while (arr[j].compareTo(pivote)>0){
                j--;
            }
            
            if (i<j){
                aux = arr[i];                  
                arr[i] = arr[j];
                arr[j] = aux;
            }
        }
        
        arr[izq] = arr[j]; 
        arr[j] = pivote;
        
        if (izq < j-1){
            quickSort(arr,izq,j-1);
        }    
        
        if (j+1 < der){
            quickSort(arr,j+1,der);
        }    
    }
    
    public static int binarySearch(String arr[], int inicio, int fin, String b){
        
        if (fin >= inicio) {
            int mid = (inicio + fin)/ 2;
            
            if (arr[mid].compareTo(b)== 0){
                return mid;
            }
 
            if (arr[mid].compareTo(b) > 0){
                return binarySearch(arr, inicio, mid - 1, b);
            }    
            
            else{
                return binarySearch(arr, mid + 1, fin, b);
            }   
        }
        return -1;
    }
    
}
