package Ordinario;
import java.util.Scanner;
public class Ejercicio2 {
    
    static Scanner s = new Scanner(System.in);
    static Scanner s2 = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        
        String buscando = s.next();
        
        String plumones[] =  new String [n];
        
        for (int i = 0; i < n; i++) {
            plumones[i] = s2.next();
        }
         
        int resultado = binarySearch(plumones, 0, plumones.length-1, buscando);
        
         System.out.println(resultado);
        
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

    
    
    

