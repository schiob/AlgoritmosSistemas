import java.util.*;

import javax.swing.JOptionPane;
public class practica2 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		int n=0,a=0, temp;
		n=Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de problemas a hacer"));
		a=Integer.parseInt(JOptionPane.showInputDialog(null, "Tiempo"));
		int [] derf= new int [n];
		for(int i=0; i<derf.length; i++) {
			derf[i]= Integer.parseInt(JOptionPane.showInputDialog(null,"Tiempo x problema "+(i+1)));
		}
		int i;
		for ( i=0; i<derf.length; i++) {
			temp = derf[i];
            int j = 0;
            for ( j = i-1; j > -1 && derf[j] > temp  ; j--) 
            {
                derf[j+1] = derf[j];
            }
            derf[j+1] = temp;
        }
		int contador=0, tempo=0,aux=0;
		for ( i = 0; i < derf.length; i++){ 
			aux=derf[i];
			tempo+=aux;
			if (tempo > a) {
				break;
			}
			else {
				contador+=1;
			}
	}
		System.out.println("Problemas "+n+" Tiempo "+a);
		System.out.println("Numero de Problemas "+contador);
		
  }
}
