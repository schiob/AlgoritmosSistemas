package P1;
import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite el total números a ingresar: ");
        int cant = sc.nextInt();
        
        int[] numeros = new int[cant];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite el número " + (i + 1));
            numeros[i] = sc.nextInt();
            System.out.println("");
        }
       
        System.out.println("Salida: ");
        for (int i = (numeros.length-1); i >= 0; i--){
            if((numeros[i] % 2) == 0){
                    System.out.print(numeros[i] + " "); 
            }
        }  
    }
}