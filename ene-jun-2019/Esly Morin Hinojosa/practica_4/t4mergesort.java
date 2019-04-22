package proyectoesli;
import java.util.*;
public class t4mergesort 
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String x[];
		int n;
		System.out.println("cuantas palabras");
		n=sc.nextInt();
		x=new String[n];
		System.out.println("cuales palabras quieres ordenar??");
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc.next();
		}
		t4mergesort ordenar=new t4mergesort();
		ordenar.mergesort(x);
		System.out.println("palabras ordenadas");
		for(String y:x)
		{
			System.out.print(y+"\t");
		}
	}
	public String [] mergesort(String x[])
	{
		if(x.length<2)
		{
			return x;
		}
		String izq[];
		String der[];
		izq=Arrays.copyOfRange(x,0,x.length/2);
		der=Arrays.copyOfRange(x,x.length/2,x.length);
		mergesort(izq);
		mergesort(der);
		mergesort2(x,izq,der);
		return x;
	}
	public String [] mergesort2(String x[],String izq[],String der[])
	{
		int i=0;
		int d=0;
		for(int j=0;j<x.length;j++)
		{
			if(i>=izq.length)
			{
				x[j]=der[d];
				d++;
				continue;
			}
			if(d>=der.length)
			{
				x[j]=izq[i];
				i++;
				continue;
			}
			if(izq[i].compareTo(der[d])<0)
			{
				x[j]=izq[i];
				i++;
			}
			else
			{
				x[j]=der[d];
				d++;
			}
		}
		return x;
	}
}
