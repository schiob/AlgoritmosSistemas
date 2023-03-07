package U1;

/**
 *
 * @author Cancino
 */
public class Practica_2 {
    
 public static void algoritmo(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            int aux = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > aux) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = aux;
        }
    }

    public static void main(String[] args) {
        int[] arreglo = {3, 43, 2, 5, 4, 6, 5, 4, 334, 45, 23, 123, 323, 45, 34, 23, 43, 5, 46, 78};
        algoritmo(arreglo);
        for (int x = 0; x <= arreglo.length-1;x++) {
            if(arreglo[x] %2 == 0){
            System.out.print(arreglo[x]+ " ");
            }
        }

    }
}