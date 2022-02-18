package algoritmos.pkg2022;
import java.util.*;


import java.util.*;

public class Practica2 {
  public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Poner arreglo");
      int x = s.nextInt();
      int[] arreglo = new int[x];

      for(int a=0; a<x; a++) {
	 arreglo[a] = s.nextInt();
      }

      int temp = 0;
      int j;
      for (int i=1; i<arreglo.length; i++) {
          temp = arreglo[i];
           for (j=i-1; j>-1 && arreglo[j] < temp; j--) {
               arreglo[j+1] = arreglo[j]; 
          
           }
       
           arreglo[j+1] = temp;
      }
      Print(arreglo);
  }

  private static void Print(int[] arreglo) {
      for(int i=0;i<arreglo.length;i++) {
          if ((i+1)%10 != 0) {
              System.out.print(arreglo[i]+" ");
          } else {System.out.println(arreglo[i]+"-");}
      }
      System.out.println("");
  }
}