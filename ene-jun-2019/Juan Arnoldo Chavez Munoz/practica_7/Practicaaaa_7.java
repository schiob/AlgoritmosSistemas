package algoritmosorden;

import java.util.*;

/**
 *
 * @author Arnold
 */
public class Practicaaaa_7 {
 static final int MAX = 500;
    static int ady[][] = new int[MAX][MAX];   //matriz de adyacencia
    static Scanner sc = new Scanner(System.in);
    static int nodos, prev[] = new int[MAX];

    public static void bfs(int islfin) {

        int ini, fin, pasos = 0, max = 0, actual;
        fin = islfin;
        boolean visitado[] = new boolean[MAX];
        Arrays.fill(visitado, false); //llena todos los valores del array en falso
        System.out.println("Nodo raiz: ");
        ini = sc.nextInt();
        prev[ini] = -1;
        visitado[ini] = true;
        Queue<Integer> Q = new LinkedList<Integer>();
        Q.add(ini);
        while (!Q.isEmpty()) {
            max = Math.max(max, Q.size());//ver memoria usada en cola
            actual = Q.remove();
            pasos++;//numero de vertices que estoy visitando
            if (actual == fin) {
                break; //si se llego al destino
            }
            for (int i = 1; i <= nodos; i++) { //vemos adyacentes a nodo actual
                int v = ady[actual][i];//guarda el valor que hay en la matriz posic. [actual] [i]
                if (v != 0 && !visitado[i]) { //no visitado agregamos a cola
                    //  System.out.println(actual + " -> " + i); //vemos recorrido de todo BFS
                    prev[i] = actual; //para ver recorrido mas corto de nodo inicio a fin
                    visitado[i] = true;
                    Q.add(i);
                }
            }
        }
        System.out.println("Memoria maxima: " + max);
        System.out.println("Numero Pasos: " + pasos);
        PrintRecorrido(ini, fin);
    }

    //Imprimimos recorrido para llegar de nodo ini a fin
    static void PrintRecorrido(int ini, int fin) {

        //System.out.println("Recorrido de nodos para llegar de nodo " + ini + " a " + fin);
        List<Integer> path = new ArrayList<Integer>();

        for (;;) { //infinite loop
            path.add(fin);
            if (prev[fin] == -1) {
                break;
            }
            fin = prev[fin];
        }

        for (int i = path.size() - 1, k = 0; i >= 0; --i) {
            if (k != 0) {
                System.out.print(" ");
            }
            System.out.print(path.get(i));
            k = 1;
        }
        System.out.println();
    }

    public static void main(String args[]) {

        System.out.println("Ingrese el num de islas, caminos, e isla a la que quiere ir");
        String nod = sc.nextLine();
        String[] valores = nod.split(" ");
        nodos = Integer.parseInt(valores[0]);//convertimos de String a int y guardamos en variables
        int aristas = Integer.parseInt(valores[1]);
        int islfin = Integer.parseInt(valores[2]);
        System.out.println("Ingrese los adyacentes a cada isla");

        for (int i = 0; i < aristas; i++) {
            String adyac = sc.nextLine();
            String[] posaris = adyac.split(" ");
            int a = Integer.parseInt(posaris[0]);
            int b = Integer.parseInt(posaris[1]);
            ady[a][b] = 1;
        }
        bfs(islfin);
    }
}
