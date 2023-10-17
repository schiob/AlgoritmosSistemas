package parcial_1;

import javax.swing.*;
import java.util.Arrays;
/*
ORDENAMIENTO PERO DIFERENTE
ALFABETICO
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la cantidad de medicinas","n medicinas",JOptionPane.QUESTION_MESSAGE));
        String[] palabras = JOptionPane.showInputDialog(null,"Ingresa "+n+" medicinas","Entrada medicinas",JOptionPane.QUESTION_MESSAGE).split(" ");


        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (palabras[j].compareTo(palabras[min]) < 0) {
                    min = j;
                }
            }

            String temp = palabras[min];
            palabras[min] = palabras[i];
            palabras[i] = temp;
        }
           JOptionPane.showMessageDialog(null,Arrays.toString(palabras));
    }
}

