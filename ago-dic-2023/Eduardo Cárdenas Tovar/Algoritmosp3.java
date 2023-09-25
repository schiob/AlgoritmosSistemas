
import java.util.Arrays;
import java.util.Scanner;

public class Practica3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Leer el número de pokemons
        System.out.println("¿Cuantos pokemons ha capturado Carlitos\n");
        int n = entrada.nextInt();

        // Crear un arreglo para almacenar los CP de los pokemons
        int[] PuntosAtaque = new int[n];
        System.out.println("\nEscribe el CP de cada pokemon conforme comenzando con el más actual");
        for (int i = 0; i < n; i++) {
            int z = n;
            System.out.println("\n Puntos de ataque del Pokemon capturado numero " + (z-i) + ":");
            PuntosAtaque[i] = entrada.nextInt();
        }

        // Aplicar el algoritmo de selección para ordenar los CP de mayor a menor
        System.out.println("\n Puntos de ataque de los pokemons capturados del mas actual al mas antiguo");
        System.out.println(Arrays.toString(PuntosAtaque));

        for (int i = 0; i < n - 1; i++) {
            int Maximo = i;
            for (int j = i + 1; j < n; j++) {
                if (PuntosAtaque[j] > PuntosAtaque[Maximo]) {
                    Maximo = j;
                }
            }
            // Intercambiar los valores
            int llave = PuntosAtaque[i];
            PuntosAtaque[i] = PuntosAtaque[Maximo];
            PuntosAtaque[Maximo] = llave;
        }

        // Imprimir la lista ordenada de pokemons
        System.out.println("\nPokemones ordenados de Mayor a Menor por puntos de ataque: \n");
        System.out.println(Arrays.toString(PuntosAtaque));
    }
}
