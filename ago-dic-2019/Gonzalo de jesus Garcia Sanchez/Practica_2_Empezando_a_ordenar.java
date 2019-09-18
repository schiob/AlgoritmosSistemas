package algoritmos;
import java.util.Scanner;
public class Practica_2_Empezando_a_ordenar {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("número de minutos disponibles: ");
	        int m = sc.nextInt();
	        
	        int[] arr = {4, 2, 3, 7, 5, 1, 2, 1, 3, 2};
	        for (int i = 1; i < arr.length; i++) {
	            int aux = arr[i];
	            for (int j = (i - 1); j >= 0 && arr[j] > aux; j--) {
	                arr[j + 1] = arr[j];
	                arr[j] = aux;
	            }
	        }

	        int contador = 0, suma = 0, aux;
	        while(suma != m){
	            aux = arr[contador];
	            suma += aux;
	            if (suma > m) {
	                break;
	            }
	            contador ++;
	        }

	        System.out.println("se pueden realizar " + contador + " problemas en 6 minutos");
	    }
	} 
	        
	