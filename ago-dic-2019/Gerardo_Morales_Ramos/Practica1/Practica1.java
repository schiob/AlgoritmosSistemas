package practica1;
import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {3, 43, 2, 5, 4, 6, 5, 4, 334, 45, 23, 123, 323, 45, 34, 23, 43, 5, 46, 78};
        for (int i = (numeros.length-1); i >= 0; i--){

            if((numeros[i] % 2) == 0){
                    System.out.print(numeros[i] + " "); 
            }
        }  
    }
}