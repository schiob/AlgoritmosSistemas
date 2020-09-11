import java.util.*;
public class Práctica2 
{	public static void main(String[] args) 
	{	int n, m;
		Scanner sc= new Scanner (System.in);
		n= sc.nextInt();
		m= sc.nextInt();
		int [] arr= new int [n];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]= sc.nextInt();
		}
		for(int i=1; i<arr.length; i++)
		{	int actual= arr[i];
			int j= i -1;
			while ((j>= 0) && arr[j] > actual)
			{	arr[j+1]= arr[j--];
			}
			arr[j+1]= actual;
		}
		int suma=0;
		int count=0;
		for(int i=0; i<arr.length; i++)
			{	if (suma< m)
				{	suma+= arr[i];
					count ++;
				}
			}
		System.out.println(count);
	}
}
