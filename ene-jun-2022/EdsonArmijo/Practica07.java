package Practicas;
import java.util.Arrays;

public class Practica07 {
	public static void main(String[] args) {
     String[] valores = {"text2a","text2","text2a12","a","a12","text2a2","b2"};
       
     mergeSort(valores, 0, valores.length - 1);
      System.out.println("Result " + Arrays.toString(valores));
    }

    public static void mergeSort(String[] arr, int left, int right) {
     if (left == right) {
       return;
    }
        
     int mid = (left + right) / 2;
      mergeSort(arr, left, mid);
      mergeSort(arr, mid + 1, right);
      merge(arr, left, mid, right);
    }

    public static void merge(String[] arr, int left, int mid, int right) {
     int n = right - left + 1;
     String[] m = new String[n];
     int i = left;
     int j = mid + 1;
     int k = 0;

    while (i <= mid && j <= right) 
    { if (arr[i].compareTo(arr[j]) < 0) {
      m[k] = arr[i];
       i++;
         } 
     else { m[k] = arr[j];
             j++;
      }
     k++;
    }

      while (i <= mid)
      { m[k] = arr[i];
         i++;
         k++;
        }

       while (j <= right)
      { m[k] = arr[j];
          j++;
          k++;
        }

      for (k = 0; k < n; k++) {
       arr[left + k] = m[k];
      }
     }
    }

