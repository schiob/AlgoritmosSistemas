import java.util.Scanner;

public class Practica4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de palabras: ");
        int num = sc.nextInt();
        String[] array = new String[num];

        System.out.print("Palabras: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.next();
        }

        array = setItems(array);

        printArray(array, 0);
        sc.close();
    }

    //FUNCION PARA IMPRIMIR EL ARRAY

    public static void printArray(String[] array, int index) {
        if (index < array.length) {
            System.out.print(array[index] + " ");
            printArray(array, index + 1);
        }
    }

    //FUNCION PARA METER VALORES A LOS PARAMETROS

    public static String[] setItems(String[] array) {
        if (array.length < 2) {
            return array;
        }
        
        int middle = array.length / 2;
        String[] left = new String[middle];
        String[] right = new String[array.length - left.length];

        int i;
        for (i = 0; i < left.length; i++) {
            left[i] = array[i];
        }

        int k = 0;
        for (int j = i; j < array.length; j++) {
            right[k] = array[j];
            k++;
        }

        left = setItems(left);
        right = setItems(right);

        return merge(left, right);

    }

    public static String[] merge(String[] left, String[] right) {
        String[] result = new String[left.length + right.length];

        int arr_res = 0;
        int idx_izq = 0;
        int idx_der = 0;

        while (idx_izq < left.length && idx_der < right.length) {
            if (left[idx_izq].compareTo(right[idx_der]) < 0) {
                result[arr_res] = left[idx_izq];
                idx_izq++;
            } else {
                result[arr_res] = right[idx_der];
                idx_der++;
            }
            arr_res++;
        }

        while (idx_izq < left.length) {
            result[arr_res] = left[idx_izq];
            idx_izq++;
            arr_res++;
        }

        while (idx_der < right.length) {
            result[arr_res] = right[idx_der];
            idx_der++;
            arr_res++;
        }
        
        return result;
    }
}
