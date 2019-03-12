
package algoritmosorden;
import java.util.Arrays;
import java.util.Scanner;

public class Practica_2 {    
    public static void main(String[] args) {
        
 int valor=0, temp=0;
        Scanner s= new Scanner(System.in);
        System.out.println("Ingrese el numero de hamburguesas entre 1-50 ");
        valor=s.nextInt();
        while(valor > 50 || valor <1) {
            System.out.println("Carajo, que escribas un numero entre 1-50!!");
        valor=s.nextInt();    
        }
        int [] numham= new int [valor];
       
         System.out.println("Ingrese las calificaciones de las hamburguesas (0-100): ");//Se ingresan los numeros al arreglo.

         for (int i = 0; i < valor; i++) 
        {
            
            numham[i] = s.nextInt();
            while (numham[i]>100 ||numham[i]<0) { //aquí se usa para poner los parametros de medición.
                System.out.println("La calificación debe estar entre 0-100");
            numham[i] = s.nextInt();
        }
}
        
        for (int i = 1; i <numham.length; i++) {
            temp=numham[i];
           int j=0;
            for (j =i-1; j >-1 && numham[j]<temp; j--) {
                numham[j+1] = numham[j];
            }
            numham[j+1]=temp;
        }
   System.out.println(Arrays.toString(numham));
    }
}
/*si quiero imprimir sin toString sería: 
         System.out.println("Las calificaciones de mayor a menor son:");
        for (int i = 0; i < numham.length; i++) 
        {
            System.out.print(numham[i]+" ");
        }  */