package Practicas;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Practica5 {
	public static void MergeSort(String nombre[], int[] arr) {
	
        if (arr.length<=1) {
            return;
        }

        int mitad = arr.length / 2;
        
        int[]izq_arr = Arrays.copyOfRange(arr,0,mitad);
        int[]der_arr = Arrays.copyOfRange(arr,mitad,arr.length);
        String[] nombre_izq = Arrays.copyOfRange(nombre,0,mitad);
        String[] nombre_der =  Arrays.copyOfRange(nombre,mitad,arr.length);
        
        
        MergeSort(nombre_izq,izq_arr);
        MergeSort(nombre_der,der_arr);
        
      
       
        merge(arr,nombre,izq_arr,nombre_izq,der_arr,nombre_der);
    }
	
	 public static void merge(int[] arr, String[] nombre, int[] izq_arr,String[] nombre_izq,int[] der_arr, String[] nombre_der) {
		 
		
	        int[] arr_resultado = new int[izq_arr.length + der_arr.length];
	        String nombre_resu[]=new String[nombre_der.length + nombre_izq.length];

	        
	        int i = 0, j = 0, k = 0;
	        
	        while (i < izq_arr.length && j < der_arr.length) {
	            if (izq_arr[i] <= der_arr[j]) {
	                arr[k] = izq_arr[i];
	                nombre[k] = nombre_izq[i];
	                i++;
	            } else {
	                arr[k] = der_arr[j];
	                nombre[k] = nombre_der[j];
	                j++;
	            }
	            k++;
	        }

	     
	        while (i < izq_arr.length) {
	            arr[k] = izq_arr[i];
	            nombre[k] = nombre_izq[i];
	            i++;
	            k++;
	        }

	        
	        while (j < der_arr.length) {
	            arr[k] = der_arr[j];
	            nombre[k] = nombre_der[j];
	            j++;
	            k++;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner lee = new Scanner(System.in);

	        
	        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de libros que tiene"));

	        
	        String[] nombres_l = new String[num];
	        int num_pag[] = new int[num];

	        System.out.println("Digite el nombre del libro y las paginas que tiene en un espacio");
	        for (int i = 0; i < num; i++) {
	            nombres_l[i] = lee.next();  
	            num_pag[i] = lee.nextInt(); 
	        }

	        
	        MergeSort(nombres_l, num_pag);

	        
	        System.out.println("\nLibros ordenados por número de páginas");
	        for (int i = 0; i < num; i++) {
	            System.out.print(nombres_l[i] + "   ");
	        }
	    }
	}
