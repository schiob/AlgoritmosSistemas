import java.util.Scanner;

public class pokemones {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Numero de pokemones: ");
		int n = scanner.nextInt(); 
        int[] pokemones = new int[n];
        
        System.out.print("Pokemones: ");
        for (int i = 0; i < n; i++) {
            pokemones[i] = scanner.nextInt();
        }
        
        //Bubble sort 
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (pokemones[j] < pokemones[j + 1]) {
                    int temp = pokemones[j];
                    pokemones[j] = pokemones[j + 1];
                    pokemones[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(pokemones[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        		

	}//end main

}//end class