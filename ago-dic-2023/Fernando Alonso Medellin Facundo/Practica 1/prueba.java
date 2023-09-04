import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        int num1, num2;
        Scanner guardar = new Scanner(System.in);
        System.out.println("Ingresa dos numeros separados");
        String entrada=guardar.nextLine();
        String[] numeros = entrada.split(" ");
        System.out.println("La suma es ");
        System.out.println(Integer.parseInt(numeros[0])+Integer.parseInt(numeros[1]));
    }
}

//entrada_escanner.split(" "):

