
import javax.swing.JOptionPane;

public class algoritmosp5 {

    public static void main(String[] args) {
        String NoOrdenada = "";
        String Ordenada = "";

        String lineaDeEntrada = "Tyrannosaurus Triceratops Velociraptor Stegosaurus Brachiosaurus Allosaurus Ankylosaurus Parasaurolophus Pterodactyl Spinosaurus";
        String[] dinosaurios = lineaDeEntrada.split(" ");
        for (String dinosaurio : dinosaurios) {
            NoOrdenada += dinosaurio + "\n";
        }
        JOptionPane.showMessageDialog(null, "Lista de Dinosaurios sin ordenar: \n" + NoOrdenada);

        mergeSort(dinosaurios);

        for (String dinosaurio : dinosaurios) {
            Ordenada += dinosaurio + "\n";

        }
        JOptionPane.showMessageDialog(null, "Dinosaurios ordenados de más corto a más largo:\n" + Ordenada);
    }

    public static void mergeSort(String[] array) {
        if (array.length > 1) {
            int mitad = array.length / 2;
            String[] izquierda = new String[mitad];
            String[] derecha = new String[array.length - mitad];

            for (int i = 0; i < mitad; i++) {
                izquierda[i] = array[i];
            }

            for (int i = mitad; i < array.length; i++) {
                derecha[i - mitad] = array[i];
            }

            mergeSort(izquierda);
            mergeSort(derecha);

            combinar(array, izquierda, derecha);
        }
    }

    public static void combinar(String[] resultado, String[] izquierda, String[] derecha) {
        int i = 0, j = 0, k = 0;

        while (i < izquierda.length && j < derecha.length) {
            if (izquierda[i].length() < derecha[j].length()) {
                resultado[k++] = izquierda[i++];
            } else {
                resultado[k++] = derecha[j++];
            }
        }

        while (i < izquierda.length) {
            resultado[k++] = izquierda[i++];
        }

        while (j < derecha.length) {
            resultado[k++] = derecha[j++];
        }
    }

}
