package practicas;

import java.util.Scanner;

public class Insercion {
	public static void main(String[]args) {
		
		 Scanner teclado = new Scanner(System.in);
		 int tam,tem;
		 
		 
		//ingresar el tamaño del arreglo
		    
		    System.out.println("\n CUANTAS HAMBURGUESAS VAS A CALIFICAR AMIG@: ");
		    tam=teclado.nextInt();
		    int arr[]= new int[tam];
		    
			    	 //Introduciendo el puntaje
			    	 for(int i=0; i<tam; i++) {
			    		 System.out.print("INTROCUCE UNA CALIFICACION PARA LA HAMBURGUESA " + ">" +(i+1) + ":" + "\n");
						arr[i]=teclado.nextInt();	
		    	
		    }
			    	 int aux,cont1,cont2;
			 		
			 		for(cont1=1; cont1<arr.length; cont1++) {
			 			
			 			aux=arr[cont1];
			 			for(cont2=cont1-1; cont2>=0 && arr[cont2]<aux; cont2--) {
			 				arr[cont2+1]=arr[cont2];
			 				arr[cont2]=aux;	
		    	}
		    	
		    	 }
		    	 System.out.println("calificacion ordenada de mayor a menor de las hamburguesas es:" );
		    	 for(int i=0;i<arr.length;i++)
					{
						
							System.out.print("|");
						
						System.out.print(arr[i]+"|");
					}
		    		
		  
			
		    	
		    	 
		    	
	}
}
		    
	


