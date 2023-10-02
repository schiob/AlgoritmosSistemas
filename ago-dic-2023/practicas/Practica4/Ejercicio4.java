import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio4 {
	
	
	public static void main (String args []) {
		Scanner entrada = new Scanner (System.in);
		
		int tamaño = entrada.nextInt();
		String arreglo [] = new String [tamaño];
		entrada.nextLine();
		String cadena = entrada.nextLine();
		arreglo = cadena.split("\\s+");
		
		Arrays.sort(arreglo);
		
		for (int i = 0; i <arreglo.length ; i++) {
			System.out.println(arreglo[i]);
		}
	}

}
