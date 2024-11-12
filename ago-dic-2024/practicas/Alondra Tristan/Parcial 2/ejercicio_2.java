import java.util.Scanner;

public class OrdenarNumerosCountingSort {
	class CountingSort {
		  void countSort(int array[], int size) {
		    int[] output = new int[size + 1];

		    int max = array[0];
		    for (int i = 1; i < size; i++) {
		      if (array[i] > max)
		        max = array[i];
		    }
		    int[] count = new int[max + 1];
		    
		    for (int i = 0; i < max; ++i) {
		      count[i] = 0;
		    }

	
		    for (int i = 0; i < size; i++) {
		      count[array[i]]++;
		    }

		    for (int i = 1; i <= max; i++) {
		      count[i] += count[i - 1];
		    }
		    
		    for (int i = size - 1; i >= 0; i--) {
		      output[count[array[i]] - 1] = array[i];
		      count[array[i]]--;
		    }

		    
		    for (int i = 0; i < size; i++) {
		      array[i] = output[i];
		    }
		  }

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		System.out.print("Numeros que Juan quiere ordenar: ");
		int n = scanner.nextInt(); 
        int[] CountingSort = new int[n];
        
        System.out.print("Numeros ordenados: ");
        for (int i = 0; i < n; i++) {
            CountingSort[i] = scanner.nextInt();
        }
		

	  }//end main

   }//end class counting sort
}//end class