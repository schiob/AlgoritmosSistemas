import java.util.*;
public class Alfabeto 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String lista,r="";
		
		System.out.println("Palabras separadas por un espacio:");
		lista=sc.nextLine();
		 
		String a[]= lista.split(" ");
		
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;i<a.length && i!=j;j++)
			 {
				 if(a[i].compareToIgnoreCase(a[j])<0)
				 {
					 String aux=a[i];
					 a[i]=a[j];
					 a[j]=aux;
				 }
				
					 
			 }
		 }
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=null)	
				r+=""+a[i]+" ";
		}
		
		System.out.println("Palabras ordenas:"+"\n"+r);
		
	}
}
