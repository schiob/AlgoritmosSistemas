import java.util.Scanner;
public class MergeSortPelicula 
{
	Pelicula p[];
	
	public MergeSortPelicula(int n)
	{
		p=new Pelicula[n];
	}
	
	public void ingresar(Scanner sc)
	{
		for(int i=0;i<p.length;i++)
		{
			System.out.print((i+1)+"° Nombre dela Pelicula: ");
			String nombre = sc.next();
			System.out.print("Numero de Horas dela Pelicula "+(i+1)+" :");
			int hrs= sc.nextInt();
			System.out.print("Numero de Minutos dela Pelicula "+(i+1)+" :");
			int min= sc.nextInt();
			
			p[i]= new Pelicula(nombre,hrs,min);			
		}
	}
	
	public String toString()
	{
		String s="\n";
		s+="Nombre \t Hrs \t Min \n";
		
		for(int i = 0;i<p.length;i++)
		{
			s+= p[i].getNombre() +"\t  "+ p[i].getHrs()+"\t  " + p[i].getMin()+"\n";
		}
		
		s+="\n";
		return s;
	}
	
	public void MSP(int primero, int ultimo)
	{
		int i,j;

		if(ultimo > 1)
		{
			i= ultimo/2;
			j= ultimo-i;
			
			MSP(primero,i);
			MSP(primero+i,j);
			merge(primero,i,j);
		}
	}
	
	private void merge(int primero, int i, int j)
	{
		Pelicula aux[]=new Pelicula[i+j];
		int temp=0,temp1=0,temp2=0;
		
		while(temp1<i && temp2<j)
		{
			if(p[primero + temp1].getMin() < p[primero + i+temp2].getMin() && p[primero + temp1].getHrs() < p[primero + i+temp2].getHrs())
				aux[temp++] = p[primero + (temp1++)];	
			else
				aux[temp++] = p[primero + i + (temp2++)];  
		}
		
		while(temp1 < i)
		{
			aux[temp++] = p[primero + (temp1++)];	
		}
		
		while(temp2 < j)
		{
			aux[temp++] = p[primero + i + (temp2++)];	
		}
		
		for(int k=0;k<i+j;k++)
		{
			p[primero+k]=aux[k];
		}
	}


}
