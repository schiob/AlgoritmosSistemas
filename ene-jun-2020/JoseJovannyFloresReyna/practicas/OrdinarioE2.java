package algoritmos;

import java.util.Scanner;

public class OrdinarioE2 {
	
	 public static int busquedaBin(String[] arreglo, int array[], String busqueda, int izquierda, int derecha) {
		    if (izquierda > derecha) {
		        return -1;
		    }

		    int indiceDelElementoDelMedio = (int) Math.floor((izquierda + derecha) / 2);
		    String elementoDelMedio = arreglo[indiceDelElementoDelMedio];

		    int resultadoDeLaComparacion = busqueda.compareTo(elementoDelMedio);

		    if (resultadoDeLaComparacion == 0) {
		        return array[indiceDelElementoDelMedio];
		    }

		    if (resultadoDeLaComparacion < 0) {
		        derecha = indiceDelElementoDelMedio - 1;
		        return busquedaBin(arreglo, array, busqueda, izquierda, derecha);
		    } else {
		        izquierda = indiceDelElementoDelMedio + 1;
		        return busquedaBin(arreglo, array, busqueda, izquierda, derecha);
		    }
		}

    
    public static void QuickSort(int arr[],String array[],int low, int n){
        int lo = low;
        int hi = n;
        String aux;
        if (lo >= n) {
            return;
        }
        String mid = array[(lo + hi)/2];
        while(lo < hi){
            while(lo < hi && array[lo].compareTo(mid) < 0){
                lo++;
            }
            while(lo < hi && array[hi].compareTo(mid) > 0){
                hi--;
            }
            if (lo < hi) {
                int t = arr[lo];
                arr[lo] = arr[hi];
                arr[hi] = t;
                aux = array[lo];
                array[lo] = array[hi];
                array[hi] = aux;
            }
        }
        if (hi < lo) {
            int t = hi;
            hi = lo;
            lo = t;                
        }
        QuickSort(arr,array,low,lo);
        QuickSort(arr,array,lo == low? lo+1 : lo,n);
    }
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        String q = entrada.next();
       
        String articulos[] = new String[n];
        int precio[] = new int[n];
        int clasificacion[] = new int [n];
       
        
        for (int i = 0; i < n; i++) {
            articulos[i] = entrada.next();
            precio[i] = entrada.nextInt();
            clasificacion[i] = i+1;
        }
        QuickSort(clasificacion,articulos,0,n-1);
        
        
        System.out.println(busquedaBin(articulos,clasificacion,q,0,n-1));
    }
   
}
    