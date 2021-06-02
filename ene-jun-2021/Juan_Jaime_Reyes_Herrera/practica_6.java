package algoritmosChioS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class practica_6 {

	public static void main(String args[]) {
		String []palabras;
		int n;
		Scanner op = new Scanner(System.in);

		System.out.println("ingrese el numero de palabras:");
		n=op.nextInt();
		op.nextLine();
        
    	System.out.println("ingrese las palabras: ");   
    	String input =op.nextLine();
        palabras = input.split(" ");
		op.close();
       
		int[] temp = new int[n];
		Map<Integer, String> m = new HashMap<>();
		for(int i = 0; i < n; i++) {
			temp[i] = palabras[i].length();
			m.put(palabras[i].length(), palabras[i]);
		}

		quickSort(temp, 0, temp.length - 1);
		
		for(int i = 0; i < n; i++) {
			System.out.print(m.get(temp[i]) + " ");
		}
	}
	
	public static int[] quickSort(int A[],int izq, int der){
		
		int pivote=A[izq];
		int i=izq;
		int j=der;
		int aux;
		
		while(i < j){
			while(A[i] <= pivote && i <j) i++;
			while(A[j] > pivote) j--;
			if(i<j){
				aux=A[i];
				A[i]=A[j];
				A[j]=aux;
			}
		}
		A[izq]=A[j];
		A[j]=pivote;
		
		
		if(izq < j-1)
			quickSort(A,izq,j-1);
		if(j+1 < der)
			quickSort(A,j+1,der);
		
		return A;
	}
}