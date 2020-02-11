//Jose Jovanny Flores Reyna
package parcial1;

import java.util.Scanner;

public class practica3 {
	public static void main (String []args){
		Scanner entrada = new Scanner (System.in);
		int lista;
		String a[];
		
		System.out.print("Tamaño de la lista: ");
		lista=entrada.nextInt();
		a = new String [lista];
		
		entrada.nextLine();
		for(int i=0; i<a.length; i++){
			System.out.print("Nombre de medicamento "+(i+1)+".-");
			a[i]=entrada.nextLine();
		}
	
		//ordenando de menor a mayor
		for (int i=0; i < a.length-1; i++ ) {
			for (int j=i+1; j<a.length; j++) {
			if (a[i].length() > a[j].length()) {
			String temp = a[i];
			a[i] = a[j];
			a[j] = temp;
	    }
			}
		}
		
	System.out.print("Ordenados:");
	for (int i=0; i<a.length; i++){
		System.out.print("\n"+a[i]+" ");
	}
				
	}

}
