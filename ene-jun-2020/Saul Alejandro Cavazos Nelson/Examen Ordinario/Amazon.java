
import java.util.Scanner;
public class Amazon
{
    
    public static void main (String[]arg)
    {
      Scanner nav= new Scanner(System.in);
      String ca=nav.nextLine();
      String [] aux=ca.split(" ");
      int n=Integer.parseInt(aux[0]);
      String bus= aux[1];
      String [] resu= new String[n];
      int prec[]=new int [n];
      for(int i=0;i<n;i++)
      {
          String re=nav.nextLine();
          String [] aux2=re.split(" ");
          resu[i]=aux2[0];
          }
          
          busquedab(bus,resu,0,resu.length-1);
    } 
    private static int busquedab(String bu, String [] re, int in, int fi) 
    {
          if(in<fi){
              int pivot = (in + fi)/2; 
               if(bu.compareTo(re[pivot])==0)
		{
		    System.out.println(pivot+1);
		    return pivot;
		  }
		if(bu.compareTo(re[pivot]) < 0) {
			return busquedab(bu, re, in+1, pivot);
		} else if(bu.compareTo(re[pivot]) > 0) {
			return busquedab(bu, re, pivot, fi-1);
		}
          }
	      System.out.println(-1);
	      return -1;
	      
	}

}
