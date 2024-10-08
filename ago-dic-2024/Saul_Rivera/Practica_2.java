import java.util.*;

    public class Practica_2 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
    
            System.out.print("Por favor, ingrese la cantidad de problemas que David quiere resolver: ");
                int acts = sc.nextInt(); 
                int[] arr = new int[acts]; 
    
            System.out.print("Ahora ingrese los minutos totales que David tiene disponibles: ");
              int mins = sc.nextInt(); 
    
            System.out.println("Ingrese los minutos que toma resolver cada uno de los " + acts + " problemas:");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print("Problema " + (i + 1) + ": ");
                        arr[i] = sc.nextInt(); 
            }
    
            // Ordenar los tiempos de menor a mayor usando el método de inserción
            for (int i = 1; i < arr.length; i++) {
                    int auxiliar = arr[i];
                        int j;
                            for (j = i - 1; j >= 0 && arr[j] > auxiliar; j--) {
                                arr[j + 1] = arr[j]; 
                            }
                                 arr[j + 1] = auxiliar;
            }
    
            int suma = 0; 
                int problemas_resueltos = 0; 
                    for (int i = 0; i < arr.length; i++) {
                        if (suma + arr[i] <= mins) {
                            suma += arr[i]; 
                            problemas_resueltos++;
                        } else {
                            break; 
                        }
            }
    
            System.out.println("\nDavid ha podido resolver " + problemas_resueltos + " problemas.");

            System.out.println("Tiempo total disponible: " + mins + " minutos.");
            
            System.out.println("Tiempo utilizado: " + suma + " minutos.");
            
            System.out.println("¡Gracias por usar nuestro programa!");
        }
    }