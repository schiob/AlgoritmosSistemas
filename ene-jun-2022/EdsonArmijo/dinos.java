package Algoritmos;
import java.util.Scanner;
public class dinos {

public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	
String[] dinos= new String[5];
	bubble(dinos);
	
	for (int i=0; i<=4;i++) {
	    System.out.println("Nombre "+ i);
		dinos[i]=sc.nextLine();
	
}
}
	public static void bubble (string[] dinos) {
		for(int i = 0; i < dinos.length; i++) {
			for(int j = 0; j < dinos.length-1-i; j++) {
				if(dinos[j] > dinos[j+1]) {
					int temp = dinos[j];
					dinos[j] = dinos[j+1];
					dinos[j+1] = temp;
		   }
		  }
		 }
		}
	   }
		
			
		