import java.util.Scanner;
public class TestLibro {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero de Libros: ");
		int n=sc.nextInt();
		
		MergeSortLibro x = new MergeSortLibro(n);
		x.ingresar(sc);
		System.out.println(x);
		
		System.out.println("Ordenado por Numero de paginas");
		x.MSL(0, x.l.length);
		System.out.println(x);
	}

}
