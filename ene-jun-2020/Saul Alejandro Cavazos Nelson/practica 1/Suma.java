import java.util.Scanner;
public class Suma
{
    public static void main (String [] args)
    {
        Scanner nav= new Scanner (System.in);
        int a = 0;
        int b= 0;
        boolean aa= false;
        boolean bb= false;
        do{
         
         a = nav.nextInt();
         if (a<100&&a>-100)
         {
            aa= true;}
             
            
        }
        while (aa!=true);
        do{
     
         b =nav.nextInt();
         if (b<100&&b>-100)
         {
             bb= true;
            }
            
        }
          while (aa!=true);
    int sum= a+b;
    System.out.println(sum);
    }
}
