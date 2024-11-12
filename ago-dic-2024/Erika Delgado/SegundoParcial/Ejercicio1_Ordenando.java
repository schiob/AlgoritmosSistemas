package Parcial2;

import java.util.Scanner;

public class Ejercicio1_Ordenando {
	
	public static void quickSort(String[] arr, int low, int high) {

		if (low < high) {
	       
			int pi = Particion(arr, low, high);	        
			quickSort(arr, low, pi - 1);	         
			quickSort(arr, pi + 1, high);
	       
		}	   
	}

	   
	 public static int Particion(String[] arr, int low, int high) {
	      
		 String pivote = arr[high];	       
		 int i = low - 1;

	       
		 for (int j = low; j < high; j++) {
	        
			 
			 if (comparar(arr[j], pivote) <= 0) {	               
				 i++;	               	               
				 String temp = arr[i];	               
				 arr[i] = arr[j];	                
				 arr[j] = temp;	           
			 }        
		 }

		 String temp = arr[i + 1];	       
		 arr[i + 1] = arr[high];	        
		 arr[high] = temp;
	        
		 return i + 1;
	    }

	   
	   
	 public static int comparar(String plumon1, String plumon2) {
	     
		 String[] parts1 = plumon1.split("-");	      
		 String[] parts2 = plumon2.split("-");	       
		 String color1 = parts1[0];	       
		 String color2 = parts2[0];	       
		 int dilucion1 = Integer.parseInt(parts1[1]);	       
		 int dilucion2 = Integer.parseInt(parts2[1]);       
	        
		 String[] colores = {"Rojo", "Anaranjado", "Amarillo", "Verde", "Indigo", "Violeta", "Azul"};
	        
      
	       
		 int colorIndex1 = tenerindicecolor(color1, colores);       
		 int colorIndex2 = tenerindicecolor(color2, colores);        
	      
		 if (colorIndex1 != colorIndex2) {  
			 return Integer.compare(colorIndex1, colorIndex2);       
		 }
	       
		 return Integer.compare(dilucion1, dilucion2);
	    }

	    
	    
	 public static int tenerindicecolor(String color, String[] colores) {
	      
		 for (int i = 0; i < colores.length; i++) {
	     
			 if (colores[i].equals(color)) {
				 return i;
			 } 
		 }     
		 return -1; 
	    }
	
	    
	   
	 public static void main(String[] args) {
		 
		 Scanner lee = new Scanner(System.in);
		
		 System.out.println("Digite el número de plumones, luego el color y su dilusion: ");
		 int n = lee.nextInt();
		 lee.nextLine(); 

		 String[] plumones = new String[n];
       
	       
		 for (int i = 0; i < n; i++) {
			 plumones[i] = lee.next();   
		 }       
	        
		 System.out.println("\nPlumones desordenados:");
	     
		 for (String plumon : plumones) {
			 System.out.print(plumon + "  ");   
		 }

	     // Ordenar plumones usando QuickSort
		 quickSort(plumones, 0, plumones.length - 1);

		 // Mostrar plumones ordenados
		 System.out.println("\nPlumones ordenados:");
		 for (String plumon : plumones) {
			 System.out.print(plumon + "  ");
		 }		  
		 
		 
	 }
}


