import java.util.Scanner;
public class Practica3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos pokemons capturaste?");
        String pokemones = teclado.nextLine();
        int pokemons = Integer.parseInt(pokemones);
        
        System.out.print("Cual es el poder de cada pokemon?");
        String entrada2 = teclado.nextLine();
        String[] poderes = entrada2.split(" ");

        int arr[] = new int[pokemons];

        for (int a = 0; a < pokemons; a++) {
            arr[a] = Integer.parseInt(poderes[a]);
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        sort(arr);
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void sort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    } 
}
