import java.util.*;

public class Ejercicio2Parcial_2 {

    public static class RadixOrdenador {
        public Queue<Integer>[] cubetas;
        public int[] numeros;
        public RadixOrdenador(int[] numeros) {
            this.cubetas = new Queue[10];
            for (int i = 0; i < 10; i++) {
                this.cubetas[i] = new LinkedList<>();
            }
            this.numeros = numeros;
        }

        public void ordenar() {
            int numeroMaximo = encontrarMaximo(numeros);

            for (int exp = 1; numeroMaximo / exp > 0; exp *= 10) {
                distribuirNumeros(exp);
                recolectarNumeros();
            }
        }

        public void distribuirNumeros(int exponente) {
            for (int numero : numeros) {
                int indiceCubeta = (numero / exponente) % 10;
                cubetas[indiceCubeta].add(numero);
            }
        }

        public void recolectarNumeros() {
            int indice = 0;
            for (Queue<Integer> cubeta : cubetas) {
                while (!cubeta.isEmpty()) {
                    numeros[indice++] = cubeta.poll();
                }
            }
        }

        public int encontrarMaximo(int[] numeros) {
            return Arrays.stream(numeros).max().orElse(Integer.MIN_VALUE);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumeros = scanner.nextInt();
        int[] numeros = new int[totalNumeros];

        for (int i = 0; i < totalNumeros; i++) {
            numeros[i] = scanner.nextInt();
        }

        RadixOrdenador ordenador = new RadixOrdenador(numeros);
        ordenador.ordenar();

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        scanner.close();
    }
}

