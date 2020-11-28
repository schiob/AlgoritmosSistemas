import java.util.*;
public class Ordi1 
	{	public static void main(String[] args) 
		{	int n, x;
		Scanner sc= new Scanner (System.in);
		System.out.println("Número de tareas que tiene que hacer: ");
		n= sc.nextInt();
		int prioridad[]= new int [n];
		for(int i=0; i<prioridad.length; i++)
		{	System.out.println("Prioridad de la tarea " + (i+1) + ":");
			prioridad[i]= sc.nextInt();
		}
		String tareas[]= new String [n];
		for(int i=0; i<tareas.length; i++)
		{	System.out.println("Nombre de la tarea " + (i+1) + ":");
			tareas[i]= sc.next();
		}
		System.out.println("Prioridad de las tareas desordenads: " + Arrays.toString(prioridad)); 
		quickSort(prioridad);
		System.out.println("Prioridad de las tareas ordenadas: " + Arrays.toString(prioridad));
		
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
		{  while (array[left] > pivot)
				{	left++; 
				}
			while (array[right] < pivot) 
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
