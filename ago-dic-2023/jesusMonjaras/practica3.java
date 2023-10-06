import java.util.Scanner;

public class practica3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Numero de pokemons que capturo carlitos: ");
        int pokemonsCaputrados = scn.nextInt();
        scn.nextLine(); // Para evitar java.lang.NumberFormatException: For input string: ""

        System.out.print("Poder de cada pokemon separado por 1 espacio: ");
        String puntosPokemons = scn.nextLine();

        scn.close();

        String[] puntosxPokemon = puntosPokemons.split(" ");

        for (int i = 0; i < puntosxPokemon.length; i++) {
            int menor = i;
            for (int j = i + 1; j < puntosxPokemon.length; j++) {
                if (Integer.parseInt(puntosxPokemon[menor]) > Integer.parseInt(puntosxPokemon[j])) {
                    menor = j;
                }
            }
            int temp = Integer.parseInt(puntosxPokemon[i]);
            puntosxPokemon[i] = String.valueOf(puntosxPokemon[menor]);
            puntosxPokemon[menor] = String.valueOf(temp);
        }

        for (String puntos : puntosxPokemon) {
            System.out.print(puntos + " ");
        }
    }
}
