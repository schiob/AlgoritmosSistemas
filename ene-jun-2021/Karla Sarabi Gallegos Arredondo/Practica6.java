package Practicas;
import java.util.Scanner;
public class Practica6 {
    
    static Scanner s = new Scanner(System.in);
    static Scanner s2 = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        
        String arr[] =  new String [n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = s2.next();
        }
        
        quickSort(arr, 0, arr.length-1);
        imprimirArreglo(arr);
    
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
    
    public static void imprimirArreglo(String arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
