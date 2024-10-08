import java.util.Scanner;

public class ejercicio_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Num medicinas: ");
		int n = s.nextInt();
        String[] medicinas = new String[n];
        
        System.out.print("Medicinas: ");
        for (int i = 0; i < n; i++) {
            medicinas[i] = s.toString();
        }
        
        //Insertion sort 
        for (int i = 1; i < medicinas.length; i++) {
            String elem_actual = medicinas[i]; 
            int j = i - 1;
            while (j >= 0 && medicinas[j] > elem_actual) {
                medicinas[j + 1] = medicinas[j];  
                j--;
            }
            medicinas[j + 1] = elem_actual;      
        }
        
        
		

	}

}