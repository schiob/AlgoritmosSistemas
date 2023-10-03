import javax.swing.JOptionPane;
import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args) {
        int n = obtenerNumeroPokemon();
        int[] cpValues = obtenerValoresCP(n);
        ordenarCP(cpValues);
        mostrarResultado(cpValues);
    }

    private static int obtenerNumeroPokemon() {
        String nInput = JOptionPane.showInputDialog("Ingrese el número de Pokémon (1 <= n <= 50):");
        return Integer.parseInt(nInput);
    }

    private static int[] obtenerValoresCP(int n) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese los valores de CP separados por espacios (1 <= ni <= 2000): ");
        String cpInput = sc.nextLine();
        sc.close();

        String[] cpTokens = cpInput.split(" ");
        int[] cpValues = new int[n];
        for (int i = 0; i < n; i++) {
            cpValues[i] = Integer.parseInt(cpTokens[i]);
        }

        return cpValues;
    }

    private static void ordenarCP(int[] cpValues) {
        for (int i = 0; i < cpValues.length - 1; i++) {
            for (int j = i + 1; j < cpValues.length; j++) {
                if (cpValues[i] < cpValues[j]) {
                    int temp = cpValues[i];
                    cpValues[i] = cpValues[j];
                    cpValues[j] = temp;
                }
            }
        }
    }

    private static void mostrarResultado(int[] cpValues) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < cpValues.length; i++) {
            resultado.append(cpValues[i]);
            if (i < cpValues.length - 1) {
                resultado.append(" ");
            }
        }

        JOptionPane.showMessageDialog(null, "Lista de Pokémon ordenada de mayor a menor:\n" + resultado.toString());

        System.out.print("Lista de Pokémon ordenada de mayor a menor: ");
        System.out.println(resultado);
    }
}
