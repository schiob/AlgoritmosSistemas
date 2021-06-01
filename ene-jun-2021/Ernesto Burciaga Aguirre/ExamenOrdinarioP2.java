package parcial_1;

import java.util.Scanner;

//Ernesto Burciaga Aguirre 17528944

public class ExamenOrdinarioP2 {

	 static int binarySearch(String[] arr, String x){
	        int l = 0, r = arr.length - 1;
	        while (l <= r) {
	            int m = l + (r - l) / 2;
	            int res = x.compareTo(arr[m]);
	            if (res == 0)
	                return m;

	            if(res > 0)
	                l = m + 1;

	            else
	                r = m - 1;
	        }

	        return -1;
	    }
	
	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);

		System.out.print("Numero de plumones: ");
		int size = n.nextInt();
		
		System.out.print("\nPlumon que vas a buscar: ");
		String search = n.next();

		String arr[] = new String[size];

		System.out.print("\nColores de los plumones: ");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = n.next();
		}
		
		int result = binarySearch(arr, search);

			System.out.println("\n'" + search + "'" + " Se encontró en la posicion: " + (result));
		

	}

}
