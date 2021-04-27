package Practicas;
import java.util.Scanner;
public class Practica8 {
    
    static Scanner s = new Scanner(System.in);
    static Scanner s2 = new Scanner(System.in);

    public static void main(String[] args) {
       int n = s.nextInt();
       int q = s.nextInt();
       
       String arr[] =  new String [n];
        
       for (int i = 0; i < n; i++) {
           arr[i] = s2.next();
       }
        
       quickSort(arr, 0, arr.length-1);
        
       int[] busqueda = new int[q];
        
       for (int i = 0; i < q; i++) {
           System.out.println("Nombre del videojuego a buscar: ");
           String b = s2.next();
           int resultado = binarySearch(arr, 0, arr.length-1, b);
           busqueda[i] = resultado;
       }
        
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
