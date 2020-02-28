import java.util.Scanner;
public class medallas
{
    public static void main (String []args)
   {
       Scanner nav= new Scanner(System.in);
       int n=Integer.parseInt(nav.nextLine());
       String [] no =new String[n] ;
       
       int [] o=new int [n] ;
       int [] p=new int [n] ;
       int [] b=new int [n] ;
       int auxa=0;
       int aux1=0;
       int aux2=0;
       int aux3=0;
       String auxs="";
       for (int i =0;i<n;i++)
       {
           String cha= nav.nextLine();
           String [] aux=cha.split(" ");
            no[i]=aux[0];
            o[i]=Integer.parseInt(aux[1]);
            p[i]=Integer.parseInt(aux[2]);
            b[i]=Integer.parseInt(aux[3]);   
        }
     
         for (int i=0;i<no.length-1;i++)
        {
         auxa=i;
         for (int j=i+1;j<no.length;j++)
         {
             if (o[auxa]<o[j])
             { 
               auxa=j;
            }
            }
           aux1=o[auxa];
           aux2=p[auxa];
           aux3=b[auxa];
           auxs=no[auxa];
           o[auxa]=o[i];
           p[auxa]=p[i];
           b[auxa]=b[i];
           no[auxa]=no[i];
           o[i]=aux1;
           p[i]=aux2;
           b[i]=aux3;
           no[i]=auxs;      
        }
       for (int i=0;i<no.length-1;i++)
     {
         auxa=i;
         for (int j=i+1;j<no.length;j++)
         {
             if (o[auxa]==o[j]&&p[auxa]<p[j])
             { 
               auxa=j;
            }
            }
           aux1=o[auxa];
           aux2=p[auxa];
           aux3=b[auxa];
           auxs=no[auxa];
           o[auxa]=o[i];
           p[auxa]=p[i];
           b[auxa]=b[i];
           no[auxa]=no[i];
           o[i]=aux1;
           p[i]=aux2;
           b[i]=aux3;
           no[i]=auxs;      
        }
         for (int i=0;i<no.length-1;i++)
        {
         auxa=i;
         for (int j=i+1;j<no.length;j++)
         {
             if (p[auxa]==p[j]&&b[auxa]<b[j]&&o[auxa]==o[j])
             { 
               auxa=j;
            }
            }
           
           aux2=p[auxa];
           aux3=b[auxa];
           auxs=no[auxa];
           p[auxa]=p[i];
           b[auxa]=b[i];
           no[auxa]=no[i];
           p[i]=aux2;
           b[i]=aux3;
           no[i]=auxs;      
        }
        for (int i=0;i<no.length-1;i++)
       {
         auxa=i;
         for (int j=i+1;j<no.length;j++)
         {
             if (b[auxa]==b[j]&&p[auxa]==p[j]&&o[auxa]==o[j])
             { 
                 for(int k=0;k<no[auxa].length()&&k<no[j].length();k++)
                {
              if (no[auxa].charAt(k)>no[j].charAt(k))
                {
                    auxa=j;
                }
            }
            }
            }
           

           auxs=no[auxa];
           p[auxa]=p[i];
           b[auxa]=b[i];
           no[auxa]=no[i];
           p[i]=aux2;

           no[i]=auxs;      
        }
         for (int j=0;j<no.length;j++)
         {
             System.out.println(no[j]);
            }
      }
}
