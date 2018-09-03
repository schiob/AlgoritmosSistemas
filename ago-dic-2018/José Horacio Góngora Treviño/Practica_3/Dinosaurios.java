import java.util.Scanner;
public class Dinosaurios 
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);		
		String[] a = new String[100];
		String lista,r="";
		int n=0,j=0;
		
		System.out.println("Nombres de los dinosaurios separados con un espacio:");
		lista=s.nextLine();
		
		for(int i=0;i<lista.length();i++)
		{
			n=i;
			String d="";
			
			while(n!=lista.length()&&lista.charAt(n)!=' ')
			{
				d+=lista.charAt(n);
				n++;
			}
			
			a[j]=d;
			d="";
			j++;
			i=n;
		}
		
		for(int i=0;i<a.length;i++)
		{
			int min=i;
			int g=i;
			String temp;
			
			while(a[g]!=null&&g<a.length)
			{
				if(a[g].length()<a[i].length())
				{
					min=g;
				}
					
				g++;
			}
			
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
		}

		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=null)	
				r+=""+a[i]+" ";
		}
		
		System.out.println("Dinosaurios ordenados del nombre mas pequeño al mas grande:"+"\n"+r);
		
	}
}
