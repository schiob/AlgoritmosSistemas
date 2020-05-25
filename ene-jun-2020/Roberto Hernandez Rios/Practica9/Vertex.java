
package Ejercicio9;

import java.util.LinkedList;

public class Vertex {
LinkedList<Vertex> adj;
	int dato;
	int nodo;
	int dis;
	Vertex parent;
	int discoveryTime;
	int finishTime;
	boolean extracted;
	
	public Vertex(int dato){
		this.dato=dato;
		nodo=0;
		dis=-1;
		parent=null;
		adj = new LinkedList<>();
		discoveryTime=0;
		finishTime=0;
	}    
}
