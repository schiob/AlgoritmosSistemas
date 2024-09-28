import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*SE INGRESA LA CANTIDAD DE POKEMONS*/

        System.out.println("Ingrese la cantidad de pokemons que tiene Carlitos y el poder de cada uno: ");
        int pok = sc.nextInt();
        int poder[] = new int[pok];

        /*SE INGRESA EL PODER DE CADA POKEMON*/

        for(int i = 0; i<poder.length; i++) {
            poder[i] = sc.nextInt();
        }

        /*SE ORDENAN LOS POKEMONS DE MAYOR A MENOR*/
        
        for(int i = 0; i<poder.length; i++) {
            int aux = i;
            for(int j = i + 1; j<poder.length; j++) {
                if (poder[aux] < poder[j]) {
                    aux = j;
                }
            }
            int temp = poder[i];
            poder[i] = poder[aux];
            poder[aux] = temp;
        }

        /*IMPRIMIR LOS VALORES ORDENADOS*/

            System.out.println("Poder de cada pokemon ordenado de mayor a menor\n");
        for(int i = 0; i<poder.length; i++) {
            System.out.print(poder[i] + " ");
        }
    }
}
