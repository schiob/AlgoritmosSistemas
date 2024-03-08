import java.util.Scanner;
public class Practica_1 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		 
		int x,y,suma ;
		
		System.out.println("Digite un número: ");
		x=entrada.nextInt();
		
		System.out.println("Digite otro número: ");
		y=entrada.nextInt();
		
		suma= x+y;
		System.out.println("La suma de los numeros ingresados es: " + suma);
		
		
	}
}
