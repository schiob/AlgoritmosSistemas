import java.util.*;
public class PalabrasBS 
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		String dato;
		String a[]= {"ahola","amundo","cabc","dqwerty","ea72","fjamon","gpanadero"};
		BinarySearch x=new BinarySearch();
		
		System.out.println("Palabra a buscar:");
		dato=sc.nextLine();
		
		System.out.println(x.BinarySearch(a, 0, a.length-1, dato));
	}
}
