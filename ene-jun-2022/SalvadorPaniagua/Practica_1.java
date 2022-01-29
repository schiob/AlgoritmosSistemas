package algoritmos.pkg2022;
import javax.swing.JOptionPane;


public class Practica_1 {


public static void main(String[] args) {
    int x;
    int y;
    int suma;
   
                JOptionPane.showMessageDialog(null, "Primer numero");
                x =Integer.parseInt(JOptionPane.showInputDialog(null,"Numero 1"));
                
                JOptionPane.showMessageDialog(null, "Segundo numero");
                y =Integer.parseInt(JOptionPane.showInputDialog(null,"Numero 2"));
  suma= x + y;    
  
  JOptionPane.showMessageDialog(null, "Suma:" + suma);
}    
}
