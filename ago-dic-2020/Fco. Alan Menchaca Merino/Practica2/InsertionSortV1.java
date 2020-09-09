package javatest;

public class InsertionSortV1 {

    public static void main(String[] args) {

        int[] numeros = {20, 50, 10, 60, 40, 70, 30, 90, 80, 100};

        System.out.print("Arreglo antes de ser ordenado: ");
        for (int numero : numeros) {
            System.out.print(numero + ", ");
        }

        for (int i = 0; i < numeros.length - 1; i++) {

            int pos_actual = i;
            int pos_siguiente = (pos_actual + 1);

            while (numeros[pos_siguiente] <= numeros[pos_actual]) {

                // Se guarda el elemento en una variable de acuerdo a la posición.
                int elemento_actual = numeros[pos_actual];
                int elemento_siguiente = numeros[pos_siguiente];

                // Se intercambia el elemento en la posición actual y en la posición siguiente.
                numeros[pos_actual] = elemento_siguiente;
                numeros[pos_siguiente] = elemento_actual;

                if (pos_actual == 0) {
                    break;
                }

                pos_actual--;
                pos_siguiente = (pos_actual + 1);
            }
        }

        System.out.print("\nArreglo ordenado con InsertionSortV1: ");
        for (int numero : numeros) {
            System.out.print(numero + ", ");
        }
    }
}

