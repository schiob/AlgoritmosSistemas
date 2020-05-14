package practicas;

import java.util.Scanner;

public class Parcial2 {
	//QuickSort
	public static void QuickSort(String m[],int inferior,int superior){
	    int izquierda,derecha;
	    String mitad,x;
	    izquierda = inferior;
	    derecha = superior;
	    mitad = m[(izquierda+derecha)/2];
	    do{
	        while(m[izquierda].compareTo(mitad)<0 && izquierda<superior){
	            izquierda++;
	        }
	        while(mitad.compareTo(m[derecha])<0 && derecha>inferior){
	            derecha--;
	        }
	        if (izquierda <= derecha) {
	            x = m[izquierda];
	            m[izquierda] = m[derecha];
	            m[derecha] = x;
	            izquierda++;
	            derecha--;
	        }
	    }while(izquierda<=derecha);
	    if (inferior < derecha) {
	        QuickSort(m,inferior,derecha);
	    }
	    if (izquierda < superior) {
	        QuickSort(m,izquierda,superior);
	    }
	}

//Busqueda binaria
	public static int busquedaBin(String[] arreglo, String busqueda, int izquierda, int derecha) {
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
	        return busquedaBin(arreglo, busqueda, izquierda, derecha);
	    } else {
	        izquierda = indiceDelElementoDelMedio + 1;
	        return busquedaBin(arreglo, busqueda, izquierda, derecha);
	    }
	}
	
	//MAIN
public static void main(String[] args) {
   
   Scanner entrada = new Scanner(System.in);
   int n=entrada.nextInt(), q=entrada.nextInt();
   int izq = 0,der;
   String elemento[] = new String[q];
   String musica [] = new String[n];
   der = musica.length-1;
   
   for (int i = 0; i < n; i++) {
       musica[i] = entrada.next();
   }
   QuickSort(musica,0,n-1);
   for (int i = 0; i < n; i++) {
       System.out.print(musica[i]+" ");
   }
   System.out.println("");
   for (int j = 0; j < q; j++) {
       elemento[j] = entrada.next();
       busquedaBin(musica,elemento[j],izq,der);
   }
   
   for (int j = 0; j < q; j++) {
       System.out.println(busquedaBin(musica,elemento[j],izq,der));
   }
   
 }
}