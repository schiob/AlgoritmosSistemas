import java.util.Scanner;
public class Suma {
	public static void main(String Args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int r = a+b;
		sc.close();
		System.out.println("La suma es: "+r);
	}
}
