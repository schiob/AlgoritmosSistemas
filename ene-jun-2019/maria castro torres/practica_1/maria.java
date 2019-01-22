package practicas;

import javax.swing.JOptionPane;

public class Practica1 {
	public static void main(String[]args) {
		
		//definir variables
		
	int v1=0, v2=0, suma=0;
	
	
	v1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero"));
	v2=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero"));
	
	suma=v1+v2;
	{
		System.out.println("Los numeros de entrada son:" +"\n"+ v1 + "\n" + v2 + "\n" +"La suma de los numeros de entrada es:" + suma);
	}
	}

}
