
import java.util.Scanner;

public class algoritmosp1 {

    public static void main(String[] args) {
        int salida = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese dos enteros separados por un espacio:");
        String[] input = scanner.nextLine().split(" ");

        salida = Integer.parseInt(input[0]) + Integer.parseInt(input[1]);
        System.out.print("suma: " + salida + "\n");
    }
}
