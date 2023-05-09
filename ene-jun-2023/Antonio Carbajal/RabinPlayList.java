package Pruebas;
import java.util.*;
public class RabinPlayList {
	
	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Indique el numero de canciones");
	        int n = sc.nextInt();
	        System.out.println("Cuantas consultas quieres?");
	        int q = sc.nextInt();
	        String[] playlist = new String[n];
	        for (int i = 0; i < n; i++) {
	            playlist[i] = sc.next();
	        }
	        System.out.println("Canciones ordenadas");
	        quicksort(playlist, 0, n-1); 
	        for (int i = 0; i < n; i++) {
	            System.out.println(playlist[i] + " ");
	        }
	      
	        System.out.println("Ingresa el titulo de la cancion que quieres consultar.");
	       

	        for (int i = 0; i < q; i++) {
	            String query = sc.next();
	            int index = binarySearch(playlist, query); 
	            System.out.println(index);
	        }
	    }
	    
	    public static void quicksort(String[] arr, int left, int right) {
	        if (left < right) {
	            int pivotIndex = partition(arr, left, right);
	            quicksort(arr, left, pivotIndex-1);
	            quicksort(arr, pivotIndex+1, right);
	        }
	    }
	    
	    public static int partition(String[] arr, int left, int right) {
	        String pivot = arr[right];
	        int i = left - 1;
	        for (int j = left; j < right; j++) {
	            if (arr[j].compareTo(pivot) <= 0) {
	                i++;
	                swap(arr, i, j);
	            }
	        }
	        swap(arr, i+1, right);
	        return i+1;
	    }
	    
	    public static void swap(String[] arr, int i, int j) {
	        String temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	    
	    public static int binarySearch(String[] arr, String key) {
	        int left = 0;
	        int right = arr.length - 1;
	        while (left <= right) {
	            int mid = (left + right) / 2;
	            int cmp = arr[mid].compareTo(key);
	            if (cmp == 0) {
	                return mid;
	            } else if (cmp < 0) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return -1;
	    }
	}

