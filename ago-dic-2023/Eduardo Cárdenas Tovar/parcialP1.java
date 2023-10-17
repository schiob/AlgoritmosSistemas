
import java.util.Scanner;
import javax.swing.JOptionPane;

public class parcialP1 {

    public static void main(String[] args) {
        String NO = "";
        String SO = "";
        Scanner scanner = new Scanner(System.in);

        // NUMERO DE MEDICINAS
        String n = JOptionPane.showInputDialog("Inserta el numero de medicinas recetadas al profe Chio: ");
        int medicinas = Integer.parseInt(n);

        // NOMBRE DE LAS MEDICINAS
        String[] med = new String[medicinas];
        for (int i = 0; i < medicinas; i++) {
            String nombre = JOptionPane.showInputDialog("Escribe el nombre de la medicina numero " + (i + 1));
            med[i] = nombre.toUpperCase();
        }
        //LISTA NO ORDENADA
        for (String nombre : med) {
            NO += nombre + "\n";
        }
        JOptionPane.showMessageDialog(null, "LISTA DE MEDICINAS SIN ORDENAR: \n\n" + NO);

        // METODO DE INSERCION
        for (int i = 1; i < med.length; i++) {
            String vActual = med[i];
            int j = i - 1;
            while (j >= 0 && vActual.compareTo(med[j]) < 0) {
                med[j + 1] = med[j];
                j = j - 1;
            }
            med[j + 1] = vActual;
        }

        for (String nombre : med) {
            SO += nombre + "\n";
        }
        // LISTA ORDENADA
        JOptionPane.showMessageDialog(null, "LISTA DE MEDICINAS ORDENADA EN ORDEN ALFABETICO: \n\n" + SO);
    }

}
