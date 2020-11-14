import java.util.*;
public class Parcial2_1 
{	public static void main(String[] args) 
	{	int n;
		String busqueda;
		Scanner sc= new Scanner (System.in);
		System.out.println("Número de libros: ");
		n= sc.nextInt();
		System.out.println("Nombre de libro a buscar");
		busqueda= sc.next();
	    String libros[]= new String [n];
	    for(int i=0; i<libros.length; i++)
		{	System.out.println("Libro " + (i+1) + ":");
	    	libros[i]= sc.next();
		}
	    
	    int posicionDeElementoBuscado = existeEnArreglo(libros, busqueda);
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
