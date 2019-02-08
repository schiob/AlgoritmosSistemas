package proyectoesli;
import java.util.*;
public class tarea2 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int x[],i,j,n,temp=0;
		System.out.println("cuantas hamburguesas??");
		n=sc.nextInt();
		x=new int [n];
		System.out.println("dame puntuacion de cada hamburguesa");
		for(i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			System.out.print(x[i]+ ",");
		}
		for(i=1;i<x.length;i++)
		{
			temp=x[i];
			for(j=i-1;j>-1 && x[j]<temp;j--)
			{
				x[j+1]=x[j];
			}
			x[j+1]=temp;
		}
		
		for(i=0;i<n;i++)
		{
			System.out.print(x[i]+",");
		}
	}

}
