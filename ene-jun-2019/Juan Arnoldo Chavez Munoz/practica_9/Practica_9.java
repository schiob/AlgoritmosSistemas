/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosorden;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Arnold
 */
public class Practica_9 {
    
    static final int MAX = 10000;  //maximo numero de vértices
    static final int INF = 1 << 30;  //definimos un valor grande que represente la distancia infinita inicial, basta conque sea superior al maximo valor del peso en alguna de las aristas
   //<<: recorre el numero hacia el lugar que apunta el numero de veces que tiene (mueve el 1, 30 lugares a la izquierda)
    //despues el numero que queda es la representacion en bits ejem: 1<<3= 1000 en bits = 8 decimal
    static Scanner sc = new Scanner(System.in);      
    static List< List< Node>> ady = new ArrayList< List< Node>>(); //lista de adyacencia
    static int distancia[] = new int[MAX];         //distancia[ u ] distancia de vértice inicial a vértice con ID = u
    static boolean visitado[] = new boolean[MAX];   //para vértices visitados
    static PriorityQueue< Node> Q = new PriorityQueue<Node>(); //priority queue propia de Java, usamos el comparador definido para que el de menor valor este en el tope
    static int nodos;                                      //numero de vertices
    static int previo[] = new int[MAX];            //para la impresion de caminos


//clase para comparar los nodos
    static class Node implements Comparable<Node> {

        int first, second;

        Node(int d, int p) {                          //constructor
            this.first = d;
            this.second = p;
        }

        public int compareTo(Node other) {  //es necesario definir un comparador para el correcto funcionamiento del PriorityQueue
            if (second > other.second) {
                return 1;
            }
            if (second == other.second) {
                return 0;
            }
            return -1;
        }
    };
    
    //función de inicialización
    static void init() {
        for (int i = 0; i <= nodos; ++i) {
            distancia[i] = INF;  //inicializamos todas las distancias con valor infinito
            visitado[i] = false; //inicializamos todos los vértices como no visitados
            previo[i] = -1;      //inicializamos el previo del vertice i con -1
        }
    }

    //Paso de relajación (donde se actualizan la distancia o peso)
    static void relajacion(int actual, int adyacente, int peso) {
        //Si la distancia del origen al vertice actual + peso de su arista es menor a la distancia del origen al vertice adyacente
        if (distancia[actual] + peso < distancia[adyacente]) {
            distancia[adyacente] = distancia[actual] + peso;  //relajamos el vertice actualizando la distancia
            previo[adyacente] = actual;                         //a su vez actualizamos el vertice previo
            Q.add(new Node(adyacente, distancia[adyacente])); //agregamos adyacente a la cola de prioridad
        }
    }

    //Impresion del camino mas corto desde el vertice inicial y final ingresados
    static void print(int destino) {
        if (previo[destino] != -1) //si aun poseo un vertice previo
        {
            print(previo[destino]);  //recursivamente sigo explorando
        }
        System.out.printf("%d ", destino); //terminada la recursion imprimo los vertices recorridos
    }

    static void dijkstra(int inicial, int lugfin) {
        init(); //inicializamos nuestros arreglos
        Q.add(new Node(inicial, 0)); //Insertamos el vértice inicial en la Cola de Prioridad
        distancia[inicial] = 0;      //Este paso es importante, inicializamos la distancia del inicial como 0
        int actual, adyacente, peso;
        while (!Q.isEmpty()) {                   //Mientras cola no este vacia
            actual = Q.element().first;            //Obtengo de la cola el nodo con menor peso, en un comienzo será el inicial
            Q.remove();                           //Sacamos el elemento de la cola
            if (visitado[actual]) {
                continue; //Si el vértice actual ya fue visitado entonces sigo sacando elementos de la cola
            }
            visitado[actual] = true;         //Marco como visitado el vértice actual

            for (int i = 0; i < ady.get(actual).size(); ++i) { //reviso sus adyacentes del vertice actual
                adyacente = ady.get(actual).get(i).first;   //id del vertice adyacente
                peso = ady.get(actual).get(i).second;        //peso de la arista que une actual con adyacente ( actual , adyacente )
                if (!visitado[adyacente]) {        //si el vertice adyacente no fue visitado
                    relajacion(actual, adyacente, peso); //realizamos el paso de relajacion
                }
            }
        }

        System.out.printf("Distancias mas cortas iniciando en vertice %d\n", inicial);
        for (int i = 1; i <= nodos; ++i) {
            System.out.printf("Vertice %d , distancia mas corta = %d\n", i, distancia[i]);
        }

        System.out.println("\n**************Impresion de camino mas corto**************");
        System.out.printf("Al destino: " + lugfin);
        System.out.println("");
        int destino = lugfin;
        //destino = sc.nextInt();
        print(destino);
        System.out.printf("\n");
    }

    public static void main(String[] args) {
        int aristas, origen, destino, peso, inicial, lugfin;
        
        System.out.println("Ingrese el num de nodos, caminos, camino inicial y nodo al que quiere ir");
        String nod = sc.nextLine();
        String[] valores = nod.split(" ");
        nodos = Integer.parseInt(valores[0]);//convertimos de String a int y guardamos en variables
        aristas = Integer.parseInt(valores[1]);
        inicial = Integer.parseInt(valores[2]);
        lugfin = Integer.parseInt(valores[3]);

        System.out.println("Ingrese el origen, destino y peso");
        for (int i = 0; i <= nodos; ++i) {
            ady.add(new ArrayList<Node>()); //inicializamos lista de adyacencia p/c nodo
        }
        for (int i = 0; i < aristas; i++) {
            String adyac = sc.nextLine();
            String[] posaris = adyac.split(" ");
            origen = Integer.parseInt(posaris[0]);
            destino = Integer.parseInt(posaris[1]);
            peso = Integer.parseInt(posaris[2]);
            ady.get(origen).add(new Node(destino, peso)); //grafo diridigo: se agrega de un origen a un destino (y se borra la de abajo)
            ady.get(destino).add(new Node(origen, peso)); //no dirigido: de un destino a un origen (se agrega de a->b && de b->a)
        }
        dijkstra(inicial, lugfin);
    }
}
