package practicas;

import java.util.Scanner;

public class Practica3 {

	public static void main(String[] args) {
		
		  Scanner teclado =  new  Scanner ( System.in);
            int tam;
	        
            
            System.out.println("cuantos objetos hay en tu almacen:" );
            tam=teclado.nextInt();
           
            String nom[]=new String[tam];
	        int num[]=new int[tam];
	      
	        System.out.print("QUE OBJETOS HAY EN TU ALMACEN Y CUANTOS? : ");
	        for(int i=0; i<nom.length && i<num.length; i++)
	        {
	        	nom[i]=teclado.next();
	        	num[i]=teclado.nextInt(); 	
	        }
	        int temp;
	        String aux="";
	        
	        for(int i=1; i< num.length; i++)
	        {
	        	temp=num[i];
	        	aux=nom[i];
	        	int j=0;
	        	
	        	for(j=i-1; j>-1 && num[j]<temp; j--)
	        	{
	        		num[j+1]=num[j];
	        		nom[j+1]=nom[j];
	        	}
	        	
	        	num[j+1]=temp;
	        	nom[j+1]=aux;
	        }
	       
	        System.out.println("Objetos ordenados de mayor a menor:");
	        for(int i=0; i<nom.length;i++)
	        {
	        	System.out.print(nom[i]+"\t");
	        }
	        
	        }

	    }
	

	


