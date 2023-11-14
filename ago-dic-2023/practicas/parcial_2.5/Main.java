import java.util.Scanner;

public class Main {
	
	
	public static void main (String args[]) {
		Scanner entrada = new Scanner (System.in);
		
		int tArr = entrada.nextInt();
		entrada.nextLine();
		
		Comida arreglo [] = new Comida[tArr];
		String ent, arrSec [];
		
		String colores [] = {"Rojo","Anaranjado","Amarillo","Verde","Indigo","Violeta","Azul"};
		
		
		for (int i = 0; i< arreglo.length; i ++) {
			ent = entrada.nextLine();
			arrSec = ent.split("-");
			arreglo[i] = new Comida (arrSec[0],Integer.parseInt(arrSec[1])); 
		}
		
		
		for(int i = 0; i < colores.length; i++) {
			int tArrS = 0;

			for (int j = 0; j< arreglo.length;j++) {
				
				if (arreglo[j].getNombre() == colores [i]) {
					tArrS += 1; 
				}
			}
			
			if (tArrS != 0) {
				int arregloCol [] = new int [tArrS];
				for (int k = 0; k <arregloCol.length; k++) {
					for (int l = 0; l < arreglo.length; l++) {
						if (colores[i] == arreglo[l].getNombre()) {
							arregloCol[k] = arreglo[l].getCalificacion();
							System.out.println(arreglo[l].getNombre());
						}
					}
				}
				quick(arregloCol,0,arreglo.length-1);
				
				for (int n = arreglo.length; n > -1 ; n--) {
					System.out.println(colores[i] + "-" + arregloCol[n]);
				}
			}
			
		}
		
		
	
		
	}
	
	public static void quick (int arr [], int ini, int fin) {
		
		if (ini < fin) {
			int pivote = arr[fin];
			int mPequeño = ini-1;
			int temp;
			
			for (int i = ini; i < fin; i++) {
				if (arr[i] < pivote) {
					temp= arr[mPequeño+1];
					arr[mPequeño+1] = arr[i];
					arr [i] = temp; 
					mPequeño+=1; 
				}
			}
			temp = arr[mPequeño+1];
			arr [mPequeño+1] = pivote;
			arr[fin] = temp;
			
			Main.quick(arr, ini, mPequeño);
			Main.quick(arr, mPequeño + 1, fin);
		}
	}
}
