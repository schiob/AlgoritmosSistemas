
package parcialUno;

import java.util.Scanner;


public class practicaCinco {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 

        System.out.println("\nIngrese el nombre de los dinosaurios separados por un espacio, ejemplo: T-rex Barney Reptar ");
        String nombresEntrada = sc.nextLine();//La entrada de cada uno de los dinosaurios
        String[] listaDeNombres = nombresEntrada.split(" ");//La creacion de un arreglo con cada uno de los nombres

        for (int i = 0; i < listaDeNombres.length; i++) { //Algoritmo insertionSort
            String ayuda = listaDeNombres[i]; //String que contiene momentaneamente el valor del arreglo en el indice "i"
            int j = i-1;
            while ((j > -1) && listaDeNombres [j].length() > ayuda.length()) {
                listaDeNombres [j+1] = listaDeNombres [j];
                j--;
            }
            listaDeNombres [j+1] = ayuda;    
        }
        
        
        System.out.println("\nNombres de los dinosaurios ordenados por nombre, del mas corto al mas largo");
     for (String i : listaDeNombres) {
            System.out.printf(i+" ");
        }
        
    }

    
}