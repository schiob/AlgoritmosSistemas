
package algoritmosorden;
import java.util.*;

public class Practica_8 {
    /**
 *
 * @author Arnold
 */
    static final int MAX = 500;
    static int ady[][] = new int[MAX][MAX];   //matriz de adyacencia
    static int pesos[] = new int[MAX];   //matriz con los pesos
    static Scanner sc = new Scanner(System.in);
    static int nodos, prev[] = new int[MAX];

    public static void bfs(int islaini, int islafin) {

        int ini, fin, actual;
        ini=islaini;
        fin = islafin;
        boolean visitado[] = new boolean[MAX];
        Arrays.fill(visitado, false); //llena todos los valores del array "visitado" en falso
        System.out.println("Nodo raiz: "+ini);
        //ini = sc.nextInt();
        prev[ini] = -1; // asignamos valor diferente p/ identificar el inicio
        visitado[ini] = true;
        Queue<Integer> Q = new LinkedList<Integer>();
        Q.add(ini);
        while (!Q.isEmpty()) {
            actual = Q.remove(); //actual = el que se va sacando de la cola
            if (actual == fin) {
                break; //detiene el ciclo si se llego al destino 
            }
            for (int i = 1; i <= nodos; i++) { //vemos adyacentes a nodo actual
                int v = ady[actual][i];//guarda el valor que hay en la matriz posic. [actual] [i]
                
                if (v != 0 && !visitado[i]) { //no visitado y haya algun valor: agregamos a cola
                    //  System.out.println(actual + " -> " + i); //vemos recorrido de todo BFS
                    prev[i] = actual; //para ver recorrido mas corto de nodo inicio a fin
                    visitado[i] = true;
                    Q.add(i);
                    pesos[i]=v; //agrego los pesos a otro array, por posición del nodo
                }
            }
        }
        PrintRecorrido(ini, fin);
    }

    //Imprimimos recorrido para llegar de nodo ini a fin
    static void PrintRecorrido(int ini, int fin) {

        //System.out.println("Recorrido de nodos para llegar de nodo " + ini + " a " + fin);
        List<Integer> path = new ArrayList<Integer>();
        int total=0;
        for (;;) { //infinite loop

            path.add(fin);
            if (prev[fin] == -1) {//si se llegó al inicio
                break;
            }
            total+=pesos[fin];//va sumando los pesos 
            fin = prev[fin]; //
        }

        for (int i = path.size() - 1, k = 0; i >= 0; --i) {//se recorre de atrás para adelante printing los valores
            if (k != 0) {
                System.out.print(" ");
            }
            System.out.print(path.get(i));//muestra el valor en posicion i (ultimo)
            k = 1;
        }
        System.out.print(" Total:"+total);
        System.out.println();
    }

    public static void main(String args[]) {

        System.out.println("Ingrese el num de islas, caminos, isla inicial y isla a la que quiere ir");
        String nod = sc.nextLine();
        String[] valores = nod.split(" ");
        nodos = Integer.parseInt(valores[0]);//convertimos de String a int y guardamos en variables
        int aristas = Integer.parseInt(valores[1]);
        int islaini = Integer.parseInt(valores[2]);
        int islafin = Integer.parseInt(valores[3]);
        System.out.println("Ingrese los adyacentes a cada isla");

        for (int i = 0; i < aristas; i++) {
            String adyac = sc.nextLine();
            String[] posaris = adyac.split(" ");
            int a = Integer.parseInt(posaris[0]);
            int b = Integer.parseInt(posaris[1]);
            int time = Integer.parseInt(posaris[2]);
            ady[a][b] = time; //asigna valor a la posicion
            //pesos[a][b] =time;
        }
        bfs(islaini, islafin);
    }
}
