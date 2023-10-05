package Stack;
import java.util.Scanner;


public class Tarea5 {
	 
	/*Parasaurolophus Oviraptor Minmi Troodon Wannanosaurus*/
	
	public static void main ( String args []) {
		Scanner entrada = new Scanner(System.in);
		
		String text = entrada.nextLine();
		String arreglo []= text.split("\\s+");
		
		int arrSec [] = new int [arreglo.length];
		
		for (int i = 0; i < arrSec.length; i++) {
			arrSec[i] = arreglo[i].length();
		}		
		int Sol [] = SortRecursiva.mergeSort(arrSec);

		 for (int i = 0; i < arrSec.length; i++) {
			 int j = 0;
			 while (Sol [i] != arreglo[j].length()) {
				 j++;
			 }
			 System.out.println(arreglo[j]);
		 }
		
	}
	

	
	public static int [] mergeSort (int arreglo []) {
		
		int mitad = arreglo.length /2;
		int arrIzq [] = new int [mitad];
		int arrDer [] = new int [arreglo.length - mitad];
		
		if (arreglo.length == 1) {
			return arreglo;
		}
		
		for (int i = 0; i < arreglo.length; i++) {
			if (i < mitad) {
				arrIzq[i] = arreglo [i];
			}
			else {
				arrDer[i-mitad] = arreglo[i];
			}
			
		}
		
		int sortArrIzq [] = mergeSort(arrIzq);
		int sortArrDer [] = mergeSort(arrDer);
		
		
		return merge(sortArrIzq,sortArrDer);
	}
		
	public static int [] merge (int arrIzq [], int arrDer []) {
		int arrFinal [] = new int [arrIzq.length + arrDer.length];
		int izq = 0; 
		int der = 0;
		int i = 0;
		
		while (izq < arrIzq.length && der <arrDer.length) {
			if (arrIzq [izq] < arrDer [der]) {
				arrFinal [i] = arrIzq[izq];
				izq ++;
				i++;
			}
			else {
				arrFinal [i] = arrDer[der];
				der++;
				i++;
			}
		}
		
		while (izq < arrIzq.length) {
			arrFinal [i] = arrIzq[izq];
			izq ++;
			i++;
		}
		
		while (der <arrDer.length) {
			arrFinal [i] = arrDer[der];
			der++;
			i++;
		}
		
		
		
		return arrFinal;
	}
}
