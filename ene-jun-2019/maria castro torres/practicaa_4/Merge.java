package practicas;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {
	
	public static void main (String[]args) {
		
		Scanner s=new Scanner(System.in);
	
		int tam, i=0;
		 System.out.println("CUANTOS NOMBRES SON:");
	        tam = s.nextInt();
	        String[] palabra= new String[tam];
	        
	        System.out.println("INGRESA LOS NOMBRES: ");
	        for( i=0; i<palabra.length; i++) 
	        {
	            palabra[i] = s.next();
	        }
	        System.out.println("PALABRAS ORDENADAS ALFABETICAMENTE:"+ "\n"+ Arrays.toString(merge(palabra)));
		for( i=0; i<palabra.length; i++) {
			palabra[i]=s.next();
		}
	}
		
	
	
	 public static String[] merge(String[] arr)
	    {
	        if(arr.length > 1)
	        {
	            int x = arr.length/2;
	            String[] der = Arrays.copyOfRange(arr, 0, x);
	            String[] izq = Arrays.copyOfRange(arr, x, arr.length);
	            return mergesort(merge(der), merge(izq));
	        }
	        
	        return arr;
	    }


	    public static String[] mergesort(String[]der, String[]izq)
	    {
	        String[] arr = new String[(der.length + izq.length)];
	        int i = 0, j = 0, k = 0;
	        
	        while(i< der.length && j < izq.length)
	        {
	            if(der[i].compareTo(izq[j]) <= 0)
	            {
	                arr[k] = der[i];
	                i++;
	            }
	            else
	            {
	                arr[k] = izq[j];
	                j++;
	            }
	            
	            k++;
	        }
	        
	        while(i < der.length)
	        {
	            arr[k] = der[i];
	            i++; 
	            k++;
	        }
	        
	        while(j < izq.length)
	        {
	            arr[k] = izq[j];
	            j++;
	            k++;
	        }
	        
	        return arr;
	    }
}
