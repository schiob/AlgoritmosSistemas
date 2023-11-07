
package Practicas;
   import java.util.Scanner;


public class ejeradix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // ingrese la cantidad de números a ordenar
        System.out.println("Teclea el número de números:");
        int cantidadNumeros = scanner.nextInt();
        int[] numeros = new int[cantidadNumeros];  // Arreglo para almacenar los números

        //   ingrese los números
        System.out.println("Teclea los números:");
        for (int i = 0; i < cantidadNumeros; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Ordenar los números usando Radix Sort
        ordenarPorRadix(numeros);

        // Indicar que los números han sido ordenados y mostrarlos
        System.out.println("Ya están los números ordenaditos:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        scanner.close();  // Cerrar el scanner al terminar
    }
    
    // Método que maneja el proceso de Radix Sort
    private static void ordenarPorRadix(int[] numeros) {
        // Encontrar el número máximo para determinar el número de dígitos más largo
        int numeroMaximo = obtenerMaximo(numeros);

        // Ordenar para cada dígito, comenzando por el menos significativo
        for (int exp = 1; numeroMaximo / exp > 0; exp *= 10) {
            ordenamientoPorCuenta(numeros, exp);
        }
    }

    // Método para encontrar el número más grande en el arreglo
    private static int obtenerMaximo(int[] numeros) {
        int maximo = numeros[0];
        for (int num : numeros) {
            if (num > maximo) {
                maximo = num;
            }
        }
        return maximo;
    }

    // Método para ordenar los num 
    private static void ordenamientoPorCuenta(int[] numeros, int exp) {
        int[] salida = new int[numeros.length];  // Arreglo temporal para guardar los números ordenados
        int[] cuenta = new int[10];  // Arreglo para contar las ocurrencias de cada dígito (0-9)

        // Contar ocurrencias de cada dígito
        for (int numero : numeros) {
            cuenta[(numero / exp) % 10]++;
        }

        // Convertir cuenta en posiciones acumulativas
        for (int i = 1; i < cuenta.length; i++) {
            cuenta[i] += cuenta[i - 1];
        }

        // Construir el arreglo de salida ordenando por el dígito actual
        for (int i = numeros.length - 1; i >= 0; i--) {
            salida[cuenta[(numeros[i] / exp) % 10] - 1] = numeros[i];
            cuenta[(numeros[i] / exp) % 10]--;
        }

        // Copiar los números ordenados de vuelta al arreglo original
        System.arraycopy(salida, 0, numeros, 0, numeros.length);
    }
}
