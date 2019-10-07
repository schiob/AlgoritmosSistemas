package palindromo;

import java.util.Scanner;

public class Palindromog {
	public static void main(String args[]){
		Cola cola;
		Pila pila;
		Scanner s;
		s = new Scanner(System.in);
		pila = new Pila(20); 
		cola = new Cola(20);
		String paln = ""; boolean error;
		boolean salir = false;
		
		do{
			System.out.print("Escribe una palabra: ");
			paln = s.nextLine();
			error = false;
			
			if(paln.length() > 0){
				for(int i = 0; i < paln.length(); i++){
					if(paln.charAt(i) != ' '){
						cola.insertar(paln.charAt(i));
						pila.push(paln.charAt(i));
					}
				}
				
				while(!pila.isEmpty() && !error){
					char c1 = (char)pila.pop(), c2 = (char)cola.retirar();
					if(c1 != c2){
						error = true;
					}
				}
				
				if(!error){
					System.out.println(paln + " es un palindromo");
				}
				else {
					System.out.println(paln + " no es un palindromo");
				}
				
				
			}
			else salir = true;
		} while(!salir);
		
		System.out.println("Ha salido del programa...");
	}
	
}
