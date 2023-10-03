import java.util.Arrays;
import javax.swing.JOptionPane;

public class Practica3 {
    public static void main(String[] args) {
        int n;
        String input = JOptionPane.showInputDialog("Cantidad de pokemones");
        n = Integer.parseInt(input);

        Integer[] ni = new Integer[n];
        String PoderesInput = JOptionPane.showInputDialog("Poderes de los " + n + " pokemones");
        String[] Poderes = PoderesInput.split(" ");

        for (int i = 0; i < n; i++) {
            ni[i] = Integer.parseInt(Poderes[i]);
        }

        for (int j = 1; j < ni.length; j++) {
            int temporal = ni[j];
            int A;
            for (A = j - 1; A >= 0 && ni[A] < temporal; A--) {
                ni[A + 1] = ni[A];
            }
            ni[A + 1] = temporal;
        }

        JOptionPane.showMessageDialog(null, "Poderes de los pokemones\n" + Arrays.toString(ni));
    }
}