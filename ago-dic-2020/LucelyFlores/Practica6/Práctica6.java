import java.util.*;
public class Práctica6 
{	String names[];
	int length;
	
	public static void main(String[] args) {
		int n;
		System.out.println("Número de medicinas: ");
		Scanner sc= new Scanner (System.in);
		n= sc.nextInt();
	    String words[]= new String [n];
	    for(int i=0; i<words.length; i++)
		{	System.out.println("Medicina " + (i+1) + ":");
	    	words[i]= sc.next();
		}
	    StringQuickSort sorter = new StringQuickSort();
	    sorter.sort(words);
	    for (String i : words) {
	        System.out.print(i);
	        System.out.print(" ");
	    }
	    int q;
		System.out.println("\nNúmero de medicinas a buscar: ");
		q= sc.nextInt();
		for(int i=0; i<q; i++)
		{	System.out.println("Medicina " + (i+1) + " a buscar: ");
			String medicina= sc.next();
			int retVal = Arrays.binarySearch(words, medicina);
			System.out.println("Posición de " + medicina + "= " + retVal);
		}
	}
	
	void sort(String array[]) {
	    if (array == null || array.length == 0) {
	        return;
	    }
	    this.names = array;
	    this.length = array.length;
	    quickSort(0, length - 1);
	}
	
	void quickSort(int lowerIndex, int higherIndex) {
	    int i = lowerIndex;
	    int j = higherIndex;
	    String pivot = this.names[lowerIndex + (higherIndex - lowerIndex) / 2];
	
	    while (i <= j) {
	        while (this.names[i].compareToIgnoreCase(pivot) < 0) {
	            i++;
	        }
	
	        while (this.names[j].compareToIgnoreCase(pivot) > 0) {
	            j--;
	        }
	
	        if (i <= j) {
	            exchangeNames(i, j);
	            i++;
	            j--;
	        }
	    }
	    //call quickSort recursively
	    if (lowerIndex < j) {
	        quickSort(lowerIndex, j);
	    }
	    if (i < higherIndex) {
	        quickSort(i, higherIndex);
	    }
	}
	
	void exchangeNames(int i, int j) {
	    String temp = this.names[i];
	    this.names[i] = this.names[j];
	    this.names[j] = temp;
	}
}
