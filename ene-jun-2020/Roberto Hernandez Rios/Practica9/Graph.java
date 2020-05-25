
package Ejercicio9;
import java.util.*;
public class Graph {
    int v;//Num de vertices
	Vertex[] vertex;
	
	public Graph(int v){
		this.v=v;
		vertex = new Vertex[v];
		for(int i = 0; i<v; i++){
			vertex[i] = new Vertex(i);
		}
	}
	
	void addEdge(int a, int b){
		vertex[a].adj.add(vertex[b]);
		if(a!=b)
			vertex[b].adj.add(vertex[a]);
	}
	
	void printList(LinkedList<Vertex> l){
		for(Vertex v: l){
			System.out.print(v.dato+" ");
		}
		System.out.println();
	}
	
	void printAdjacencyList(){
		for(Vertex v: vertex){
			System.out.print("Vertex "+v.dato+": ");
			printList(v.adj);
		}
	}
	
	public static void main(String[] args) {
		Graph g = new Graph(5);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(3, 3);
		g.addEdge(4, 2);
		g.printAdjacencyList();
	}
}
