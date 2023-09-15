import java.util.Scanner;

public class practica1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Ingrese numero 1: ");
        int num1 = scn.nextInt();

        System.out.print("Ingrese numero 2: ");
        int num2 = scn.nextInt();

        scn.close();

        System.out.println("La suma es: " + (num1 + num2));
    }
}
