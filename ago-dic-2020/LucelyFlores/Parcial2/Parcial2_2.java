import java.util.*;
public class Parcial2_2 
{	public static void main(String[] args) 
	{	int n, x;
		Scanner sc= new Scanner (System.in);
		System.out.println("Número de tazos: ");
		n= sc.nextInt();
		System.out.println("Número de serie del tazo a buscar");
		x= sc.nextInt();
		int tazos[]= new int [n];
		for(int i=0; i<tazos.length; i++)
		{	System.out.println("Número de serie del tazo " + (i+1) + ":");
			tazos[i]= sc.nextInt();
		}
		System.out.println("Números de series de tazos desordenados: " + Arrays.toString(tazos)); 
		quickSort(tazos);
		System.out.println("Números de series de tazos ordenados: " + Arrays.toString(tazos));
		
		int index = recursiveBinarySearch(tazos, x); 
		if (index == -1) 
		{	System.out.println("-1"); 
		} 
		else 
		{	System.out.println(index+1); 
		}
	}

		public static void quickSort(int[] array) 
		{ recursiveQuickSort(array, 0, array.length - 1); 
		}
		
		public static void recursiveQuickSort(int[] array, int startIdx, int endIdx) 
		{	int idx = partition(array, startIdx, endIdx); 
		 	if (startIdx < idx - 1) 
		 	{	recursiveQuickSort(array, startIdx, idx - 1); 
		 	} 
		 	if (endIdx > idx) 
		 	{	recursiveQuickSort(array, idx, endIdx); 
		 	} 
		}
		public static int partition(int[] array, int left, int right) 
		{	int pivot = array[left];
			while (left <= right) 
			{  while (array[left] < pivot)
					{	left++; 
					}
				while (array[right] > pivot) 
					{  right--;
		            }
				if (left <= right) 
					{	int tmp = array[left]; 
						array[left] = array[right]; 
						array[right] = tmp; 
						left++; 
						right--; 
					} 
				} 
			return left; 
		}
		
		public static int recursiveBinarySearch(int[] input, int key) 
		{	return binarySearch(input, 0, input.length - 1, key); 
		}

		
		private static int binarySearch(int[] array, int start, int end, int target) 
		{	int middle = (start + end) / 2; 
			if (end < start) 
			{	return -1; 
			}
			if (target == array[middle]) 
			{	return middle; 
			} 
			else if (target < array[middle]) 
			{	return binarySearch(array, start, middle - 1, target); 
			} 
			else 
			{	return binarySearch(array, middle + 1, end, target); 
			} 
		}
}
