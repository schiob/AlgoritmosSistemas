package algoritmosChioS;
import java.util.Scanner;

public class practica_5Merge {


	
	public int [] mergeSort(int[]A)
	{
		if(A.length<=1)
		{
		return A;	
		}else
		{
			
		
		
		int []left;
		int []right;
		
		
		right=new int[A.length/2];
		
		if(A.length %2==0)
		{
			left= new int[A.length/2];
		}else{
			left = new int [(A.length/2+1)];
		}
		
		int i;
		for(i=0; i< left.length;i++)
		{
			left[i]=A[i];
		}
		int k=0;
		for(int j=i;j<A.length;++j)
		{
			right[k]=A[j];
			++k;
		}
		
		
		 int [] arrayOrdenado = merge(mergeSort(left),mergeSort(right));
		
		return arrayOrdenado;
	}
	}
	public int []merge(int[]a,int[]b)
	{
		int i=0;
		int j=0;
		
		int []c = new int [a.length + b.length]; 
	
		for(int k=0;k<c.length;++k)
		{
			if(a[i] < b[j])
			{
				c[k]=a[i];
				++i;
			}else{
				c[k]=b[j];
			++j;
			}
			if(i==a.length)
			{
				++k;
				
				for(j= j;j<b.length;j++)
				{
					c[k]=b[j];
					++k;
				}
			}
			else if(j==b.length)
			{
			++k;
			for(i= i;i<a.length;i++)
			{
				c[k]=a[i];
				++k;
			}
			}
		}
		
		
		
		return c;
	}

}
