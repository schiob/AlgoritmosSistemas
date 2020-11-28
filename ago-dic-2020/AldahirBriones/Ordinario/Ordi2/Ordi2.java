import java.util.Scanner;
public class Ordi2
{
    public static void main (String[]arg)
    {
      Scanner f= new Scanner(System.in);
      String r=f.nextLine();
      String [] aux=r.split(" "); 
      int n=Integer.parseInt(aux[0]);
      String b= aux[1];
      String [] o= new String[n]; 
      int p[]=new int [n];
      for(int i=0;i<n;i++)
      {
          String c=f.nextLine();
          String [] aux2=c.split(" ");
          o[i]=aux2[0];
          p[i]=Integer.parseInt(aux2[1]);
          }

      binarySearch(b,o,0,o.length-1);
    } 
    private static int binarySearch(String bu, String [] re, int in, int fi) 
    {
          if(in<fi){
              int pivot = (in + fi)/2; 
               if(bu.compareTo(re[pivot])==0)
        {
            System.out.println(pivot+1);
            return pivot;
          }
        if(bu.compareTo(re[pivot]) < 0) {
            return binarySearch(bu, re, in+1, pivot);
        } else if(bu.compareTo(re[pivot]) > 0) {
            return binarySearch(bu, re, pivot, fi-1);
        }
        }
          System.out.println(-1);
          return -1;

    }

}

