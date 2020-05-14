import java.util.Scanner;
public class Pelis
{
    public static void main (String[]arg)
    {
        Scanner nav= new Scanner(System.in);
        int n=Integer.parseInt(nav.nextLine());
        String peli="";
        String [] npeli= new String[n];
        int [] h= new int [n];
        int [] m= new int [n];
        int b=0;
        int auxh=0;
        int auxm=0;
        int k=0;
        for (int i=0;i<n;i++ )
        {
            peli=nav.nextLine();
            String [] aux=peli.split(" ");
            npeli[i]=aux[0];
            h[i]= Integer.parseInt (aux[1]);
            m[i]= Integer.parseInt (aux[2]); 
        }
       
        for (int i=0;i<n-1;i++ )
        {
            b=i;
            for(int j=i+1;j<n;j++)
            {
                if (h[b]>h[j])
                {
                    b=j;
                } 
            }
            auxh=h[b];
            auxm=m[b];
            peli=npeli[b];
           h[b]=h[i];
           m[b]=m[i];
           npeli[b]=npeli[i];
           h[i]=auxh;
           m[i]=auxm;
           npeli[i]=peli;
        }
           for (int i=0;i<n-1;i++ )
        {
            b=i;
            for(int j=i+1;j<n;j++)
            {
                if (m[b]>m[j]&&h[b]==h[j])
                {
                    b=j;
                } 
            }
            auxh=h[b];
            auxm=m[b];
            peli=npeli[b];
             h[b]=h[i];
             m[b]=m[i];
             npeli[b]=npeli[i];
            h[i]=auxh;
            m[i]=auxm;
            npeli[i]=peli;
        }
         for (int i=0;i<n-1;i++ )
        {
            b=i;
            for(int j=i+1;j<n;j++)
            {
                if (m[b]==m[j]&&h[b]==h[j])
                {
                    while(npeli[b].charAt(k)==npeli[j].charAt(k))
                     k++;
                   if(npeli[b].charAt(k)>npeli[j].charAt(k) )
                  {
                      b=j;
                    }
                
                } 
            }
            auxh=h[b];
            auxm=m[b];
            peli=npeli[b];
            h[b]=h[i];
            m[b]=m[i];
            npeli[b]=npeli[i];
            h[i]=auxh;
            m[i]=auxm;
            npeli[i]=peli;
        }
        for (int i=0;i<n;i++ )
        {
            if (n-1!=i)
            System.out.print(npeli[i]+" ");
            else 
            System.out.print(npeli[i]);
        }
    }
}
