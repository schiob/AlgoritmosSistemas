/*
 Juan tiene un montón de libros que quiere leer, y quiere leer la mayor cantidad posible en
un año así que empezará a leer sus libros empezando del más corto en adelante. El problema es 
que toda su biblioteca está desordenada, ayúdalo a ordenarla de menor a mayor tomando en cuenta
el número de páginas que tiene cada libro.

Input
La entrada será recibida por STDIN

Consiste en varias lineas, la primera tiene un entero n representado el número de libros que tiene Juan.

Después hay n líneas en la que cada una tiene un string y un entero separados
por espacio representando el nombre del libro y el número de páginas que tiene.

Output
Imprime a salida estandar STDOUT la lista con el nombre de los libros ordenados de menor a mayor.

Ejemplos
Entrada
5
HarryPotter 245
GodelEscherBach 777
Flatland 96
Mistborn 541
CleanCode 469

Salida
Flatland HarryPotter CleanCode Mistborn GodelEscherBach
Notas
Resuelve el problema haciendo una implementación de MergeSort.


*/
package algoritmosp;
import java.util.Scanner;
public class PARCIAL1_E2 {

    void merge(int Libro[], int p, int q, int r) {

    int n1 = q - p + 1;
    int n2 = r - q;

    int L[] = new int [n1];
    int M[] = new int [n2];
    
   
    for (int i = 0; i < n1; i++)
      L[i] = Libro[p + i];
    for (int j = 0; j < n2; j++)
      M[j] = Libro[q + 1 + j];

    int i, j, k;
    i = 0;
    j = 0;
    k = p;

 
    while (i < n1 && j < n2) {
      if (L[i]>M[j]) {
        Libro[k] = L[i];
        i++;
      } else {
        Libro[k] = M[j];
        j++;
      }
      k++;
    }

   
    while (i < n1) {
      Libro[k] = L[i];
      i++;
      k++;
    }

    while (j < n2) {
      Libro[k] = M[j];
      j++;
      k++;
    }
  }

  
  void mergeSort(int paginas[], int left, int right) {
    if (left < right) {

    
      int mid = (left + right) / 2;

    
      mergeSort(paginas, left, mid);
      mergeSort(paginas, mid + 1, right);

    
      merge(paginas, left, mid, right);
    }
  }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
 Scanner s = new Scanner(System.in);  

int n;
System.out.println("Digite la cantidad de libro que tiene juan");
n=Integer.parseInt(s.nextLine());

String [] nombre= new String [n];
int [] paginas=new int [n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite el nombre del libro "+(i+1));
            nombre[i]=s.nextLine();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Digite el numero de paginas que tiene cada libro"+(i+1));
                paginas[i]=s.nextInt();
        }
        
        PARCIAL1_E2 objeto=new PARCIAL1_E2();
    objeto.mergeSort(paginas,0,paginas.length-1);
    for (int i = 0; i < n; i++) {
        System.out.println(paginas[i]);
    } 
    
        System.out.println("PROFEEE COMO SEGURO YA VIO, SOLO COMPARA LAS PAGINAS :( ");
    }
    
}
