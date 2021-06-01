package parcial_1;

import java.util.Scanner;

public class Practica3 {
	
	public static void sort(String arr[]) {
		for ( int j=0; j < arr.length-1; j++ ){
			
	      int min = j;
	      for ( int k=j+1; k < arr.length; k++)
	        if (arr[k].length() < arr[min].length()) 
	        	min = k;  

	      String temp = arr[j];
	      arr[j] = arr[min];
	      arr[min] = temp;
	    }
	}

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		System.out.print("Cantidad de nombres: ");
		int size = n.nextInt();
		
		String arr[] = new String[size];
		
		for(int i = 0; i < size; i++) {
			System.out.print("\nNombres de dinosaurios: ");
			arr[i] = n.next();
		}
		
		sort(arr);
		
		for(int k = 0; k <arr.length; k++) {
			System.out.printf("[" + arr[k] + "]");
		}

	}

}


