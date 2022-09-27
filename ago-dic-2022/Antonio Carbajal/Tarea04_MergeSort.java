package Actividades;
import java.util.*;

public class Tarea04_MergeSort {
	
	//Crear los metodos del merge sort
	//una se encargará de dividir por mitades el vector recursivamente
	//la segunda unirá los subvectores
	//el tercero imprimirá el vector ordenado.
	public void sort(String arr[],int Izq, int Der) {
		
		//Si izquierdo es menor a derecho
		if(Izq<Der) {
			
			//la variable de en medio es igual a la suma de izquierdo y derecho entre dos.(Se encontrara el punto medio).
			int medio=(Izq+Der)/2;
			
			//Divide la primera y la segunda mitad de manera recursiva.
			sort (arr, Izq, medio);
			sort (arr, medio+1, Der);
			
			//Une las mitades
			merge(arr, Izq, medio, Der);
			
		}
		
	}
	
	public void merge(String arr[], int Izq, int medio, int Der) {
		
		//Encuentra el tamaño de los subvectores para unirlos.
		int n1 = medio - Izq + 1;
		int n2 = Der - medio;
		
		//Vectores temporales.
		String IA[] = new String [n1];
		String DA[] = new String [n2];
		
		//Copia los datos a los arrays temporales.
		  for (int i=0; i < n1; i++) {
		    IA[i] = arr[Izq+i];
		  }
		  for (int j=0; j < n2; j++) {
		    DA[j] = arr[medio + j + 1];
		  }
		  
		//Índices inicial del primer y segundo sub-vector.
		  int i = 0, j = 0;

		  //Índice inicial del sub-vector arr[].
		  int k = Izq;
		  
		//Ordenamiento.
		  while (i < n1 && j < n2) {
		    if (IA[i] <= DA[j]) {
		      arr[k] = IA[i];
		      i++;
		    } else {
		        arr[k] = DA[j];
		        j++;
		    }
		    k++;
		  }//Fin del while.
		  
		  /* Si quedan elementos por ordenar */
		  //Copiar los elementos restantes de leftArray[].
		  while (i < n1) {
		    arr[k] = IA[i];
		    i++;
		    k++;
		  }
		  //Copiar los elementos restantes de rightArray[].
		  while (j < n2) {
		    arr[k] = DA[j];
		    j++;
		    k++;
		  }

		
		
	}
	public void ArregloImpreso(String[] arr) {
		int n = arr.length;
        for (int i=0; i<n; ++i) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
		
		
	}
	
}
