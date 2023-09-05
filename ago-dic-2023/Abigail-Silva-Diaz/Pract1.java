import java.util.Scanner;


public class Pract1 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese dos enteros separados por un espacio
        System.out.print("Ingresa dos numeros enteros separados por un espacio: ");

        // Leer la entrada del usuario y almacenarla en una cadena (String)
        String entrada = scanner.nextLine();

        // Cerrar el objeto Scanner, ya no lo necesitamos
        scanner.close();

        // Dividir la entrada en dos partes utilizando el espacio como separador
        String[] partes = entrada.split(" ");

        // Verificar que haya dos partes (dos enteros)
        if (partes.length != 2) {
            System.out.println("Debes ingresar exactamente dos enteros separados por un espacio.");
        } else {
            try {
                // Convertir las partes en enteros
                int numero1 = Integer.parseInt(partes[0]);
                int numero2 = Integer.parseInt(partes[1]);

                // Calcular la suma de los enteros
                int suma = numero1 + numero2;

                // Imprimir el resultado
                System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa dos enteros válidos.");
            }
        }
    }
    
}
