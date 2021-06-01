package parcial_1;

import java.util.Scanner;

public class Practica5 {

    public static void mergeSort(String[] a, int f, int t) {
        if (f == t) {
            return;
        }
        int mid = (f + t) / 2;
        mergeSort(a, f, mid);
        mergeSort(a, mid + 1, t);
        merge(a, f, mid, t);
    }

    public static void merge(String[] a, int f, int m, int t) {
        int n = t - f + 1;       
        String[] b = new String[n];   
        int i1 = f;               
        int i2 = m + 1;            
        int j = 0;                   

        while (i1 <= m && i2 <= t) {
            if (a[i1].compareTo(a[i2]) < 0) {
                b[j] = a[i1];
                i1++;
            } else {
                b[j] = a[i2];
                i2++;
            }
            j++;
        }

        while (i1 <= m) {
            b[j] = a[i1];
            i1++;
            j++;
        }

        while (i2 <= t) {
            b[j] = a[i2];
            i2++;
            j++;
        }

        for (j = 0; j < n; j++) {
            a[f + j] = b[j];
        }
    }
    
    public static void main(String[] args) {
    	
    	Scanner n = new Scanner(System.in);
		System.out.print("Cantidad de palabras: ");
		int size = n.nextInt();
		
		String arr[] = new String[size];
		
		for(int i = 0; i < size; i++) {
			System.out.print("\nPalabras: ");
			arr[i] = n.next();
		}
		
		mergeSort(arr,0,arr.length-1);
		
		System.out.println("Palabras Ordenadas");
		for(int k = 0; k <arr.length; k++) {
			System.out.printf("[" + arr[k] + "]");
		}
    }

}