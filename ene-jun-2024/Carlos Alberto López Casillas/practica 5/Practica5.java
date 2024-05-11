import java.util.*;

class Concursante {
    String nombre;
    int oro, plata, bronce;

    public Concursante(String nombre, int oro, int plata, int bronce) {
        this.nombre = nombre;
        this.oro = oro;
        this.plata = plata;
        this.bronce = bronce;
    }

    public String getNombre() {
        return nombre;
    }

    public int getOro() {
        return oro;
    }

    public int getPlata() {
        return plata;
    }

    public int getBronce() {
        return bronce;
    }
}

public class Practica5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 

        List<Concursante> concursantes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] entrada = scanner.nextLine().split(" ");
            String nombre = entrada[0];
            int oro = Integer.parseInt(entrada[1]);
            int plata = Integer.parseInt(entrada[2]);
            int bronce = Integer.parseInt(entrada[3]);
            concursantes.add(new Concursante(nombre, oro, plata, bronce));
        }

        quickSort(concursantes, 0, concursantes.size() - 1);

        for (Concursante concursante : concursantes) {
            System.out.println(concursante.getNombre());
        }
    }

    public static void quickSort(List<Concursante> concursantes, int inicio, int fin) {
        if (inicio < fin) {
            int indiceParticion = particion(concursantes, inicio, fin);
            quickSort(concursantes, inicio, indiceParticion - 1);
            quickSort(concursantes, indiceParticion + 1, fin);
        }
    }

    public static int particion(List<Concursante> concursantes, int inicio, int fin) {
        Concursante pivote = concursantes.get(fin);
        int i = inicio - 1;
        for (int j = inicio; j < fin; j++) {
            if (comparar(concursantes.get(j), pivote) <= 0) {
                i++;
                Collections.swap(concursantes, i, j);
            }
        }
        Collections.swap(concursantes, i + 1, fin);
        return i + 1;
    }

    public static int comparar(Concursante c1, Concursante c2) {
        if (c1.getOro() != c2.getOro()) {
            return Integer.compare(c2.getOro(), c1.getOro());
        } else if (c1.getPlata() != c2.getPlata()) {
            return Integer.compare(c2.getPlata(), c1.getPlata()); 
        } else if (c1.getBronce() != c2.getBronce()) {
            return Integer.compare(c2.getBronce(), c1.getBronce()); 
        } else {
            return c1.getNombre().compareTo(c2.getNombre());
        }
    }
}
