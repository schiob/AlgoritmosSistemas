import java.util.Scanner;
public class MergeSortLibro 
{
	Libro l[];
	
	public MergeSortLibro(int n)
	{
		l=new Libro[n];
	}
	
	public void ingresar(Scanner sc)
	{
		for(int i=0;i<l.length;i++)
		{
			System.out.print((i+1)+"° Nombre del Libro: ");
			String nombre = sc.next();
			System.out.print("Numero de paginas del Libro "+(i+1)+" :");
			int pag= sc.nextInt();
			
			l[i]= new Libro(nombre,pag);			
		}
	}
	
	public String toString()
	{
		String s="\n";
		s+="Nombre \t Numero de Paginas \n";
		
		for(int i = 0;i<l.length;i++)
		{
			s+= l[i].getNombre() +"\t"+ l[i].getPag()+"\n";
		}
		
		s+="\n";
		return s;
	}
	
	public void MSL(int primero, int ultimo)
	{
		int i,j;

		if(ultimo > 1)
		{
			i= ultimo/2;
			j= ultimo-i;
			
			MSL(primero,i);
			MSL(primero+i,j);
			merge(primero,i,j);
		}
	}

	private void merge(int primero, int i, int j)
	{
		Libro aux[]=new Libro[i+j];
		int temp=0,temp1=0,temp2=0;
		
		while(temp1<i && temp2<j)
		{
			if(l[primero + temp1].getPag() < l[primero + i+temp2].getPag())
				aux[temp++] = l[primero + (temp1++)];	
			else
				aux[temp++] = l[primero + i + (temp2++)];  
		}
		
		while(temp1 < i)
		{
			aux[temp++] = l[primero + (temp1++)];	
		}
		
		while(temp2 < j)
		{
			aux[temp++] = l[primero + i + (temp2++)];	
		}
		
		for(int k=0;k<i+j;k++)
		{
			l[primero+k]=aux[k];
		}
	}
}
