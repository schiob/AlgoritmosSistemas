
package algoritmos;
import java.util.Scanner;
public class alfabeticamente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        int tamaño;
        tamaño = sc.nextInt();
        String[] CADENA= new String[tamaño]; 
        for(int i=0; i<CADENA.length; i++) 
        {
          CADENA[i] =  n.nextLine();
        }
       
        // ALGORITMO BURBUJA
        String aux; 
        for(int i=1; i<=CADENA.length; i++) {  
            for(int j=0; j<CADENA.length-i; j++) { 
                if( CADENA[j].compareTo( CADENA[j+1] ) > 0 ) { 
                    aux   = CADENA[j]; 
                    CADENA[j]  = CADENA[j+1]; 
                    CADENA[j+1]= aux; 
                }    
            } 
        }
        
        System.out.println("\n Orden Alfabeticamente: "); 
        for(int i=0; i<CADENA.length; i++) {
         System.out.println(CADENA[i]); 
        } 
    }
}
