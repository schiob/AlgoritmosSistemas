import java.util.*;
public class Práctica4 
{	public static void main (String [] args)
	{	Scanner sc= new Scanner (System.in);
		Palindromo revisar=new Palindromo();
		System.out.print("");
		String Palabra= sc.nextLine();
		if(revisar.Palindromo(Palabra))
		{	System.out.print(“Si es”);
		}
		else
		{	System.out.print(“No es”);
		}
		sc.close();
	}
}
