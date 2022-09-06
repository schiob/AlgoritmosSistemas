package Actividades;

import java.util.*;

public class Insertion_Sort {
	
	public static void main(String[]args) {
		
		int[] A= {10,1,5,16,25,87,48,65};
		System.out.println("Arreglo Original:" + Arrays.toString(A));
		
		for(int i=0; i<A.length;i++) {
			int temp=A[i];
			int j= i-1;
			while(j>=0 && temp<=A[j]) {
				A[j+1]=A[j];
				j=j-1;
			}
			A[j+1]=temp;
		}
		
		System.out.println("Arreglo Ordenado:" + Arrays.toString(A));
	}

}
