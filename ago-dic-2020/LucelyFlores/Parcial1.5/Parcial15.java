import java.util.*;
public class Parcial15 
{	 static public void DoMerge(int [] numbers, int left, int mid, int right)
    { int [] temp = new int[25];
      int i, left_end, num_elements, tmp_pos;
      left_end = (mid - 1);
      tmp_pos = left;
      num_elements = (right - left + 1);
      while ((left <= left_end) && (mid <= right))
      {   if (numbers[left] <= numbers[mid])
              temp[tmp_pos++] = numbers[left++];
          else
              temp[tmp_pos++] = numbers[mid++];
      }
      while (left <= left_end)
          temp[tmp_pos++] = numbers[left++];
      while (mid <= right)
          temp[tmp_pos++] = numbers[mid++];
      for (i = 0; i < num_elements; i++)
      {	  numbers[right] = temp[right];
          right--;
      }
	  }
	 static public void MergeSort_Recursive(int [] numbers, int left, int right)
	  { int mid;
	    if (right > left)
	    { mid = (right + left) / 2;
	
	      MergeSort_Recursive(numbers, left, mid);
	
	      MergeSort_Recursive(numbers, (mid + 1), right);
	      DoMerge(numbers, left, (mid+1), right);
	    }
	  }
	
	  public static void main(String[] args)
	 {	 int n;
	 	System.out.println("Número de libros: ");
		Scanner sc= new Scanner (System.in);
		n= sc.nextInt();
	    int len = n;
		String [] nombre= new String [n];
		int[] paginas= new int [n];
		for(int i=0; i<len; i++)
		{	System.out.println("Páginas del libro " + (i+1) + ":"); 
			paginas[i]= sc.nextInt();
		}
		for(int j=0; j<len; j++)
		{	System.out.println("Nombre del libro " + (j+1) + ":"); 
			nombre[j]= sc.nextLine();
		}
	    MergeSort_Recursive(paginas, 0, len - 1);
		for(int i=0; i<paginas.length; i++)
		{	System.out.print(paginas[i] + " ");
		}	
	 }
}
