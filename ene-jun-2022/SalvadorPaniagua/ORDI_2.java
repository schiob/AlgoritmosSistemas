/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos.pkg2022;
import java.util.*;

/**
 *
 * @author SALVADOR
 */
public class ORDI_2 {
    public static void main(String[] args) 
	{	int n;
		String busqueda;
		Scanner sc= new Scanner (System.in);
		System.out.println("Número de artículos en la lista: ");
		n= sc.nextInt();
		System.out.println("Artículo a buscar");
		busqueda= sc.next();
		String articulos[]= new String [n];
		for(int i=0; i<articulos.length; i++)
		{	System.out.println("Articulo " + (i+1) + ":");
			articulos[i]= sc.next();
		}
		
		
		int posicionDeElementoBuscado = existeEnArreglo(articulos, busqueda);
		if (posicionDeElementoBuscado == -1) 
		{	System.out.println("-1");
		} 
		else 
		{	System.out.println(posicionDeElementoBuscado+1);
		}
		}
		public static int existeEnArreglo(String[] arreglo, String busqueda) 
		{	for (int x = 0; x < arreglo.length; x++) 
		{	if (arreglo[x].equals(busqueda)) 
			{	return x;
		    }
		}
		return -1;
	}
} 


