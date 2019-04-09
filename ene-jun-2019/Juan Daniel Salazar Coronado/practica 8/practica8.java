/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author salaz
 */
public class practica8 
{
    public static void bfsycamino(ArrayList<ArrayList<Integer>> arr,int[] arr2, ArrayList<Integer> camino, int[] arr3, Queue <Integer> cola, int Nodoactual, int temp, boolean [] visitados)
    {
        // BFS ------------------------------------------------------------------------------------------------------------------------------------------
        while(cola.isEmpty() == false)
        {
            Nodoactual = cola.remove();
            
            Integer [] temp6 = new Integer[arr.get(Nodoactual).size()];
            temp6 = arr.get(Nodoactual).toArray(temp6);
            
            for (int i = 0; i < temp6.length; i++)
            {
                temp =  temp6[i];
                
                if (visitados[temp] == false)
                {
                    cola.add(temp);
                    visitados[temp] = true;
                    arr2[temp] = Nodoactual;//añadido para ver de que nodo se llega a
                }      
            }   
        }
        //------------------------------------------------------------------------------------------------------------------------------------------------
        
        //Camino------------------------------------------------------------------------------------------------------------------------------------------
        int ayuda = arr3[3];
        
        for (int i = 0; i < arr2.length; i++) 
        {
            if(ayuda == arr3[2])
            {
                camino.add(ayuda);
                break;
            }
            
            camino.add(ayuda);
            ayuda = arr2[ayuda];
        }
        //-----------------------------------------------------------------------------------------------------------------------------------------------
 
    }
        
    public static void main(String[] args) 
    {
        
        Scanner s = new Scanner(System.in);
        
        //Aquí agarra el número de islas, puentes, la isla de la que sale y la isla objetivo
        //--------------------------------------------------------------------------------------------------------------------------------------------
        String temp = s.nextLine();
        
        String temp2[] = temp.split(" ");
        
        int [] islaspuentesobjetivo = new int[temp2.length];
        
        for (int i = 0; i < islaspuentesobjetivo.length; i++) 
        {
            islaspuentesobjetivo[i] = Integer.parseInt(temp2[i]);
        }
        //--------------------------------------------------------------------------------------------------------------------------------------------
        
        //Llenado y creación del grafo y los pesos
        //---------------------------------------------------------------------------------------------------------------------------------------------
	ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        int[][] pesos = new int[islaspuentesobjetivo[1]][islaspuentesobjetivo[1]]; 
		
	for(int i=0; i < islaspuentesobjetivo[1] ; i++) 
        {
            String temp3 = s.nextLine();
        
            String temp4[] = temp3.split(" ");
        
            int [] puentes = new int[temp4.length];
        
            for (int j = 0; j < puentes.length; j++) 
            {
                puentes[j] = Integer.parseInt(temp4[j]);
            }
            
            while(arr.size() <= puentes[0] || arr.size() <= puentes[1]) 
            {
                arr.add(new ArrayList<Integer>());
            }
            
            arr.get(puentes[0]).add(puentes[1]);
            pesos[puentes[0]][puentes[1]] = puentes[2];//aquí se añade esta linea para darle valor a los pesos 
            arr.get(puentes[1]).add(puentes[0]);
            pesos[puentes[1]][puentes[0]] = puentes[2];//aquí lo mismo que la pasada xd
	}
        //-----------------------------------------------------------------------------------------------------------------------------------------------
        
        //Se crea lo que se necesita para trabajar con el bfs
        int [] islasporlaquellega = new int[islaspuentesobjetivo[0]];
        ArrayList<Integer> islasporlasquepasa = new ArrayList<>();
        boolean [] visitados = new boolean[islaspuentesobjetivo[0]];
        Queue <Integer> cola = new LinkedList<>();
        int temp5 = 0;
        
        int Nodoactual = islaspuentesobjetivo[2];
        visitados[Nodoactual] = true;
        
        cola.add(Nodoactual);
        
        bfsycamino(arr, islasporlaquellega, islasporlasquepasa, islaspuentesobjetivo, cola, Nodoactual, temp5, visitados);
        
        int temp7;
        int temp8 = 0;
        
        for (int i = 0; i < islasporlasquepasa.size() - 1; i++)//se van sumando los pesos de cada uno de los aristas 
        {
            temp8 += pesos[islasporlasquepasa.get(i)][islasporlasquepasa.get(i+1)];
        }
        
        for (int i = islasporlasquepasa.size() - 1; i > -1; i--)//se imprime al revés por que a la hora de guardar el camino se guardo al revés 
        {
            temp7 = islasporlasquepasa.get(i);
            System.out.print(temp7 + " ");
        }
        
        System.out.print("Total:" +temp8 + " ");//se imprime el peso completo del recorrido
    }
}
