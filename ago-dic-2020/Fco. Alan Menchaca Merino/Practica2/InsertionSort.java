package javatest;

public class InsertionSort {

    private InsertionSort() {
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int pos_actual = i;
            int pos_siguiente = (pos_actual + 1);

            while (array[pos_siguiente] <= array[pos_actual]) {

                // Se guarda el elemento en una variable de acuerdo a la posición.
                int elemento_actual = array[pos_actual];
                int elemento_siguiente = array[pos_siguiente];

                // Se intercambia el elemento en la posición actual y en la posición siguiente.
                array[pos_actual] = elemento_siguiente;
                array[pos_siguiente] = elemento_actual;

                if (pos_actual == 0) {
                    break;
                }

                pos_actual--;
                pos_siguiente = (pos_actual + 1);
            }
        }
    }

    public static void sort(double[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int pos_actual = i;
            int pos_siguiente = (pos_actual + 1);

            while (array[pos_siguiente] <= array[pos_actual]) {

                // Se guarda el elemento en una variable de acuerdo a la posición.
                double elemento_actual = array[pos_actual];
                double elemento_siguiente = array[pos_siguiente];

                // Se intercambia el elemento en la posición actual y en la posición siguiente.
                array[pos_actual] = elemento_siguiente;
                array[pos_siguiente] = elemento_actual;

                if (pos_actual == 0) {
                    break;
                }

                pos_actual--;
                pos_siguiente = (pos_actual + 1);
            }
        }
    }

}

