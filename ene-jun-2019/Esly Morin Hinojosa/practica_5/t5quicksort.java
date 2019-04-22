package proyectoesli;
import java.util.*;
public class t5quicksort 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String x[];
		int n;
		String elemento;
		System.out.println("cuantas palabras quieres ordenar???");
		n=sc.nextInt(); 
		x=new String[n];
		elemento=sc.next();
		System.out.println("cuales palabras vaz a ordenar??");
		for(int i=0;i<n;i++)
		{
			x[i]=sc.next();
		}
		t5quicksort ordenar=new t5quicksort();
		ordenar.quicksort(x,0,x.length-1);
		System.out.println("palabras ordenadas");
		for(String y:x)
		{
			System.out.print(y+"\t");
		}
		t5quicksort buscar=new t5quicksort();
		 buscar.binarysearch(x, elemento);
	   System.out.println( buscar.binarysearch(x, elemento));
		
	}

	public String[] quicksort(String x[],int izq,int der)
	{
		int i=izq;
		int d=der;
		
		if(izq>=der)
		{
			return x;
		}
		if(izq!=der)
		{
			int p=izq;
			while(izq!=der)
			{
				while(x[der].compareTo(x[p])>0 && izq<der)
				{
				    der--;
				}
				while(x[izq].compareTo(x[p])<0 && izq<der)
				{
	                izq++;
				}
				if(der!=izq)
				{
					String temp;
					temp=x[der];
					x[der]=x[izq];
					x[izq]=temp;
				}
				if(izq==der)
				{
					quicksort(x,i,der-1);
					quicksort(x,izq+1,d);
				}
				
			}
			
		}
		else 
			
			return x;
			
		return x;
	}
	public int binarysearch(String x[], String elemento)	
	{
		int prim=0;
		int ultimo=x.length;
		for(int i=0;i<x.length && prim<=ultimo;i++)
		{
			int centro=((x.length-1)/2);
			if(elemento.equals(x[centro]))
			{
				return centro;
			}
			else
				if(elemento.compareTo(x[centro])<0)
				{
					ultimo=centro-1;
				}
				else
				{
					prim=centro+1;
				}
		}
		return -1;
	}
}
