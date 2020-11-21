
import java.util.Scanner;
public class Practica5
{
    public static void main (String []args)
    {
       Scanner esc = new Scanner(System.in);
       int n = Integer.parseInt(esc.nextLine());
       String ne = esc.nextLine();
       String [] m = ne.split(" ");
       int [] nl= new int [n]; 
       for (int i = 0;i<n;i++)
       {
           nl[i]= m[i].charAt(0);
       }
       quicksort(nl,0,nl.length-1,m);
       boolean p = false;
       for (int  h = 0; h < 2;h++ )
       for (int i = 1; i < n;i++)
       {
           if (m[i-1].charAt(0) == m[i].charAt(0))
           {
               
               for(int j = 0; j < m[i-1].length()-1;j++)
               {
                   if (m[i-1].charAt(j) == m[i].charAt(j) && m[i].length()-1 != j)
                   {
                        
                        p = false;
                   }
                   else
                   {
                       
                       String aox= m[i-1];
                       m[i-1]=m[i];
                       m[i]=aox;
                       p = true;
                       break;
                   }
                   if (m[i-1].length() == j-1 && p == false)
                   {
                       String aox= m[i-1];
                       m[i-1]=m[i];
                       m[i]=aox;
                   }
               }

           }
       }
       for (int i = 0; i < n;i++)
       {
           System.out.println(m[i]);
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
