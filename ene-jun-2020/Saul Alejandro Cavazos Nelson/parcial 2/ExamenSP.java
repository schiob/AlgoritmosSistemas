
import java.util.Scanner;
public class ExamenSP
{
    public static void maid (String [] args)
  {
      Scanner nav= new Scanner (System.in);
      String b=nav.nextLine();
       String [] aux=b.split(" ");
       int n = Integer.parseInt(aux[0]);
       int q = Integer.parseInt(aux[1]);
       int tres[]= new int [n];
       int auxi=0;
       int c=0;
       String no = nav.nextLine();
       String [] pl=no.split(" ");
       String [] pe= new String [q];
       for (int i =0; i<q;i++)
       pe[i]=nav.nextLine();
       for (int i=0;i<n;i++)
       {
       
                               
            char ax=pl[i].charAt(0);
              
            
            tres[i]= ax;
        }
       quicksort(tres,0,tres.length-1,pl); 
      
       for (int i=1;i<n;i++)
       {

           if(pl[i].charAt(0)==pl[i-1].charAt(0))
            if(pl[i].charAt(1)<pl[i-1].charAt(1))
              {
                  String aox= pl[i-1];
                  pl[i-1]=pl[i];
                  pl[i]=aox;
                }
            
        }
        for (int i=0;i<n;i++)
        if (i<n-1)
         System.out.print(" "+pl[i]);
       else
       System.out.println(" "+pl[i]);
        for(int i=0;i<q;i++)
        {
            String aex=pe[i];
           binarySearch(pl,aex);
        }
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
    static int binarySearch(String[] arr, String x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            int res = x.compareTo(arr[m]); 
  
            
            if (res == 0) 
            {
                System.out.println(m);
                return m; 
            }
            
            if (res > 0) 
                l = m + 1; 
  
            
            else
                r = m - 1; 
        } 
         System.out.println(-1);
        return -1; 
    } 
  
   
}

