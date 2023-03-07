package algoritmos;
import java.util.Scanner;

/*@author cecyl*/
public class Dinosaurios {
        
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Nombres de los dinosaurios sin acomodar: ");
        String[] dinos = s.nextLine().split(" ");

        //Ordenamiento implementando el Bubble Sort
        for (int i = 0 ; i < dinos.length-1 ; i++) {
            for (int j = 0 ; j < dinos.length-i-1 ; j++) {
                if (dinos[j].length() < dinos[j+1].length()) {
                    String arrN = dinos[j];
                    dinos[j] = dinos[j+1];
                    dinos[j+1] = arrN;
                }
            }
        }
        //Imprimir nombres ya acomodados:
        System.out.println("Los nombres de los dinosaurios del más largo al mas corto son:");
        for (String dino : dinos) {
            System.out.print(dino + " ");
        }
    }
}