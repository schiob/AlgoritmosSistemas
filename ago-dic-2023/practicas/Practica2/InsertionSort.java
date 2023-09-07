import java.util.Scanner;
public class InsertionSort {
	
	public static void main (String args[]) {
		Scanner entrada= new Scanner (System.in);
		
		
		int arreglo [] = new int [5];
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print("Digite el elemento "+(i+1)+" del arreglo:  ");
			arreglo[i] = entrada.nextInt();
		}
		
		for (int i = 1; i < arreglo.length;i++) {
			int aux = arreglo[i];
			int pos = i;
			
			while(pos>0 && arreglo[pos-1] >aux) {
				arreglo[pos] = arreglo[pos-1];
				pos--;
			}
			arreglo[pos] = aux;
		}
		
		for (int i = 0; i < arreglo.length;i++) {
			System.out.println(arreglo[i]);
		}
		
	}

}
