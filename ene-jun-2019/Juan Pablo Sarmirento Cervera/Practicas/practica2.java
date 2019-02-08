import java.util.*;
public class Practica2
{
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Indique tamaño del arr y los elementos");
      int x = s.nextInt();
      int[] arr = new int[x];

      for(int a=0; a<x; a++) {
	 arr[a] = s.nextInt();
      }

      int temp = 0;
      int j;
      for (int i=1; i<arr.length; i++) {
          temp = arr[i];
           for (j=i-1; j>-1 && arr[j] < temp; j--) {
               arr[j+1] = arr[j]; 
           }
          arr[j+1] = temp;
      }
      Print(arr);
  }

  private static void Print(int[] arr) {
      for(int i=0;i<arr.length;i++) {
          if ((i+1)%10 != 0) {
              System.out.print(arr[i]+" ");
          } else {System.out.println(arr[i]+"-");}
      }
      System.out.println("");
  }
}