package aob;
import javax.swing.JOptionPane;

public class AOB {
    public static void main(String[] args) {
        
        int cant = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos nombres vas a ingresar?"));
        
        String arreglo[] = new String[cant];       
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = JOptionPane.showInputDialog(null, "Inserte el nombre número " + (i + 1));
        }
        
        for (int i = 1; i < arreglo.length; i++) {          
            String aux = arreglo[i];
            for (int j = (i - 1); j >= 0 && arreglo[j].length() > aux.length(); j--) {
                arreglo[j + 1] = arreglo[j];
                arreglo[j] = aux;
            }
        }
        
        for (String arreglo1 : arreglo) {
            System.out.print(arreglo1 + " ");
        }
    }
}