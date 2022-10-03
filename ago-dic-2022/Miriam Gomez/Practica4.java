/*
A Ricardo le encantan las palabras, grades, pequeñas, con vocales y consonantes. Tiene una lista don
sus palabras favoritasy quiere que le ayudes a ordenarlas por orden alfabético.

Entrada
La entrada será recibida por STDIN

Consiste en 2 lineas, la primera tiene un entero n representado el número de palabras en la lista de Ricardo.

En la segunda linea está la lista con n palabras separados por espacio.

Salida
Imprime a salida estandar STDOUT la lista ordenada de forma alfanumérica.

Ejemplos
Entrada
7
text2a text2 text2a12 a a12 text2a2 b2
Salida
a a12 b2 text2 text2a text2a2 text2a12
*/
import java.util.Scanner;
public class Practica4 {

  
   
   void merge(String array[], int p, int q, int r) {

    int n1 = q - p + 1;
    int n2 = r - q;

    String L[] = new String [n1];
    String M[] = new String [n2];
    
   
    for (int i = 0; i < n1; i++)
      L[i] = array[p + i];
    for (int j = 0; j < n2; j++)
      M[j] = array[q + 1 + j];

    int i, j, k;
    i = 0;
    j = 0;
    k = p;

 
    while (i < n1 && j < n2) {
      if (L[i].compareTo(M[j]) <= 0) {
        array[k] = L[i];
        i++;
      } else {
        array[k] = M[j];
        j++;
      }
      k++;
    }

   
    while (i < n1) {
      array[k] = L[i];
      i++;
      k++;
    }

    while (j < n2) {
      array[k] = M[j];
      j++;
      k++;
    }
  }

  
  void mergeSort(String array[], int left, int right) {
    if (left < right) {

    
      int mid = (left + right) / 2;

    
      mergeSort(array, left, mid);
      mergeSort(array, mid + 1, right);

    
      merge(array, left, mid, right);
    }
  }
  
   
   
   
   
   
   
public static void main(String[] args) {
Scanner s= new Scanner(System.in);

int nump;

    System.out.println("Ricardo por favor ingresa el numero de palabras que quieras ordenar");
    nump=Integer.parseInt(s.nextLine());
    String [] array = new String [nump];
   
     for (int i = 0; i < nump; i++) {
     System.out.println("Digite las palabras de una por una por favor:"); 
     array [i]=s.nextLine();
    }
   
    Practica4 objeto=new Practica4();
    objeto.mergeSort(array,0,array.length-1);
    for (int i = 0; i < nump; i++) {
        System.out.println(array[i]);
    }

}

}
