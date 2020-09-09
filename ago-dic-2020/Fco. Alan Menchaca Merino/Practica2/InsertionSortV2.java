package javatest;

public class InsertionSortV2 {

    public static void main(String[] args) {

        int[] numeros = {20, 50, 10, 60, 40, 70, 30, 90, 80, 100};

        // Mostramos todos los elementos del arreglo antes de ordenarlos
        System.out.print("Arreglo antes de ser ordenado: ");
        for (int numero : numeros) {
            System.out.print(numero + ", ");
        }
        System.out.println("\n");

        /* Ciclo for que itera todos los elementos del arreglo (el -1 agregado en la condición del
           ciclo for es para no visitar una posición fuera de rango ya que en el arreglo
           al utilizar la variable pos_siguiente 'numeros[pos_siguiente]' puede llegar a
           utilizar una posición mayor a la longitud del arreglo en el ciclo while. */
        for (int i = 0; i < numeros.length - 1; i++) {

            int pos_actual = i;
            int pos_siguiente = (pos_actual + 1);

            /* Comparación hacía atras, ciclo que se ejecuta solo si el elemento en la posición
               siguiente del arreglo números, es menor o igual que el elemento en la posición
               actual (si el ciclo no se ejecuta, significa que el elemento en la posición siguiente
               ya está ordenado).*/
            while (numeros[pos_siguiente] <= numeros[pos_actual]) {

                // Se guarda el elemento en una variable de acuerdo a la posición.
                int elemento_actual = numeros[pos_actual];
                int elemento_siguiente = numeros[pos_siguiente];

                System.out.print(String.format("%13s", "Actual: "));
                for (int j = 0; j < numeros.length; j++) {
                    if (j == pos_actual || j == pos_siguiente) {
                        System.out.print(String.format("%5s*", numeros[j]));
                    } else {
                        System.out.print(String.format("%5s ", numeros[j]));
                    }
                }
                System.out.println();

                // Se intercambia el elemento en la posición actual y en la posición siguiente.
                numeros[pos_actual] = elemento_siguiente;
                numeros[pos_siguiente] = elemento_actual;

                System.out.print(String.format("%13s", "Intercambio: "));
                for (int j = 0; j < numeros.length; j++) {
                    if (j == pos_actual || j == pos_siguiente) {
                        System.out.print(String.format("%5s*", numeros[j]));
                    } else {
                        System.out.print(String.format("%5s ", numeros[j]));
                    }
                }
                System.out.println("\n");

                // El ciclo while dejará de ejeuctarse si la posición actual es la última
                // posición del arreglo.
                if (pos_actual == 0) {
                    break;
                }

                // Se utilizan posiciónes anteriores, para realizar una comparación hacía atras.
                pos_actual--;
                pos_siguiente = (pos_actual + 1);
            }
        }

        System.out.print("Arreglo ordenado con InsertionSortV2: ");
        for (int numero : numeros) {
            System.out.print(numero + ", ");
        }
    }
}

