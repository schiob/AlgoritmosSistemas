package primerParcial;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de medicinas"));
		String medi[] = new String[n];
		int nMe[] = new int[medi.length];
		
		Scanner lee = new Scanner (System.in);
		
		for(int i = 0; i<medi.length; i++) {
			System.out.print("Digite la medicina junto cuantas tiene "+(i+1)+": ");
			medi[i] = lee.next();
			nMe[i] = lee.nextInt();
			
		}
		
		//acomodarlos de menor a mayor que le quedan de pastillas
		for(int i = 1; i<medi.length;i++) {
			int temp = nMe[i];
			String aux = medi[i];
			
			int j;
			for(j = i-1;j>=0;j--) {
				if(nMe[j]>temp) {
					nMe[j+1] = nMe[j];		
					medi[j+1] = medi[j];
					
					
				}else {
					break;
				}
			}
			
			nMe[j+1] = temp;
			medi[j+1] = aux;
			 
		}
		
		System.out.println("\nAcomodados");
		
		for(int i = 0; i<medi.length; i++) {
			System.out.print(medi[i]+"-"+ nMe[i]+"   ");
		}
		
		
		
		
		
		
		

	}

}
