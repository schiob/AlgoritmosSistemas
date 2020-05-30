import java.util.Scanner;
public class Willi
{
    public static void main (String[]arg)
    {
        Scanner nav= new Scanner(System.in); 
         int n=Integer.parseInt(nav.nextLine());
         String niño[]=new String[n];
         int st=0;
         boolean f=false;
        for (int i =0; i<n;i++)
        {
            niño[i]=nav.nextLine();
        }
        for (int i =0; i<n;i++)
        {
             String [] aux=niño[i].split(" ");
             int aux1[]=new int[aux.length];
             for (int j =0; j<aux.length;j++)
           {
            
               String [] aux2=aux[j].split("-");
               aux1[j]=Integer.parseInt(aux2[0]);
              
              }
            quicksort(aux1, 0,aux.length-1, aux);
            niño[i]="";
           for (int j =0; j<aux.length;j++)
           {
            niño[i] = niño[i] +aux[j] +" ";  
              }
        }
         for (int i =0; i<n;i++)
        {
             int aux1[]=new int[niño.length];
             for (int j =0; j<niño.length;j++)
           {
               
                aux1[j]=niño[j].length();
              }
            quicksort(aux1, 0,niño.length-1, niño);
           
        }
         for (int i =0; i<n;i++)
         {
             String [] aux=niño[i].split(" ");
             int aux1[]=new int[aux.length];
           for (int j =0; j<aux.length;j++)
           {
            
               String [] aux2=aux[j].split("-");
               aux1[j]=Integer.parseInt(aux2[0]);
               if(aux2[1].equals("B"))
               {
                st=aux1[j]+st;
                f=true;
                break;
                }
               else
               st=aux1[j]+st;
              }
              if(f==true)
              break;
         }
         System.out.print (st);
    }
     public static void quicksort(int a[], int pri, int ult,String a1[])
    {
       int i=pri;
       int j=ult;
       int pi=a[(pri+ult)/2];
       do{
           while(a[i]<pi)
           i++;
           while(a[j]>pi)
           j--;
              if(i<=j)
           {
            int aux= a[i];
            String auxi= a1[i];
            a[i]=a[j];
            a1[i]=a1[j];
            a[j]=aux;
            a1[j]=auxi;
            i++;
            j--;
          }
        }while(i<=j);
       if(pri<j)
       {
        quicksort(a, pri, j,a1); 
        }
        if(i<ult)
       {
        quicksort(a, i, ult,a1); 
        }
     
             
   }
}
