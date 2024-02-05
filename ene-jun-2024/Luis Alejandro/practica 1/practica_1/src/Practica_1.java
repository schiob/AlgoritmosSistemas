import java.util.Scanner;

public class Practica_1 {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();
        String[] numeros = entrada.split(" ");
        int x = Integer.parseInt(numeros[0]);
        int y = Integer.parseInt(numeros[1]);


        int suma = x + y ;


        System.out.println(suma);


	}
}