import java.util.*;
public class Pokemon 
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		int n=0,m=0;
		String r="";
		
		while(n<1 || n>50)
		{			
			System.out.println("Cuantos pokemon capuraste (de 1 a 50):");
			n= s.nextInt();
		}
		
		int a[] = new int[n];
		
		for(int i=0;i<a.length;i++)
		{	
			while(m<1 || m>2000)
			{
				System.out.println("Cual es su PC (de 1 a 2000:)");
				m= s.nextInt();
			}
			
			a[i]=m;
			m=0;
		}
		 
		for (int i = 1; i < a.length; i++) 
		{
            int q=a[i];
            int j=i-1;
            
            while (j!=-1 && q>a[j]) 
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=q;
        }
		
		for(int i=0;i<a.length;i++)
		{
			r+="\n"+a[i];
		}
		
		System.out.println("Pokemons ordenados del mas fuerte al mas debil:"+r);
	}
}
