import java.util.Scanner;

class Auto {
    String nombre;
    int kilometraje;

    public Auto(String nombre, int kilometraje) {
        this.nombre = nombre;
        this.kilometraje = kilometraje;
    }
}

class QuickSortAutos {
    public static void ordenar(Auto[] autos, int bajo, int alto) {
        if (bajo < alto) {
            int indicePivote = particion(autos, bajo, alto);
            ordenar(autos, bajo, indicePivote - 1);
            ordenar(autos, indicePivote + 1, alto);
        }
    }

    public static int particion(Auto[] autos, int bajo, int alto) {
        Auto pivote = autos[alto];
        int i = bajo - 1;
        for (int j = bajo; j < alto; j++) {
            if (autos[j].kilometraje > pivote.kilometraje) {
                i++;
                intercambiar(autos, i, j);
            }
        }

        intercambiar(autos, i + 1, alto);
        return i + 1;
    }

    public static void intercambiar(Auto[] autos, int i, int j) {
        Auto temp = autos[i];
        autos[i] = autos[j];
        autos[j] = temp;
    }
}

public class Parcial_2 {
    public static void imprimirAutos(Auto[] autos) {
        for (Auto auto : autos) {
            System.out.println(auto.nombre + " " + auto.kilometraje);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadAutos = scanner.nextInt();
        scanner.nextLine();

        Auto[] autos = new Auto[cantidadAutos];
        for (int i = 0; i < cantidadAutos; i++) {
            String linea = scanner.nextLine();
            String[] infoAuto = linea.split(" ");
            autos[i] = new Auto(infoAuto[0], Integer.parseInt(infoAuto[1]));
        }

        QuickSortAutos.ordenar(autos, 0, cantidadAutos - 1);
        imprimirAutos(autos);
        scanner.close();
    }
}

