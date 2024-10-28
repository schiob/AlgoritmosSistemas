import java.util.Scanner;

import javax.swing.JOptionPane;

public class Practica4 {
	
	public String[]mergesort(String[]arr){
		if(arr.length == 1) {
			return arr;
		}
		int mitad = arr.length /2;
		String[]izq = new String[mitad];
		String der[]= new String[arr.length-mitad];
		
		for(int i=0; i<mitad;i++) {
			izq[i]= arr[i];
		}
		
		for(int i=0; i<der.length;i++) {
			der[i]= arr[mitad+i];
		}
		
		String[]sorted_left = mergesort(izq);
		String[]sorted_right = mergesort(der);
		
		return merge(sorted_left,sorted_right);
		
		
	}
	
	public String[]merge(String []left,String right[]){
		String[] arr_resultado = new String[left.length + right.length];
	    int i = 0, j = 0, k = 0;

	    while (i < left.length && j < right.length) {
	        if (left[i].compareTo(right[j]) <= 0) { 
	            arr_resultado[k++] = left[i++];
	        } else {
	            arr_resultado[k++] = right[j++];
	        }
	    }

	    while (i < left.length) {
	        arr_resultado[k++] = left[i++];
	    }

	    while (j < right.length) {
	        arr_resultado[k++] = right[j++];
	    }

	    return arr_resultado;
	}
	
	
	public static void main(String[] args) {
		
		Scanner lee = new Scanner(System.in);
		Practica4 p = new Practica4();
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de palabras"));
        String[] palabras = new String[n];

        System.out.println("Escriba la cadena de texto por espacios:");
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = lee.next(); 
        }

        String[] nvo = p.mergesort(palabras);

        // Mostrar arreglo
        System.out.println("Palabras ordenadas:");
        for (String elemento : nvo) {
            System.out.print(elemento + " ");
        }
    }

}
