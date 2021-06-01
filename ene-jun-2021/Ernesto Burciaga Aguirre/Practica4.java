package parcial_1;
import java.util.*;

public class Practica4 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		Scanner n1 = new Scanner(System.in);
		
		System.out.println("Numero de objetos en el inventario");
		int invT = n.nextInt();
		String nomObj[] = new String[invT];
		int canObj[] = new int[invT];
		int cont = canObj.length;
		
			for(int i = 0; i < cont; i++) {
				
				System.out.print("Nombre del objeto: ");
				nomObj[i] = n1.nextLine();
				
				System.out.print("Cantidad del objeto: ");
				canObj[i] = n.nextInt();
				
				for (int j = 0; j < cont-1; j++) 
	                if (canObj[i] > canObj[j]) 
	                { 
	                    
	                    int temp = canObj[j]; 
	                    canObj[j] = canObj[i]; 
	                    canObj[i] = temp; 
	                    
	                    String tempS = nomObj[j];
	                    nomObj[j] = nomObj[i];
	                    nomObj[i] = tempS;
	                } 
				
		}
		for(int k = 0; k<invT; k++)
			System.out.println(nomObj[k] + ": " + canObj[k]);
	}

}
