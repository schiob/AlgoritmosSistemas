import java.util.Scanner;
public class Practica6
{    
    public static void main (String []args)
    {
       Scanner esc= new Scanner(System.in);
       String n = esc.nextLine();
       String [] m = n.split(" ");
       int f = Integer.parseInt(m[0]);
       int s = Integer.parseInt(m[1]);
       String n2 = esc.nextLine();
       String [] drogas = n2.split(" ");
       int [] nl= new int [f]; 
       for (int i = 0;i<f;i++)
       {
           nl[i]= drogas[i].charAt(0);
       }
       quicksort(nl,0,nl.length-1,drogas);
       for (int i = 0;i<f;i++)
       {
           System.out.println(drogas[i]);
       }
       for (int a = 0;a < s; a++)
       {
           String n5 = esc.nextLine();
           binarySearch(drogas, n5);
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
    public static int binarySearch(String[] arr, String x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            int res = x.compareTo(arr[m]); 
  
            // Check if x is present at mid 
            if (res == 0) 
                {
                    System.out.println(m);
                    return m;
                } 
  
            // If x greater, ignore left half 
            if (res > 0) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
        System.out.println("-1");
        return -1; 
    } 
}

