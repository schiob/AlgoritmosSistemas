package Semestre1;

import java.util.*;

public class Insertion_Sort {
	public static void main(String[]args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese el tamaño del Arreglo.");
		int e=s.nextInt();
		
		
		int[] Arreglo= new int[e];
		int []par= new int [Arreglo.length];
		
		
		System.out.println("Ingrese los datos del arreglo:");
		for(int x=0;x<Arreglo.length;x++) {
		Arreglo[x]=s.nextInt();
		
		if(Arreglo[x]%2==0) {
			par[x]=Arreglo[x];
			
		}
		
		}
		
		
		
		System.out.println("Arreglo Original:" + Arrays.toString(Arreglo));

		for(int i=0; i<par.length;i++) {
			int temp=par[i];
			int j= i-1;
			while(j>=0 && temp>=par[j]) {
				par[j+1]=par[j];
				j=j-1;
			}
			par[j+1]=temp;
		}

		System.out.println("Arreglo Ordenado:" + Arrays.toString(par));
	}

}
