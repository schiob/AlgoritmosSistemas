import java.util.Scanner;
public class InsertionSort
{
   public static void main (String []args)
   {
       Scanner nav= new Scanner(System.in);
       String c= nav.nextLine() ;
       int b=0;
       int j=0;
       String[] o= c.split(" ");
       int [] a = new int [o.length];
       
      for (int i=0;i<a.length;i++)
        
        a[i]=Integer.parseInt(o[i]);
       for (int i =1;i<a.length;i++)
       {
            b = a[i];
           for ( j=i-1;j>=0;j--)
           {
                
               
               if (a[j]>b)
               {  
                  break;
                }
                else
                {
                  a[j+1]=a[j];

                } 

            }
            a[j+1]=b;
        }
       
        for (int i=0;i<a.length;i++)
        {
         if(a[i]%2==0)
          System.out.print(a[i]+" ");
        }
    }
    }

