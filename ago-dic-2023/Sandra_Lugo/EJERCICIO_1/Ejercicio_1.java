//SANDRA ALEXIA LUGO CEPEDA
//21281988
package Practicas;
import java.util.Scanner;
public class Ejercicio_1 {

    
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa  el numero de medicamentos a ordenar:)");
        int n = sc.nextInt();  // num de medicamentoss
        sc.nextLine();  // LEE número entero
        System.out.println("teclea los medicamentos a otrdenar:");
        String[] Medicamentos = new String[n];
        for(int i = 0; i < n; i++) {
            Medicamentos[i] = sc.next();
        }
        
        for(int i = 0; i < n - 1; i++) {        // Orden de la  burbuja

            for(int j = 0; j < n - i - 1; j++) {
                if(Medicamentos[j].compareTo(Medicamentos[j + 1]) > 0) {

                    String temp = Medicamentos[j];
                    Medicamentos[j] = Medicamentos[j + 1];
                    Medicamentos[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Aquí tienes tus medicinas Ordenadas:)");
        for(int i = 0; i < n; i++) {
            System.out.print(Medicamentos[i]);
            if(i != n - 1) {
                System.out.print(" ");
            }
        }
    }
}





