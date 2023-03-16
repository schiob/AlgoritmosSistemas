package U1;

/**
 *
 * @author Cancino
 */
import java.util.*;

public class Practica_6 {

    static class Concursante {

        String nombre;
        int oro, plata, bronce;

        public Concursante(String nombre, int oro, int plata, int bronce) {
            this.nombre = nombre;
            this.oro = oro;
            this.plata = plata;
            this.bronce = bronce;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Alumnos:");
        int n = sc.nextInt();
        List<Concursante> concursantes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nombre:");
            String nombre = sc.next();
            System.out.println("Oro:");
            int oro = sc.nextInt();
            System.out.println("Plata:");
            int plata = sc.nextInt();
            System.out.println("Bronze:");
            int bronce = sc.nextInt();
            concursantes.add(new Concursante(nombre, oro, plata, bronce));
        }
        quickSort(concursantes, 0, n - 1);
        System.out.println(" ");
        for (Concursante c : concursantes) {
            System.out.println(c.nombre);
        }
    }

    public static void quickSort(List<Concursante> arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    public static int partition(List<Concursante> arr, int left, int right) {
        Concursante pivot = arr.get(right);
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (esMejor(arr.get(j), pivot)) {
                i++;
                Collections.swap(arr, i, j);
            }
        }
        Collections.swap(arr, i + 1, right);
        return i + 1;
    }

    public static boolean esMejor(Concursante a, Concursante b) {
        if (a.oro > b.oro) {
            return true;
        } else if (a.oro == b.oro && a.plata > b.plata) {
            return true;
        } else if (a.oro == b.oro && a.plata == b.plata && a.bronce > b.bronce) {
            return true;
        } else if (a.oro == b.oro && a.plata == b.plata && a.bronce == b.bronce && a.nombre.compareTo(b.nombre) < 0) {
            return true;
        }
        return false;
    }
}



