import java.util.*;
public class Práctica3 
{	public static void main (String [] args)
	{	int n;
		Scanner sc= new Scanner (System.in);
		n= sc.nextInt();
		while((n>=1) && (n<=50))
			break;
		int [] arr= new int [n];
		for(int i=0; i<arr.length; i++)
		{	int ni= sc.nextInt();
			while((n>=1) && (n<=2000) )
				break;
			arr[i]= ni;			
		}
		for(int i=1; i<arr.length; i++)
		{	int actual= arr[i];
			int j=i-1;
			for(; j>=0; j--)
			{	if(arr[j] > actual)
				{	break;
				}
			arr[j+1]= arr[j];
			}
			arr[j+1]= actual;
		}	
		for(int i=0; i<arr.length;i++)
		{	System.out.print(arr[i] + "");
		}
	}
}
