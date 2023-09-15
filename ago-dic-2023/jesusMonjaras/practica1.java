import java.util.Scanner;

public class practica1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String numerosConEspacio;

        System.out.print("Ingrese dos numeros separados por un espacio: ");
        numerosConEspacio = scn.nextLine();

        String numerosSinEspacio[] = numerosConEspacio.split(" ");

        int suma = 0;

        for (int i = 0; i < 2; i++) {
            suma += Integer.parseInt(numerosSinEspacio[i]);
        }

        System.out.print("La suma de ambos numeros es: " + suma);

        scn.close();
    }
}
