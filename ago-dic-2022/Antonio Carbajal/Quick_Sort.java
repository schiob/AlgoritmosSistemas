package Tareas;

import Actividades__P2.Binary_Search;

public class Quick_Sort {
	 static void swap(String[] arr, int i, int j)
	    {
	        String temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	  
	    /* This function takes last element as pivot, places
	       the pivot element at its correct position in sorted
	       array, and places all smaller (smaller than pivot)
	       to left of pivot and all greater elements to right
	       of pivot */
	    static int partition(String[] arr, int low, int high)
	    {
	  
	        // pivot
	        String pivot = arr[high];
	  
	        // Index of smaller element and
	        // indicates the right position
	        // of pivot found so far
	        int i = (low - 1);
	  
	        for (int j = low; j <= high - 1; j++) {
	  
	            // If current element is smaller
	            // than the pivot
	            if (arr[j].equalsIgnoreCase(pivot)) {
	  
	                // Increment index of
	                // smaller element
	                i++;
	                swap(arr, i, j);
	            }
	        }
	        swap(arr, i + 1, high);
	        return (i + 1);
	    }
	  
	    /* The main function that implements QuickSort
	              arr[] --> Array to be sorted,
	              low --> Starting index,
	              high --> Ending index
	     */
	    static void quickSort(String[] arr, int low, int high)
	    {
	        if (low < high) {
	  
	            // pi is partitioning index, arr[p]
	            // is now at right place
	            int pi = partition(arr, low, high);
	  
	            // Separately sort elements before
	            // partition and after partition
	            quickSort(arr, low, pi - 1);
	            quickSort(arr, pi + 1, high);
	        }
	    }
	    int binarySearch(String arr[], int l, int r, String x)
	    {
	        if (r >= l) {
	            int mid = l + (r - l) / 2;
	 
	            // If the element is present at the
	            // middle itself
	            if (arr[mid].equals(x))
	                return mid;
	 
	            // If element is smaller than mid, then
	            // it can only be present in left subarray
	            if (arr[mid].equals(x))
	                return binarySearch(arr, l, mid - 1, x);
	 
	            // Else the element can only be present
	            // in right subarray
	            return binarySearch(arr, mid + 1, r, x);
	        }
	 
	        // We reach here when element is not present
	        // in array
	        return -1;
	    }
	  
	    // Function to print an array
	    static void printArray(String[] arr, int size)
	    {
	        for (int i = 0; i < size; i++)
	            System.out.print(arr[i] + " ");
	  
	        System.out.println();
	    }
	  
	    // Driver Code
	    public static void main(String[] args)
	    {
	    	Quick_Sort ob = new Quick_Sort();
	        String[] arr = { "FiestaDeLocos", "Matador", "Comprendes,Mendes?", "PadreNuestro", "YoTomo", "Frijolero", "SiSenor", "Imagina" };
	        int n = arr.length;
	  
	        quickSort(arr, 0, n - 1);
	        System.out.println("Sorted array: ");
	        printArray(arr, n);
	        String x = "SiSenor";
	        String y = "Imagina";
	        String z = "PadreNuestro";
	        String w = "Matador";
	        
	        int result = ob.binarySearch(arr, 0, n - 1, x);
	        int result2 = ob.binarySearch(arr, 1, n - 1, y);
	        int result3 = ob.binarySearch(arr, 2, n - 1, z);
	        int result4 = ob.binarySearch(arr, 3, n - 1, w);
	      
	        if (result == -1)
	            System.out.println("Element not present");
	        else
	            System.out.println("Indice: "
	                               + result);
	        if (result2 == -1)
	            System.out.println("Element not present");
	        else
	            System.out.println("Indice:  "
	                               + result2);
	        if (result3 == -1)
	            System.out.println("Element not present");
	        else
	            System.out.println("Indice:  "
	                               + result3);
	        if (result4 == -1)
	            System.out.println("Element found at index ");
	        else
	            System.out.println("Indice: "
	                               + result4);
	    }

}
