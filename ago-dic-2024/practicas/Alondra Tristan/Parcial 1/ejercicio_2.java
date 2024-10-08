import java.util.Scanner;

public class ejercicio_2 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		
		System.out.print("Num medicinas: ");
		int n = s.nextInt();
        String[] medicinas = new String[n];
        int[] pas = new int[n];
        
        System.out.print("Medicinas y pastillas sobrantes: ");
        for (int i = 0; i < n; i++) {
            medicinas[i] = s.toString();
            pas[i]=s.nextInt();
        }
        
        //Insertion sort 
        for (int i = 1; i < pas.length; i++) {
            int elem_actual = pas[i]; 
            int j = i - 1;
            while (j >= 0 && pas[j] < elem_actual) {
                pas[j + 1] = pas[j];  
                j--;
            }
            pas[j + 1] = elem_actual;      
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(medicinas[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }

	}//end main

}//end class