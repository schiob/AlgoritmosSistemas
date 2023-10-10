import java.util.Scanner;
public class Main {
	
	
	public static void main (String args[]) {
		Scanner entrada = new Scanner (System.in);
		
		int tArr = entrada.nextInt();
		entrada.nextLine();
		
		Comida arreglo [] = new Comida[tArr];
		String ent, arrSec [];
		
		
		for (int i = 0; i< arreglo.length; i ++) {
			ent = entrada.nextLine();
			arrSec = ent.split("\\s+");
			arreglo[i] = new Comida (arrSec[0],Integer.parseInt(arrSec[1]));
		}
		
		int arregloSec [] = new int [tArr];
		
		for (int i = 0; i <tArr; i ++ ) {
			arregloSec[i] = arreglo[i].getCalificacion();
		}
		
		arregloSec = Main.mergeSort(arregloSec);
		
		for (int i = 0; i < tArr; i ++ ) {
			int j = 0; 
			
			while (arregloSec[i] != arreglo[j].getCalificacion()) {
				j++;
			}
			System.out.print(arreglo[j].getNombre() + " ");
			j = 0;
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
