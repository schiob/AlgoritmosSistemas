package algoritmosChioS;


import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class practica_8 {
	
	 public static void main(String[] args) {
		 Scanner op = new Scanner(System.in);
		
	        
	        // Arreglo para probar
	        String[] arreglo = { "blackOps", "marioKart", "ghostReacon", "metroid", "pokemonEsmeralda", "arkhamNight", "injustice", "mortalKombat", "smashBros" };
	        
	        Arrays.sort(arreglo);
	        for(int i=0;i<arreglo.length;i++){
	        	System.out.println(arreglo[i]);
	        }

	        System.out.println("Ingrese el nombre del videojuego a buscar");
	        String busqueda = op.next();

	        // Probar primero con la recursiva
	        int indiceDelElementoBuscado = busquedaBinaria(arreglo, busqueda, 0, arreglo.length - 1);
	        System.out.println("El videojuego buscado " + busqueda  
	        + " se encuentra en la posicion "+ indiceDelElementoBuscado);


	    }

	    public static int busquedaBinaria(String[] arreglo, String busqueda, int izquierda, int derecha) {
	        // Si izquierda es mayor que derecha significa que no encontramos nada
	        if (izquierda > derecha) {
	            return -1;
	        }

	        // Calculamos las mitades...
	        int indiceDelElementoDelMedio = (int) Math.floor((izquierda + derecha) / 2);
	        String elementoDelMedio = arreglo[indiceDelElementoDelMedio];

	        // Primero vamos a comparar y luego vamos a ver si el resultado es negativo,
	        // positivo o 0
	        int resultadoDeLaComparacion = busqueda.compareTo(elementoDelMedio);

	        // Si el resultado de la comparación es 0, significa que ambos elementos son iguales
	        // y por lo tanto quiere decir que hemos encontrado la búsqueda
	        if (resultadoDeLaComparacion == 0) {
	            return indiceDelElementoDelMedio;
	        }

	        // Si no, entonces vemos si está a la izquierda o derecha
	        if (resultadoDeLaComparacion < 0) {
	            derecha = indiceDelElementoDelMedio - 1;
	            return busquedaBinaria(arreglo, busqueda, izquierda, derecha);
	        } else {
	            izquierda = indiceDelElementoDelMedio + 1;
	            return busquedaBinaria(arreglo, busqueda, izquierda, derecha);
	        }
	   
	    }
       }
	