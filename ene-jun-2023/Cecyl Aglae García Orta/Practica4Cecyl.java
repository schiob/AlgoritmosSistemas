package algoritmos;
import java.util.*;

/* @author Cecyl */
public class Practica4Cecyl {

    //Método que desarrolla el algoritmo bubble sort
    public static void alg(int[] arreglo) {
        for (int i = arreglo.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    camArreglo(arreglo, j, j + 1);
                }
            }
        }
    }

    //Método para mover datos
    public static void camArreglo(int[] arreglo, int a, int b) {
        int temp = arreglo[b];
        arreglo[b] = arreglo[a];
        arreglo[a] = temp;
    }

    //Método para ingresar datos
    public static void ID(int[] arreglo) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++) {
            do{
            System.out.println("Ingrese los datos en la posicion " + i + " :");
            arreglo[i] = s.nextInt();
            }while(!(arreglo[i] >= 1 &&  arreglo[i] <= 2000));
        }
    }

    public static void main(String[] args) {
        //Crear arreglo
        int Arr = 0;
        Scanner s = new Scanner(System.in);
        //Meter datos
        do {
            System.out.println("Ingresee cuántos pokemones quiere analizar: ");
            Arr = Integer.parseInt(s.nextLine());
        }while (!(Arr >= 1 && Arr <= 50));
        
        int[] AS = new int[Arr];
        ID(AS);

        //Impresion de los datos dados.
        System.out.println("Arreglo original:");
        for (int i = 0; i < AS.length; i++) {
            System.out.print(AS[i] + " ");
        }
        System.out.println();
        
        //Implementación de metodo del algoritmo bubble sort (invertido)
        alg(AS);
        
        //Impresion de los datos acomodados.
        System.out.println("Arreglo Acomodado:");
        for (int i = 0; i < AS.length; i++) {
            System.out.print(AS[i] + " ");
        }
    }
}