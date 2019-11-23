package ordenMergeSort;

import ordenMergeSort.nombreLibro;
import ordenMergeSort.SortingUtility;

public class MergesortObjectExample {
	public static void main(String[] args) {
        nombreLibro []libros = new nombreLibro[5];
        nombreLibro libro = new nombreLibro("Harry","Potter",245);
        libros[0] = libro;
        libro = new nombreLibro("Godel","EscherBach",777);
        libros[1] = libro;
        libro = new nombreLibro("Flatland","",96);
        libros[2] = libro;
        libro = new nombreLibro("Mistborn","",541);
        libros[3] = libro;
        libro = new nombreLibro("CleanCode","",469);
        libros[4] = libro;
 
        System.out.println("Ordenando por orden ascendente");
        printArray(libros);
         SortingUtility.sort(libro);
        System.out.println("Despues de ordenar...");
        printArray(libros);
 
    }
 
    public static<T> void printArray(T []a){
        for(T t : a){
            System.out.println(t);
        }
    }
 

}
