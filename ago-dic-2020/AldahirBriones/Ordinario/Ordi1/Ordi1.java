import java.util.Scanner;
public class Ordi1
{
  public static void main(String a[])
  {
      Scanner f = new Scanner(System.in);
      int n=Integer.parseInt(f.nextLine());
      int p [] = new int[n]; 
      String t [] = new String[n];
      String t2 [] = new String[n];
      for (int i = 0; i < n; i++)
      {
          String Tareas = f.nextLine();
          String [] aux=Tareas.split(" ");
          t[i] = aux[0];
          p [i] = Integer.parseInt(aux[1]);
      }
      quicksort(p,0,p.length-1,t);
      int m = 0;
      for (int i = n-1; i > -1; i--)
      {
          t2[m]=t[i];
          m++;
      }
      /*for (int i = n-1; i > -1; i--)
      {
          System.out.println(t[i]);
      }*/
      for (int i = 0;i <n;i++)
      {
          System.out.println(t2[i]);
      }
  }
  public static void quicksort(int A[], int izq, int der, String c []) 
    {

        int pivote=A[izq];
        String pivotes = c[izq];
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        int aux;
        String aux2;
        while(i < j){                          // mientras no se crucen las búsquedas                                   
            while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
            while(A[j] > pivote) j--;           // busca elemento menor que pivote
            if (i < j) {                        // si no se han cruzado                      
                aux2= c[i];                      // los intercambia
                c[i]=c[j];
                c[j]=aux2;
                aux= A[i];                      // los intercambia
                A[i]=A[j];
                A[j]=aux;
            }
        }
        c[izq]=c[j];
        c[j]=pivotes; 
        A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
        A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha
   
        if(izq < j-1)
        quicksort(A,izq,j-1,c);          // ordenamos subarray izquierdo
        if(j+1 < der)
        quicksort(A,j+1,der,c);          // ordenamos subarray derecho
   
    }   
}
