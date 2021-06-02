package algoritmosChioS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class problema_2 {

	  public static void main(String args[]) {
	        String[] arreglo;
	        int n, n2;
	        Scanner op = new Scanner(System.in);

	        System.out.println("ingrese el numero de canciones:");
	        n = op.nextInt();
	        op.nextLine();

	        System.out.println();
	        System.out.println("ingrese las canciones: ");
	        String input = op.nextLine();
	        arreglo = input.split(" ");
	        // op.close();

	        Arrays.sort(arreglo);
	        for (int i = 0; i < arreglo.length; i++) {
	            System.out.println(arreglo[i]);
	        }

	        System.out.println();
	        System.out.println("ingrese el numero de canciones a buscar:");
	        n2 = op.nextInt();
	        op.nextLine();
	        System.out.println();

	        for (int i = 0; i < n2; i++) {
	            System.out.println("Ingrese el nombre de la cancion a buscar");
	            String busqueda = op.next();

	            int indiceDelElementoBuscado = busquedaBinaria(arreglo, busqueda, 0, arreglo.length - 1);
	            System.out.println("las canciones " + busqueda + " se encuentra en la posicion " + indiceDelElementoBuscado);
	            System.out.println();
	        }
	        op.close();
	    }

	    public static int[] quickSort(int A[], int izq, int der) {

	        int pivote = A[izq];
	        int i = izq;
	        int j = der;
	        int aux;

	        while (i < j) {
	            while (A[i] <= pivote && i < j)
	                i++;
	            while (A[j] > pivote)
	                j--;
	            if (i < j) {
	                aux = A[i];
	                A[i] = A[j];
	                A[j] = aux;
	            }
	        }
	        A[izq] = A[j];
	        A[j] = pivote;

	        if (izq < j - 1)
	            quickSort(A, izq, j - 1);
	        if (j + 1 < der)
	            quickSort(A, j + 1, der);

	        return A;
	    }

	    public static int busquedaBinaria(String[] arreglo, String busqueda, int izquierda, int derecha) {

	        if (izquierda > derecha) {
	            return -1;
	        }

	        int indiceDelElementoDelMedio = (int) Math.floor((izquierda + derecha) / 2);
	        String elementoDelMedio = arreglo[indiceDelElementoDelMedio];

	        int resultadoDeLaComparacion = busqueda.compareTo(elementoDelMedio);

	        if (resultadoDeLaComparacion == 0) {
	            return indiceDelElementoDelMedio;
	        }

	        if (resultadoDeLaComparacion < 0) {
	            derecha = indiceDelElementoDelMedio - 1;
	            return busquedaBinaria(arreglo, busqueda, izquierda, derecha);
	        } else {
	            izquierda = indiceDelElementoDelMedio + 1;
	            return busquedaBinaria(arreglo, busqueda, izquierda, derecha);
	        }

	    }
	}
