package practicas_;
import java.util.Scanner;

public class Practica_5 {
  public static void ordenar(String nombres[]) {
       for (int j = 0; j < nombres.length; j++) {
          for (int i = 0; i < nombres.length - j; i++) {
               if (nombres[i].compareTo(nombres[i + 1]) > 0) {
                   String aux;
                 aux = nombres[i];
                  nombres[i] = nombres[i + 1];
                   nombres[i + 1] = aux;
                }
           }
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         int n;
         String[] nombres;

        System.out.println("Numero de palabras en la lista:");
        n = entrada.nextInt();

        nombres = new String[n];
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese el nombre:");
            nombres[i] = entrada.next();
            }
           ordenar(nombres);
            
            for(int i=0;i<nombres.length;i++){
            System.out.print(nombres[i] + " ");
            
         
      }
   } 
}
