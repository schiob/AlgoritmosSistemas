import java.util.Scanner;
public class TestPelicula 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero de Peliculas: ");
		int n=sc.nextInt();
		
		MergeSortPelicula x = new MergeSortPelicula(n);
		x.ingresar(sc);
		System.out.println(x);
		
		System.out.println("Ordenado por Numero de Horas y Minutos");
		x.MSP(0, x.p.length);
		System.out.println(x);
	}
}
