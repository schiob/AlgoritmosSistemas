import java.util.Scanner;

public class Parcial2_Ejercicio1 {

    static class Carro {

        private String nombre;
        private int kilometraje;

        public Carro(String nombre, int kilometraje) {
            this.nombre = nombre;
            this.kilometraje = kilometraje;
        }

        public String getNombre() {
            return nombre;
        }

        public int getKilometraje() {
            return kilometraje;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de autos de Juan : \n");
        int n = scanner.nextInt();
        scanner.nextLine();

        Carro[] autos = new Carro[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre del carro " + (i + 1) + ": \n");
            String nombre = scanner.nextLine().toUpperCase();

            System.out.print("Ingrese el kilometraje del carro " + (i + 1) + ": \n");
            int kilometraje = scanner.nextInt();
            scanner.nextLine();
            autos[i] = new Carro(nombre, kilometraje);
        }

        System.out.println("\nLista de autos ingresados:");
        for (Carro auto : autos) {
            System.out.println(auto.getNombre() + " /// " + auto.getKilometraje() + " km");
        }

        quickSort(autos, 0, n - 1);

        System.out.println("\nLista de autos ordenada por kilometraje (de mayor a menor):");
        for (Carro auto : autos) {
            System.out.println(auto.getNombre() + " /// " + auto.getKilometraje() + " km");
        }
    }

    private static void quickSort(Carro[] autos, int bajo, int alto) {
        if (bajo < alto) {
            int indicePivote = particion(autos, bajo, alto);
            quickSort(autos, bajo, indicePivote - 1);
            quickSort(autos, indicePivote + 1, alto);
        }
    }

    private static int particion(Carro[] autos, int bajo, int alto) {
        int pivote = autos[alto].getKilometraje();
        int i = bajo - 1;
        for (int j = bajo; j < alto; j++) {
            if (autos[j].getKilometraje() >= pivote) {
                i++;
                intercambiar(autos, i, j);
            }
        }
        intercambiar(autos, i + 1, alto);
        return i + 1;
    }

    private static void intercambiar(Carro[] autos, int i, int j) {
        Carro temp = autos[i];
        autos[i] = autos[j];
        autos[j] = temp;
    }
}
