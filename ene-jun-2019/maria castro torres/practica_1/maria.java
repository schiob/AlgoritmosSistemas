package practicas;

import javax.swing.JOptionPane;

public class Practica1 {
	public static void main(String[]args) {
		
             Scanner sc=new Scanner (System.in);
		//definir variables
		int v1=0, v2=0;
		
		System.out.print("Introduzca el primer numero entero: " +"\n");
		v1= sc.nextInt();
		
		System.out.print("Introduzca el segundo numero entero: " + "\n");
		v2 = sc.nextInt();
		
		System.out.print("La suma de los numeros de entrada es: " + (v1+v2));
		
	}
}