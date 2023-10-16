import java.util.Scanner;

public class practica5 {

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String [] dinosaurios = scn.nextLine().split(" ");
        scn.close();

        mergeSort(dinosaurios);

        for (int i = 0; i < dinosaurios.length; i++) {
            System.out.print(dinosaurios[i] + " ");
        }
    }

    private static void mergeSort(String[] dinosaurios) {

        int tamano = dinosaurios.length;
        if (tamano <= 1) {
            return;
        }

        int mitad = tamano / 2;
        String[] arrIzq = new String[mitad];
        String[] arrDer = new String[tamano - mitad];
        int j = 0;

        for (int i = 0; i < tamano; i++) {
            if (i < mitad) {
                arrIzq[i] = dinosaurios[i];
            } else {
                arrDer[j] = dinosaurios[i];
                j++;
            }
        }
        mergeSort(arrIzq);
        mergeSort(arrDer);
        merge(arrIzq, arrDer, dinosaurios);
    }

    private static void merge(String[] arrIzq, String[] arrDer, String[] arr) {

        int tamanoIzq = arr.length / 2;
        int tamanoDer = arr.length - tamanoIzq;
        int i = 0, izq = 0, der = 0;

        while (izq < tamanoIzq && der < tamanoDer) {
            if (arrIzq[izq].length() < arrDer[der].length()) {
                arr[i] = arrIzq[izq];
                i++;
                izq++;
            } else {
                arr[i] = arrDer[der];
                i++;
                der++;
            }
        }
        while (izq < tamanoIzq) {
            arr[i] = arrIzq[izq];
            i++;
            izq++;
        }
        while (der < tamanoDer) {
            arr[i] = arrDer[der];
            i++;
            der++;
        }
    }

}