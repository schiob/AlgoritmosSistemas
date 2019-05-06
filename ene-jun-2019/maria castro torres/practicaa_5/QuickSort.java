package practicas;

import java.util.Scanner;

public class QuickSort {
	
	 public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
           
	        System.out.println("Ingresa el numero de palabras:");
	        int n = s.nextInt();
	        String array[]=new String[n];
            String r="";
           
	        System.out.println("palabras a ordenar??");
	        String  pal = s.next();

	        for (int i = 0; i <n; i++)
	        {
	            array[i]=s.next();
	        }
			quickSort(array,0, array.length-1);
			
			System.out.println("palabras ordenadas" );
			
			for(int i=0; i<array.length; i++)
			{
				System.out.print( array[i]+  "\t");
				
			}
		   System.out.println(binarysearch(array,r));

	    }
	
	
	public static void quickSort(String[]array, int izq, int der) {
		String pivote=array[izq];
		
		int i=izq;
		int j=der;
		String auxIntercambio;
		
		while(i<j) {
			while(array[i].compareTo(pivote)<=0 && i<j) {
				i++;
			}
			 while (array[j].compareTo(pivote) >= 0 && j > izq && j >= i)
             {
                 j--;
             }
			 
			 if(i<j) {
				 auxIntercambio=array[i];
				 array[i]=array[j];
				 array[j]=auxIntercambio;
			 }
		}
		
		array[izq]=array[j];
		array[j]=pivote;
		
		if(izq<j-1) {
			quickSort(array,izq, j-1);
		}
		if(j+1<der) {
			quickSort(array,j+1,der);
		}
	}
		public static int binarysearch(String[] array, String r) 
	     {
			int l=0, h=array.length-1,t;
			
			while(l<=h) {
				t=l+(h-l)/2;
				int res=r.compareTo(array[t]);	
				if(res==0) {
					return t;
				}
				if(res>0) {
					l=t+1;
				}else {
					h=t-1;
				}
			}
			return -1;
	     }

}
		



