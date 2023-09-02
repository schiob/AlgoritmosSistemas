import java.util.Scanner;
public class Ejercicio1 {
	
	public static void main(String args[]) {
		
		
		Scanner entrada = new Scanner (System.in);
		
		int num1, num2,suma;
		String numero;
		System.out.println("Digite los números: ");
		numero = entrada.nextLine();
		
		num1 = Integer.parseInt(String.valueOf( numero.charAt(0)));
		num2 = Integer.parseInt(String.valueOf(numero.charAt(2)));
	
	
		
		System.out.println(num1 + num2);

		
	}

}
