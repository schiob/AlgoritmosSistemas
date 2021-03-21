package algoritmosChioS;

import java.util.Scanner;

public class main {

	public static void main(String[]args){
				
		
		
practica_5Merge op = new practica_5Merge();
	int[]tem;
	
	String [] p ={"perro","gato","hoja","pistola"};

	int a = p.length;

	int [] pn = new int [a];

	int n=0;
	int q=0;

	    for (int i = 0; i < p.length; i++) {
	      q=i;
	        for (int j = 0; j < p[i].length(); j++) {
	            
	            if (Character.isLetter(p[i].charAt(q))) {
	                n++;
	            }
	        }
	        
	        pn[q]=n;
	        n=0;
	        
	    }
	    
		int [] arrayOrdenado = op.mergeSort(pn);
	 
	 
		for(int i=0;i<pn.length;i++)
		{
			System.out.println(arrayOrdenado[i]);
		}
			
	}
}
