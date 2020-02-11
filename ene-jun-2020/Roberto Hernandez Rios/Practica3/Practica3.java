
package algoritmos;
import java.util.Scanner;
public class Practica3 {
   public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        String []arreglo = new String[n];
        entrada.nextLine();
        for (int i = 0; i < n; i++) {
            arreglo[i] = entrada.nextLine();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (arreglo[j].length()>arreglo[j+1].length()) {
                    String aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                } 
            }   
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arreglo[i]);
        }
    } 
}
