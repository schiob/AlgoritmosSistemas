package p2;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class P2 {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ct,tr,te;
        System.out.println("¿Cuántos trabajos vas a ingresar");
        ct=s.nextInt();
        int[] arr1 = new int[ct];   
        for (int w = 0; w < ct; w++) {
            System.out.println("Tiempo estimado");
            te=s.nextInt();
            arr1[w]= te;
        }  
        System.out.println("Tiempo restante");
        tr=s.nextInt();
        
        
        System.out.println("Antes de acomodar");   
        String salida="";
        for(int i:arr1){    
        salida+=(i+" ");    
        } 
        System.out.println(salida+" ");
        
        insertionSort(arr1);
        
        salida="";
        for(int i:arr1){
            tr-=i;
            if(tr>0){
                salida+=i+" ";
            }
        }
        System.out.println("Después de acomodar");
        System.out.println(salida+" ");
        
        } 
     public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key; 
        }
        
    }
    
}
