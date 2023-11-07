package parcial_2.Ejercicio1;
import java.util.Scanner;

public class Kilometraje {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingresa el número de autos : ");
        int num=s.nextInt();
        s.nextLine();

        autos[] modelos = new autos[num];

        for (int i = 0; i < num; i++){
            String[] partes =s.nextLine().split(" ");
            String nombre = partes[0];
            int kilomentraje = Integer.parseInt(partes[1]);
            modelos[i] = new autos(nombre,kilomentraje);
        }


        quickSort(modelos, 0, num - 1);

        // Imprimir modelos
        for (autos p : modelos) {
            System.out.println(p.arreglo());
        }
    }

    private static void quickSort(autos[] modelos, int low, int high) {
        if (low < high) {
            int pi = partir(modelos, low, high);

            quickSort(modelos, low, pi - 1);
            quickSort(modelos, pi + 1, high);
        }
    }

    private static int partir(autos[] modelos, int inicio, int fin) {
        autos pivote = modelos[fin];
        int i = (inicio - 1);
        for (int j = inicio; j < fin; j++) {
            if (compararKm(modelos[j], pivote) < 0) {
                i++;
                // Intercambiar
                autos temp = modelos[i];
                modelos[i] = modelos[j];
                modelos[j] = temp;
            }
        }
        // Intercambiar i+1 con el pivote
        autos temp = modelos[i + 1];
        modelos[i + 1] = modelos[fin];
        modelos[fin] = temp;

        return i + 1;
    }
    private static int compararKm(autos a, autos b) {
        if (a.km != b.km) return b.km - a.km;
        return a.nombre.compareTo(b.nombre);
    }
}
