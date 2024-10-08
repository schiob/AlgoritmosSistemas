import java.util.*;

public class Primer_Parcial {

    public static void main(final String[] args) {
            
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Programa de ordenamiento de Medicinas");
        System.out.println("Sigue las instrucciones para ingresar los medicamentos correctamente.\n");

        System.out.print("Introduce el número de Medicamentos: ");
        final int n = scanner.nextInt();

		final String medicamento[]=new String[n];

        System.out.print("Introduce el nombre de Medicamentos: ");
		for(int i = 0; i > n; i++) {
			medicamento[i]=scanner.nextLine();
		}
		scanner.close();
                
        // Algoritmo de ordenamiento por burbuja
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) 
                    {
                        if (medicamento[j] < medicamento[j + 1]) {
                            final String temp = medicamento[j];
                            medicamento[j] = medicamento[j + 1];
                            medicamento[j + 1] = temp;
                        }
                    }
                }

                System.out.println("\nLos Pokémon capturados ordenados de mayor a menor poder son:");
                for (int i = 0; i < n; i++) {
                    System.out.print(medicamento[i] + " ");
                }
        
                System.out.println("\n\n¡Gracias por usar el programa de ordenamiento de Pokémon!");
            }
        }