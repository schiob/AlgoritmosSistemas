import java.util.Scanner;

public class Practica_1 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); 
            System.out.println("Ingrese ambos valores: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int c = a + b;

            System.out.println("Resultado: " + c);
        }
}