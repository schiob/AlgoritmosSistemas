import javax.swing.*;

public class practica1 {

    public static void main(String[] args) {

        String numeros = JOptionPane.showInputDialog(null,"Ingresa dos numero separdos por un espacio",JOptionPane.QUESTION_MESSAGE);

       String[] dividir = numeros.split(" ");

       int a = Integer.parseInt(dividir[0]);
       int b = Integer.parseInt(dividir[1]);

       JOptionPane.showMessageDialog(null, a + b,"Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
