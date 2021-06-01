import java.util.Scanner;

public class SUMA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int suma;
		System.out.println("INGRESA TU VALOR DE X");
	x= Integer.parseInt(sc.next());
	System.out.println("INGRESA TU VALOR DE Y");
	y= Integer.parseInt(sc.next());
	suma=(x+y);
	System.out.println("LA SUMA DE LOS ANTERIORES DATOS ES: "+ suma );
	}
}
