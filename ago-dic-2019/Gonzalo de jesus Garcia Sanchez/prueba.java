package algoritmos;
import java.util.Scanner;

public class prueba {
	public static void main(String[] args)
    {
		   Scanner sc = new Scanner(System.in);
        int n;
		int i;
		double p;
	    int contador=0;
	    int contador2 = 0;
		int[] numeros = new int [20];
		int[] nuevos_numeros  = new int [8];
		int[] numeros_inversos = new int [8];
	 
	    
    for(i =0; i <numeros.length; i++){
	
	System.out.print("Introduzca un número entero: ");
	numeros[i] = sc.nextInt();
	if(numeros[i] % 2 == 0) {
		System.out.println("el numero " + numeros[i] + " es par");
		nuevos_numeros[contador] = numeros[i];
		contador = contador+1;
	}
    }
	
	for(i=0; i<contador; i++) {
		System.out.println(nuevos_numeros[i]);
	}
	System.out.println("Impresion en orden inverso");
	for(i=contador-1; i>=0;i--) {
		System.out.println(nuevos_numeros[i]);
		
	}
	
 
 }
}