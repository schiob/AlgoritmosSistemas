5
import java.util.Scanner;

public class prueba1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa dos enteros separados por un espacio:");

        // Lee la entrada del usuario
        String input = scanner.nextLine();

        // Separa los dos enteros usando un espacio como delimitador
        String[] numeros = input.split(" ");

        if (numeros.length != 2) {
            System.out.println("Entrada inválida. Debes ingresar dos enteros separados por un espacio.");
        } else {
            try {
                // Convierte los números a enteros
                int numero1 = Integer.parseInt(numeros[0]);
                int numero2 = Integer.parseInt(numeros[1]);

                // Calcula la suma
                int suma = numero1 + numero2;

                // Imprime el resultado
                System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Debes ingresar dos enteros válidos.");
            }
        }

        scanner.close();
    }
}

