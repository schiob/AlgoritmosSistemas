
package Ejercicio9;
import java.util.*;
    public class BreadthFirstSearch extends Graph {
	public BreadthFirstSearch(int v) {
		super(v);
	}

	void BFS(int start){
		for(Vertex v: vertex){
			v.nodo=0;
			v.dis=-1;
			v.parent=null;
		}
		LinkedList<Vertex> queue = new LinkedList<>();
		vertex[start].nodo=1;
		vertex[start].dis=0;
		queue.add(vertex[start]);
		while(!queue.isEmpty()){
			Vertex u = queue.removeFirst();
			for(Vertex v : u.adj){
				if(v.nodo==0){
					v.nodo=1;
					v.dis=u.dis+1;
					v.parent=u;
					queue.add(v);
				}
			}
			u.nodo=2;
		}
        }
        
	void printPath(int start, int end){
		System.out.print("Enlace desde "+start+" a "+end+": ");
		BFS(start);
		print(start, end);
		System.out.println();
	}
	
	void print(int start, int end){
		if(end==start)
			System.out.print(start+" ");
		else if(vertex[end].parent==null)
			System.out.println("No hay enlace desde "+start+" a "+end+" existente.");
		else {
			print(start,vertex[end].parent.dato);
			System.out.print(end+" ")	;
		}
	}
	
	public static void main(String[] args){
		BreadthFirstSearch g = new BreadthFirstSearch(20);
            g.addEdge(0, 1);
            g.addEdge(0 ,2);
            g.addEdge(0, 3);
            g.addEdge(0, 7);
            g.addEdge(0, 8);
            g.addEdge(1, 15);
            g.addEdge(2, 4);
            g.addEdge(2, 5);
            g.addEdge(2, 6);
            g.addEdge(3, 7);
            g.addEdge(3, 9);
            g.addEdge(3, 10);
            g.addEdge(3, 11);
            g.addEdge(4, 13);
            g.addEdge(4, 5);
	    g.addEdge(5, 14);
	    g.addEdge(6, 9);
	    g.addEdge(9, 11);
	    g.addEdge(9, 14);
	    g.addEdge(9, 12);
		g.printPath(0, 13);
	}
}

