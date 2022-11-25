import java.util.*;
import java.util.Scanner;

class Practica5 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe el nombre de los dinos: ");
        String entrada = teclado.nextLine();
        String[] dinos = entrada.split(" ");

        int a = dinos.length;
        intSort(dinos, a);
        for (int x = 0; x < a; x++){
            System.out.print(dinos[x] + " ");
        }

    }
    public static void intSort(String[] b, int c) {
        for (int d = 1; d < c; d++) {
            String temp = b[d];

            int e = d - 1;
            while (e >= 0 && temp.length() < b[e].length()) {
                b[e + 1] = b[e];
                e--;
            }
            b[e + 1] = temp;
        }
    }
}
