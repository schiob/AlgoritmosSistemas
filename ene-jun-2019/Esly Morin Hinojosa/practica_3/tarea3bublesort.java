package proyectoesli;
import java.util.*;
public class tarea3bublesort 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int num[];
		String nom[];
		int i,j,n,temp;
		String temp2;
		System.out.println("cuantos objetos hay en el almacen");
		n=sc.nextInt();
		nom=new String [n];
		num=new int [n];
		System.out.println("que objetos y cuantos hay en el almacen??");
		for(i=0;i<n;i++)
		{
			nom[i]=sc.next();
			num[i]=sc.nextInt();
		}
		sc.close();	
		System.out.println("nombres de objetos ordenados");
		for(i=0;i<num.length+1;i++)
		{
			for(j=i+1;j<num.length;j++)
			{
				if(num[j]<num[i])
				{
				temp=num[i];
				temp2=nom[i];
				num[i]=num[j];
				nom[i]=nom[j];
				num[j]=temp;
				nom[j]=temp2;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(nom[i]+"\t");
		}
	}

}
