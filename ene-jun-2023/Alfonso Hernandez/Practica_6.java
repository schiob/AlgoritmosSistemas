package Algoritmos_Ordenamiento_Busqueda;

import java.util.*;

class Participante {

    String Nombre;
    int Oro, Plata, Bronce;

    public Participante(String nombre, int oro, int plata, int bronce) {
        this.Nombre = nombre;
        this.Oro = oro;
        this.Plata = plata;
        this.Bronce = bronce;
    }
}

public class Practica_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Participante> concursantes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String nombre = sc.next();
            int oro = sc.nextInt();
            int plata = sc.nextInt();
            int bronce = sc.nextInt();
            Participante concursante = new Participante(nombre, oro, plata, bronce);
            concursantes.add(concursante);
        }

        quickSort(concursantes, 0, n - 1);

        for (Participante c : concursantes) {
            System.out.println(c.Nombre);
        }
    }

    public static void quickSort(List<Participante> concursantes, int inicio, int fin) {
        if (inicio < fin) {
            int indicePivote = particion(concursantes, inicio, fin);
            quickSort(concursantes, inicio, indicePivote - 1);
            quickSort(concursantes, indicePivote + 1, fin);
        }
    }

    public static int particion(List<Participante> concursantes, int inicio, int fin) {
        // Seleccionamos el último elemento como pivote
        Participante pivote = concursantes.get(fin);
        int indiceMenor = inicio - 1;

        for (int i = inicio; i < fin; i++) {
            // Comparamos los concursantes según las reglas del problema
            if (comparar(concursantes.get(i), pivote) <= 0) {
                indiceMenor++;
                intercambiar(concursantes, indiceMenor, i);
            }
        }

        intercambiar(concursantes, indiceMenor + 1, fin);
        return indiceMenor + 1;
    }

    public static int comparar(Participante c1, Participante c2) {
        if (c1.Oro != c2.Oro) {
            return Integer.compare(c2.Oro, c1.Oro); 
        } else if (c1.Plata != c2.Plata) {
            return Integer.compare(c2.Plata, c1.Plata); 
        } else if (c1.Bronce != c2.Bronce) {
            return Integer.compare(c2.Bronce, c1.Bronce); 
        } else {
            return c1.Nombre.compareTo(c2.Nombre); 
        }
    }

    public static void intercambiar(List<Participante> concursantes, int i, int j) {
        Participante temp = concursantes.get(i);
        concursantes.set(i, concursantes.get(j));
        concursantes.set(j, temp);
    }
}
