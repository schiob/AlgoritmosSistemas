import java.util.Scanner;
public class Practica1 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        int a = teclado.nextInt();

        System.out.println("Ingresa un numero");
        int b = teclado.nextInt();

        System.out.println("La suma de a + b es =  " + (a+b));
    }  
}
