import java.util.Scanner;

public class practica4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Cantidad de palabras en la lista de Ricardo: ");
        int cantPalabras = scn.nextInt();
        scn.nextLine();

        System.out.print("Palabras en la lista de Ricardo: 7");
        String[] listaRicardo = scn.nextLine().split(" ");

        for (int j = 1; j < listaRicardo.length; j++) {
            String actual = listaRicardo[j];
            int i = j - 1;
            while (i >= 0 && listaRicardo[i].compareTo(actual) > 0) {
                listaRicardo[i + 1] = listaRicardo[i];
                i--;
            }
            listaRicardo[i + 1] = actual;
        }
        
        for (String palabra : listaRicardo) {
            System.out.print(palabra + " ");
        }

    }
}