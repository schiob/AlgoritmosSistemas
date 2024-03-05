import java.util.*;

public class intentoparcial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] relojes = new String[n];
        for (int i = 0; i < n; i++) {
            relojes[i] = scanner.nextLine();
        }
        mergeSort(relojes, 0, n - 1);
        for (String reloj : relojes) {
            System.out.println(reloj);
        }
    }

    public static void mergeSort(String[] arr, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int mitad = (izquierda + derecha) / 2;
            mergeSort(arr, izquierda, mitad);
            mergeSort(arr, mitad + 1, derecha);
            merge(arr, izquierda, mitad, derecha);
        }
    }

    public static void merge(String[] arr, int izquierda, int mitad, int derecha) {
        int n1 = mitad - izquierda + 1;
        int n2 = derecha - mitad;
        String[] izquierdaArr = new String[n1];
        String[] derechaArr = new String[n2];
        for (int i = 0; i < n1; ++i) {
            izquierdaArr[i] = arr[izquierda + i];
        }
        for (int j = 0; j < n2; ++j) {
            derechaArr[j] = arr[mitad + 1 + j];
        }
        int i = 0, j = 0;
        int k = izquierda;
        while (i < n1 && j < n2) {
            if (compararTiempos(izquierdaArr[i], derechaArr[j])) {
                arr[k] = izquierdaArr[i];
                i++;
            } else {
                arr[k] = derechaArr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = izquierdaArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = derechaArr[j];
            j++;
            k++;
        }
    }

    public static boolean compararTiempos(String tiempo1, String tiempo2) {
        String[] partes1 = tiempo1.split(" ");
        String[] partes2 = tiempo2.split(" ");
        String hora1 = partes1[0];
        String periodo1 = partes1[1];
        String hora2 = partes2[0];
        String periodo2 = partes2[1];
        

        if (hora1.length() == 4) {
            hora1 = "0" + hora1;
        }
        if (hora2.length() == 4) {
            hora2 = "0" + hora2;
        }

        if (periodo1.equals("AM") && periodo2.equals("PM")) {
            return true;
        } else if (periodo1.equals("PM") && periodo2.equals("AM")) {
            return false;
        } else if (periodo1.equals(periodo2)) {
            return hora1.compareTo(hora2) < 0;
        }
        return false;
    }
}
