package Algoritmos;
import java.util.Scanner;

public class Algoritmos {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int valor1 = 0;
		int valor2 = 0;
		
		System.out.println("ingrese los valores:");
		valor1= s.nextInt();
		valor2= s.nextInt();
		
		int suma = valor1 + valor2;
		
		System.out.println(suma);

	}

}
