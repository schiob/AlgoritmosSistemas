
package palindromoapp;

import javax.swing.*;
public class PalindromoApp {
        public static void main(String[] args) {

        Pila pila = new Pila(20);
        Cola cola = new Cola(20);
        Boolean ok = true;

        String palabra = JOptionPane.showInputDialog(null, "Ingrese palabra");
        
        //insertar caracteres distintos a espacios
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) != ' ') {
                pila.push(palabra.charAt(i));
                cola.insertar(palabra.charAt(i));
            }
        }
        
        //determinar si es palindromo
        while (pila.isEmpty() == false && ok == true) {
            if ((Character) pila.pop() == (Character) cola.retirar()) {
                ok = true;
            } else {
                ok = false;
            }
        }
        if (ok == true) {
            JOptionPane.showMessageDialog(null, "La palabra es un palindromo");
        } else {
            JOptionPane.showMessageDialog(null, "La palabra no es un palindromo");
        }

    }
}
