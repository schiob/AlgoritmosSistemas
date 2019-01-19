import java.util.*;
public class Bob
{
	static int nodo, arista, MAX=1000;
	static ArrayList<Integer> ady[]= new ArrayList[MAX];
	
	public static void main(String[]args)
	{
		int estanque, rios, origen, destino;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Numero de Estanques");
		estanque= sc.nextInt();
		System.out.println("Numero de rios");
		rios= sc.nextInt();
		
		System.out.println("Origen y destino de cada estanque atraves de los rios");
		
		for(int i=0;i<=rios;i++)
		{
			origen= sc.nextInt();
			destino= sc.nextInt();
			
			ady[origen].add(destino);
			ady[destino].add(origen);
			
			rios--;
		}
		System.out.println(ady);
	}
	
}
