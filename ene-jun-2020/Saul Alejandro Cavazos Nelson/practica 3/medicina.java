import java.util.Scanner;
public class medicina
{
   public static void main (String []args)
   {
       Scanner nav= new Scanner(System.in);
       int n = Integer.parseInt(nav.nextLine());
       String [] medicinas= new String[n];
       int [] nl= new int [n]; 
       int b=0;
       int c=0;
       String c2=" ";
       for (int i = 0;i<n;i++)
       {
           medicinas[i]=nav.nextLine();
           nl[i]= medicinas[i].length();           
        }
       for (int i=0;i<n-1;i++)
     {
         b=i;
         for (int j=i+1;j<n;j++)
         {
             if (nl[b]>nl[j])
             {
                  b=j;
                }
            }
           c=nl[b];
           c2=medicinas[b];
           nl[b]=nl[i];
           medicinas[b]=medicinas[i];
           nl[i]=c;
           medicinas [i]=c2;
        }
           for (int i=0;i<n;i++)
     System.out.println(medicinas[i]);
    }
}
