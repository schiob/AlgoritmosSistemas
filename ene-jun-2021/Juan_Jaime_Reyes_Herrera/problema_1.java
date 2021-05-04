package algoritmosChioS;

import java.util.Arrays;
import java.util.Scanner;

public class problema_1 {
	public static void main(String[] args) {
		 Scanner op = new Scanner(System.in);
		
	        
	      
	        String[] arreglo = { "Calculo2Deitel", "CalculoForDummies", "AlgebraLineal","TeoriaDeNumeros", "TheMangaGuideCalculus"  };
	        
	        Arrays.sort(arreglo);
	        for(int i=0;i<arreglo.length;i++){
	        	System.out.println(arreglo[i]);
	        }

	        System.out.println("Ingrese el nombre del libro a buscar");
	        String busqueda = op.next();

	       
	        int indiceDelElementoBuscado = busquedaBinaria(arreglo, busqueda, 0, arreglo.length - 1);
	        System.out.println("El libro buscado " + busqueda  
	        + " se encuentra en la posicion "+ indiceDelElementoBuscado);
	        System.out.println("tenemos "+arreglo.length+" libros en la repisa");


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
	
