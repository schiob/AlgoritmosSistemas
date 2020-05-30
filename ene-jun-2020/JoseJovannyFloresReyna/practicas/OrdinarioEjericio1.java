package algoritmos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class OrdinarioEjericio1 {
	
private static String []a;
	public static void main(String []args) {
		Scanner entrada = new Scanner(System.in);
		int n, s, t;
		
		//numero de a y numero de lineas
		 n = entrada.nextInt();
		
		 String a [] = new String[n];
		 entrada.nextLine();
		
		 for (int j = 0; j < n; j++) {        
             a[j] = entrada.nextLine();
         }
		   	
	    	entrada.nextLine();
			 
			 
			 Arrays.sort(a, new Comparator<String>( ){
				 
					public int compare(String arg0, String arg1)  {
		 
						int larg0 = arg0.length();
						int larg1 = arg1.length();
		 
						return larg0 < larg1 ? -1 : larg0 > larg1 ? 1 : 0;
		 
					}});
		 
		    	for(String l : a)  {
		 
		    		System.out.println(l);
		 
		    	}
		    	
		    	System.out.println("");
		    	quicksort(a, 0, a.length-1);
		    	for(String l : a)  {
		   		 
		    		System.out.println(l);
		 
		    	}
		    	
		    	
		    	
		    	
	}
		    	
    
	 private static int particion(String arreglo[], int izquierda, int derecha) {
	        
	        String pivote = arreglo[izquierda];
	       
	        while (true) {
	            
	            while (arreglo[izquierda].compareTo(pivote) < 0) {
	                izquierda++;
	            }
	           
	            while (arreglo[derecha].compareTo(pivote) > 0) {
	                derecha--;
	            }
	   
	            if (izquierda >= derecha) {
	               
	                return derecha;
	            } else {
	                String temporal = arreglo[izquierda];
	                arreglo[izquierda] = arreglo[derecha];
	                arreglo[derecha] = temporal;
	      
	                izquierda++;
	                derecha--;
	            }
	           
	        }
	    }

	   
	    private static void quicksort(String arreglo[], int izquierda, int derecha) {
	        if (izquierda < derecha) {
	            int indiceParticion = particion(arreglo, izquierda, derecha);
	            quicksort(arreglo, izquierda, indiceParticion);
	            quicksort(arreglo, indiceParticion + 1, derecha);
	        }
	    }
	}