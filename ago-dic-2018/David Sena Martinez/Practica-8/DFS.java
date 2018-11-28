
package algoritmos;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;
 
public class DFS
{
    private Stack<Integer> stack;
 
    public DFS() 
    {
        stack = new Stack<Integer>();
    }
 
    public void dfs(int matriz_adyaciencia[][], int nodo_fuente)
    {
        int numero_de_nodos = matriz_adyaciencia[nodo_fuente].length - 1;
 
        int visitado[] = new int[numero_de_nodos + 1];		
        int elemento = nodo_fuente;		
        int i = nodo_fuente;		
        System.out.print(elemento + "\t");		
        visitado[nodo_fuente] = 1;		
        stack.push(nodo_fuente);
 
        while (!stack.isEmpty())
        {
            elemento = stack.peek();
            i = elemento;	
	    while (i <= numero_de_nodos)
	    {
     	        if (matriz_adyaciencia[elemento][i] == 1 && visitado[i] == 0)
	        {
                    stack.push(i);
                    visitado[i] = 1;
                    elemento = i;
                    i = 1;
                    System.out.print(elemento + "\t");
	            continue;
                }
                i++;
	    }
            stack.pop();	
        }	
    }
 
    public static void main(String [] args)
    {
        int numero_de_nodos, nodo_fuente;
        Scanner sc = null;
 	try
        {
	    System.out.println("Numero de Nodos en el Grafo");
            sc = new Scanner(System.in);
            numero_de_nodos = sc.nextInt();
 
	    int matriz_adyaciencia[][] = new int[numero_de_nodos + 1][numero_de_nodos + 1];
	    System.out.println("Matriz de Adyaciencia:");
	    for (int i = 1; i <= numero_de_nodos; i++)
	        for (int j = 1; j <= numero_de_nodos; j++)
                    matriz_adyaciencia[i][j] = sc.nextInt();
 
	    System.out.println("Numero del Nodo Fuente");
            nodo_fuente = sc.nextInt(); 
 
            System.out.println("El Recorrido del DFS para la gráfica está dado por ");
            DFS dfs = new DFS();
            dfs.dfs(matriz_adyaciencia, nodo_fuente);					
        }catch(InputMismatchException inputMismatch)
        {
            System.out.println("Tenemos Problemas Bob");
        }	
        sc.close();	
    }	
}


