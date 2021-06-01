package parcial_1;

import java.util.Scanner;

//Ernesto Burciaga Aguirre 17528944

public class ExamenOrdinarioP1 {
	
	public static void quicksort(String arr[], int izq,int der) {

		String pivote = arr[izq];
		int i = izq;
		int j = der;
		String aux = " ";

		while(i < j){                          
		     while(arr[i].compareTo(pivote) <= 0 && i < j) i++; 
		     while(arr[j].compareTo(pivote) > 0) j--;           
		     if (i < j) {                                             
		         aux = arr[i];                      
		         arr[i]=arr[j];
		         arr[j]=aux;

		     }
		   }

		 arr[izq]=arr[j];     
		 arr[j]=pivote;

		 if(izq < j-1)
		      quicksort(arr,izq,j-1);          
		 if(j+1 < der)
		      quicksort(arr,j+1,der);
		}
	
	public static String[] colorArr(int b ,String arr[], String arr2[]) {
		
			if(arr[b].contains("Rojo"))
				arr2[b].replace("Rojo", "AAA");
			
			if(arr[b].contains("Anaranjado"))
				arr2[b].replace("Anaranjado", "BBB");
			
			if(arr[b].contains("Amarillo"))
				arr2[b].replace("Amarillo", "CCC");
			
			if(arr[b].contains("Verde"))
				arr2[b].replace("Verde", "DDD");
			
			if(arr[b].contains("Indigo"))
				arr2[b].replace("Indigo", "EEE");
			
			if(arr[b].contains("Violeta"))
				arr2[b].replace("Violeta", "FFF");
			
			if(arr[b].contains("Azul"))
				arr2[b].replace("Azul", "GGG");
			
	
		return arr2;
		
	}
	
	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		

		System.out.print("Numero de plumones: ");
		int size = n.nextInt();

		String arr[] = new String[size];
		String arr2[] = new String[size];

		System.out.print("\nColores de los plumones: ");
		for(int i =0; i<arr.length; i++) {
			arr[i] = n.next();
		}
		
		arr2=arr;
		
		for (int h = 0; h < size; h++){
		arr2 = colorArr(h,arr,arr2);
		 System.out.print("["+arr2[h]+"] ");
		}
		
		quicksort(arr2,0,size - 1); 
		for(int j = 0; j < size; j++) {
	        System.out.print("["+arr2[j]+"] ");
	        }

	}
	

}
