import java.util.Scanner;

public class SumaEnteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el primer valor: ");
        int x = scanner.nextInt();
        System.out.print("Ingresa el segundo valor: ");
        int y = scanner.nextInt();
        
        scanner.close();

        System.out.print("El valor de la suma es: ");
        int suma = x + y;
        
        System.out.println(suma);
    }
}