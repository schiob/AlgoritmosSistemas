import javax.swing.*;
import java.util.Arrays;

public class practica4 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la cantidad de palabras","Entrada n",JOptionPane.QUESTION_MESSAGE));
        String[] palabras = JOptionPane.showInputDialog(null,"Ingresa "+n+" palabras","Entrada palabras",JOptionPane.QUESTION_MESSAGE).split(" ");

        // Mover el límite del arreglo no ordenado
        for (int i = 0; i < n-1; i++) {
            // Encontrar el mínimo en el arreglo no ordenado
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                if (palabras[j].compareTo(palabras[minIdx]) < 0) {
                    minIdx = j;
                }
            }
            // Intercambiar el mínimo encontrado con el primer elemento
            String temp = palabras[minIdx];
            palabras[minIdx] = palabras[i];
            palabras[i] = temp;
        }
            System.out.println(Arrays.toString(palabras));
    }
}

