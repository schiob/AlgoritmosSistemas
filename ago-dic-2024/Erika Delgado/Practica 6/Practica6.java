package Practicas;

import java.util.Scanner;


public class Practica6 {
	public static void quickSort(int[]arr,int low, int high) {
		if(low<high) {
			int pi = Partition(arr,low,high);
			quickSort(arr,low,pi-1);
			quickSort(arr,pi+1,high);
		}
	}
	
	public static int Partition(int[]arr,int low, int high) {
		int pivote = arr[high];
		
		int i = low-1;
		
		for(int j=low; j<high;j++) {
			if(arr[j] <= pivote) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}

	public static void main(String[] args) {
		int n = 0;
		
		
		Scanner lee = new Scanner(System.in);	
		
		
		System.out.println("Digite el numero de colores que tiene(dar enter); digite el id del colores");
		n = lee.nextInt();
		
		int colores[] = new int[n];
		
		for(int i = 0; i<n; i++) {
			colores[i] = lee.nextInt();
		}
		
		System.out.println("\nId colores desordenados");
		for(int ele : colores) {
			System.out.print(ele+"  ");
		}
		
		quickSort(colores,0,colores.length-1);

		
		System.out.println("\nId colores ordenados");
		for(int ele : colores) {
			System.out.print(ele+"  ");
		}
		
	}

}
