import java.util.Arrays;

import javax.swing.JOptionPane;

public class MergeSort
{
	
	public static void main(String args[])
    {
    	int NumP = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de peliculas:"));
		int[] Array = new int[NumP];
		String [] Nombres = new String [NumP];
		
		
		for (int i = 0; i < Nombres.length; i++)
		{
			String Valor = JOptionPane.showInputDialog(null,"Ingrese el nombre de la pelicula:" + " " + (i +1));
			Nombres[i] = Valor; 
			Array[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Horas que dura la pelicula:"));
		}
		
		
		
		
		System.out.println("Lista de peliculas:");
		 for (int i = 0; i < NumP; i++  )
		    {
		    	System.out.println(Nombres[i] + " " + Array[i]);
		    }
		 
        MergeSort(Array);
        System.out.println("Lista de peliculas ordenadas:");
        for (int i = 0; i < NumP; i++  )
	    {
	    	System.out.println(Nombres[i] + " " + Array[i]);
	    }
		     
            
    }
	
	
	
	
	
	
	
	 public static void MergeSort(int [] array)
     {
             if( array.length <= 1 ) return;
             int mitad = array.length/2;
             int izq[] = Arrays.copyOfRange(array, 0, mitad);
             int der[] = Arrays.copyOfRange(array, mitad, array.length);
             MergeSort(izq);
             MergeSort(der);       
             combinarArreglo(array, izq, der);
     }
     





	public static void combinarArreglo(int[] array, int[] izq,int[] der)
     {
             int i = 0;
             int j = 0;
             for( int k = 0;k < array.length; k++ )
             {
                     if( i >= izq.length )
                     {
                             array[k] = der[j];
                             j++;
                             continue;
                     }
                     
                     if( j >= der.length )
                     {
                             array[k] = izq[i];
                             i++;
                             continue;
                     }
                     
                     if( izq[i] < der[j] )
                     {
                             array[k ]= izq[i];
                             i++;
                     }
                     else
                     {
                             array[k]=der[j];
                             j++;
                     }
             }
     }
     
     

}
