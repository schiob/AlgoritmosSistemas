//PROFE DISCULPE POR LA HORA, ES QUE MI COMPUTADORA NO RESPONDIA
//NO ALCANCE A TERMINAR PERO AL  MENOS PUDE ORDENAR LOS NOMBRES CON QUICK SORT
package algoritmos;
import java.util.Arrays;

public class Problema2 {
    
    public static void main(String[] args) {
        System.out.println("Ordenado con QuickSort: ");
        String[] nombres = {"Fiesta de Locos", "Matador", "Comprendes,Mendes?", "Padre Nuestro", "Yo tomo","Frijolero","Si Señor", "Imagina"};
        System.out.println("Antes de QS: " + Arrays.toString(nombres));
        quicksort(nombres, 0, nombres.length - 1);
        System.out.println("Después de QS: " + Arrays.toString(nombres));
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