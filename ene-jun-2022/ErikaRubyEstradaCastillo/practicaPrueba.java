import javax.swing.JOptionPane;
public class practicaPrueba {

public static void main (String args []) {
	int n=Integer.parseInt(JOptionPane.showInputDialog(null, "El valor 1"));
	int m=Integer.parseInt(JOptionPane.showInputDialog(null, "El valor 2"));
	int X=n+m;
	JOptionPane.showMessageDialog(null, "La suma es " + X);
}

}
