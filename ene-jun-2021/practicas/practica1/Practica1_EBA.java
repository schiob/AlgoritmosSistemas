package Parcial_1;
import java.util.*;
public class Practica1_EBA {
	
	//Ernesto Burciaga Aguirre 17528944 Práctica 1 Algoritmos de Ordenamiento y Busqueda 
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Introduzca dos numero mayores a 0 y menores a 100");
		
		int x = in.nextInt(),  y = in.nextInt();  
		
		if((0 <= x && x <= 100) && (0 <= y && y <= 100)) {
		
			System.out.println(x + y);
		
		}
		else {System.out.println("ERROR: Numeros fuera del parametro permitido");}
		
	}
	
}
