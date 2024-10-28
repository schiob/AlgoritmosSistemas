import java.util.Scanner;

public class PrimeraPractica {

	public static void main(String[] args) {
		
	
		int n1,n2;
		
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Ingrese los numeros dando un espacio ejemplo n1 ' ' n2'");
		n1 = lee.nextInt();
		n2 = lee.nextInt();
		
		int resultado;
		
		resultado = n1+n2;
		
		System.out.println("El resultado es: "+resultado);
		
		

	}

}
