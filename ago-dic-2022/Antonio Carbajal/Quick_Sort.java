package Actividades;

public class Quick_Sort {
	
	public void quick(String arr[],int izq, int der) {
		int j,i;
		String pivote, auxiliar;
		i=izq;
		j=der;
		pivote=arr[(izq+der)/2];
		do {
			while(arr[i].compareTo(pivote)<0) {
				i++;
				
			}while(arr[j].compareTo(pivote)>0) {
				j--;
				
			}//Hacemos el intercambio
			if(i<=j) {
				auxiliar=arr[i];
				arr[i]=arr[j];
				arr[j]=auxiliar;
				i++;
				j--;
				
			}
		}while(i<=j);
		if(izq<j) {
			quick(arr,izq,j);
			
		}if (i<der) {
			quick(arr,i,der);
			
		}
		mostrarArreglo(arr);
		
	}
	public void mostrarArreglo(String [] arr) {
		int k;
		for(k=0;k<arr.length;k++) {
			System.out.println("["+arr[k]+"] ");
			
		}
		System.out.println();
	}
	public static void main(String[]args) {
		Quick_Sort ordenar= new Quick_Sort();
		 String[] nombres = {"EstudiarParaAlgoritmos 64", "CompletarTareasPendientes 54", "RezarPorLosParciales 80", "ComprarLasBotellasDeSobornos 90", "LlorarEnUnRincón 20"};
		 System.out.println("Arreglo original:  ");
		 
		 ordenar.mostrarArreglo(nombres);
		 
		 System.out.println("Arreglo ordenado con quick sort:  ");
		 ordenar.quick(nombres, 0, nombres.length-1);
		 
		 
		 
	} /*NOTA: Este tambié está imcompleto debido a que se solicite que
	 se ordene mediante la prioridad de los enteros por lo que en java desconozo 
	 como s ordenan con los strings*/

}
