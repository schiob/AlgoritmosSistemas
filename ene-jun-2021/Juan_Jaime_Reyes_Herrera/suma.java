package algoritmosChioS;

import java.util.Scanner;

public class suma {

	public static void main (String[]args ){
		Scanner op= new Scanner(System.in);
	int x,y,suma;
	
	System.out.println("Ingrese los numeros");
	x=op.nextInt();
	y = op.nextInt();
	if((x>=0)&&(x<=100)){
		if((y>=0)&&(y<=100)){
			suma=x+y;
			System.out.print(suma);
			}
		}else{System.out.print("numeros no validos");
		} 
	}
}
