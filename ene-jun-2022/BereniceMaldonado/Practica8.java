package algoritmos;

import java.util.Arrays;

public class Practica8 {

    public static void main(String[] args) {
        String[] nombres = {"naproxeno","paracetamol","rimantadina","azitromicina","ibuprofeno"};
        quicksort(nombres, 0, nombres.length - 1);
        System.out.println("Medicamentos Ordenados");
        System.out.println(Arrays.toString(nombres));
    }

    private static int particion(String arreglo[], int izquierda, int derecha) {
        String pivote = arreglo[izquierda];
    
        while (true) {        
            while (arreglo[izquierda].compareTo(pivote) < 0) {
                izquierda++;
            }            
            
            while (arreglo[derecha].compareTo(pivote) > 0) {
                derecha--;
            }
            
            if (izquierda >= derecha) {
                return derecha;
            } else {
                String temporal = arreglo[izquierda];
                arreglo[izquierda] = arreglo[derecha];
                arreglo[derecha] = temporal;
                izquierda++;
                derecha--;
            }
        }
    }

    private static void quicksort(String arreglo[], int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indiceParticion = particion(arreglo, izquierda, derecha);
            quicksort(arreglo, izquierda, indiceParticion);
            quicksort(arreglo, indiceParticion + 1, derecha);
        }
    }
}
