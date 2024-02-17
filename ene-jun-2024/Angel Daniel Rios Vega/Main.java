public class Main {
    public static void main(String[] args) {
        int[] primerLista = {7, 8, 6, 0, 9, 1, 5, 2, 4, 3};

        for (int i = 1; i < primerLista.length; i++) {
            int actual = primerLista[i];
            int j = i - 1;
            while (j >= 0 && actual < primerLista[j]) {
                primerLista[j + 1] = primerLista[j];
                j--;
            }
            primerLista[j + 1] = actual;
        }

        for (int num : primerLista) {
            System.out.print(num + " ");
        }
        
}
}

