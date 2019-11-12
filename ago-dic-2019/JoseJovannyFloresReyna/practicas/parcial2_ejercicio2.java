package practicas;

import java.util.Scanner;

import javax.swing.JOptionPane;
//Quick sort
public class parcial2_ejercicio2 {
	int partition(int arr[], int izq, int der) 
	{ 
		int pivot = arr[der]; 
		int i = (izq-1); 
		for (int j=izq; j<der; j++) 
		{ 
			if (arr[j] < pivot) 
			{ 
				i++; 

				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
		} 
		int temp = arr[i+1]; 
		arr[i+1] = arr[der]; 
		arr[der] = temp; 
		return i+1; 
	} 

	void sort(int arr[], int izq, int der) 
	{ 
		if (izq < der) 
		{ 
			int pi = partition(arr, izq, der); 
			sort(arr, izq, pi-1); 
			sort(arr, pi+1, der); 
		} 
	}
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
			//MAIN
			public static void main(String[]args){
				int n, q;
				
				
				boolean band = false;
			       Scanner entrada = new Scanner(System.in);
			     
			       System.out.println("Numero de tazos: ");
			       n=entrada.nextInt();
			       System.out.print("Num de serie del tazo a buscar: ");
			       q=entrada.nextInt();
			     
			        int arr [] = new int [n];
			       
			       
			       for(int i=0; i<arr.length; i++){
			    	   System.out.print("num serie cada tazo: ");
			    	   arr[i]=entrada.nextInt();
			       }
			       //ordenando el arreglo
			       Quicksort ob = new Quicksort(); 
			        ob.sort(arr, 0, n-1); 
			       
			       
			       //BUSQUEDA BINARIA
			       
			       int j=0;
			       int  inf = 0;
				   int sup = n;
			       int  mitad = (inf+sup)/2;
					
					while(inf<=sup && j<q){
						if(arr[mitad]==q){
							band = true;
							break;
						}
						if(arr[mitad]>q){
							sup=mitad;
							mitad=(inf+sup)/2;
						}
						if(arr[mitad]<q){
							inf = mitad;
							mitad = (inf+sup)/2;
						}
						j++;
					}
					
					if(band == true){
						System.out.println(mitad);
					}
					else{
						System.out.println(-1);
					}
			       
			       
			       
			}
}