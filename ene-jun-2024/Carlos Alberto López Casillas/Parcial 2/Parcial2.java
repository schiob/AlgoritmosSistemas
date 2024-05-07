import java.util.Scanner;

public class Parcial2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        int n = scanner.nextInt();
        String x = scanner.next();
        scanner.nextLine(); 

        String[] libros = scanner.nextLine().split(" ");


        int posicion = -1;
        for (int i = 0; i < n; i++) {
            if (libros[i].equals(x)) {
                posicion = i + 1; 
                break;
            }
        }


        System.out.println(posicion);

        scanner.close();
    }
}
