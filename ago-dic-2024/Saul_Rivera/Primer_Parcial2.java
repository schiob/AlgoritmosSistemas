import java.util.Scanner;

public class Primer_Parcial2 {
        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);
  
            System.out.println("Programa de ordenamiento de Medicamento");
            System.out.println("Por favor, sigue las instrucciones para ingresar los datos correctamente.\n");
    
            System.out.print("Introduce el número de Medicamentos sobrantes: ");
            int n = scanner.nextInt();
    
            // Arreglo para las pastillas sobrantes del Medicamento
            int[] medicamento = new int[n];
    
            System.out.println("Introduce las pastillas de cada Medicamento separados por un espacio:");
            for (int i = 0; i < n; i++) {
                medicamento[i] = scanner.nextInt();
            }
    
            scanner.close();
    
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (medicamento[j] < medicamento[j + 1]) {
                        // mayor a menor
                        int temp = medicamento[j];
                        medicamento[j] = medicamento[j + 1];
                        medicamento[j + 1] = temp;
                    }
                }
            }
    
            System.out.println("\nLos Medicamentos ordenados de mayor a menor son:");
            for (int i = 0; i < n; i++) {
                System.out.print(medicamento[i] + " ");
            }
        }
    }

    
