package practica1;
import java.util.Scanner;
public class pract1 {

	public static void main () {
		Scanner lee = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("Ingresa un numero: ");
		x = lee.nextInt();
		
		System.out.print("Ingresa un numero: ");
		y = lee.nextInt();
		
		if (x <= -100 && y <= 100) {
			double sum = x+y;
			System.out.println(sum);
		}else {
			System.out.println("No cumple las condiciones.");
		}
	}
}
