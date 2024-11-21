package Algoritmos_Ordenamiento_Busqueda;

import java.util.*;

public class Practica_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Número de personas (nodos)
        int E = sc.nextInt(); // Número de conexiones entre personas (aristas)
        int Z = sc.nextInt(); // Identificador de Juan

        // Crear el grafo usando listas de adyacencia
        List<List<Integer>> grafo = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            grafo.add(new ArrayList<>());
        }

        // Leer las conexiones entre personas y construir el grafo
        for (int i = 0; i < E; i++) {
            int nodo1 = sc.nextInt();
            int nodo2 = sc.nextInt();
            grafo.get(nodo1).add(nodo2);
            grafo.get(nodo2).add(nodo1); // El grafo es no dirigido
        }

        // Encontrar el camino más corto usando BFS
        List<Integer> camino = encontrarCaminoMasCorto(grafo, Z);

        // Imprimir el camino más corto
        System.out.println("------salida-----");
        for (int i = 0; i < camino.size(); i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(camino.get(i));
        }
        System.out.println();
    }

    private static List<Integer> encontrarCaminoMasCorto(List<List<Integer>> grafo, int destino) {
        int N = grafo.size(); // Número de nodos en el grafo
        boolean[] visitado = new boolean[N]; // Para marcar los nodos visitados
        int[] distancia = new int[N]; // Para almacenar las distancias desde el nodo inicial
        int[] padre = new int[N]; // Para almacenar los nodos antecesores en el camino

        Queue<Integer> cola = new LinkedList<>();
        cola.add(0); // María es el nodo inicial

        visitado[0] = true;
        distancia[0] = 0;
        padre[0] = -1;

        while (!cola.isEmpty()) {
            int nodoActual = cola.poll();

            // Si hemos llegado al nodo destino, construir el camino y terminar
            if (nodoActual == destino) {
                List<Integer> camino = new ArrayList<>();
                int nodo = destino;
                while (nodo != -1) {
                    camino.add(nodo);
                    nodo = padre[nodo];
                }
                Collections.reverse(camino);
                return camino;
            }

            // Recorrer los nodos adyacentes
            for (int nodoAdyacente : grafo.get(nodoActual)) {
                if (!visitado[nodoAdyacente]) {
                    visitado[nodoAdyacente] = true;
                    distancia[nodoAdyacente] = distancia[nodoActual] + 1;
                    padre[nodoAdyacente] = nodoActual;
                    cola.add(nodoAdyacente);
                }
            }
        }

        return new ArrayList<>(); // No se encontró un camino al nodo destino
    }
}
