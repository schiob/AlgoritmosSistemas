import javax.swing.JOptionPane;

public class Binary 
{
	
	public static void main(String args[])
    {
		
    	int NumT = Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de tazos que tiene juan:"));
    	int[] Array = new int[NumT];
		int Tazo = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de serie de tazo que busca juan:" ));
    	
		for (int i = 0; i < Array.length; i++)
		{
			int NSerie = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de serie del tazo:" ));
			 Array[i] = NSerie;
		}
    	
            
            System.out.println("Arreglo normal:");
            imprimirArr(Array);
            System.out.println("\n" + "Tazos ordenados de menor a mayor:");
            OrdenacionRapida (Array);
			imprimirArr(Array);
			
			int indice = BusquedaBinaria (Array, Tazo);
	        if (indice != -1)
	        {
	        	System.out.println ("\n" + "Elemento encontrado" + " " + Tazo);
	        }
	        else
	        {
	        	System.out.println("\n" + "-1" + Tazo);
	        } 
            
            
 }
	
	
	
	public static void OrdenacionRapida(int[] array)
	{
        final int N = array.length;
        quicksort( array, 0, N - 1);
	}
	public static void quicksort(int Array[], int izq, int der)
	{
		int i, j, pivote, Aux;
		i = izq;
		j = der;
		pivote = Array [ (izq + der) /2 ];

		do
		{
			while (Array[i] < pivote) 
			{
				i++;
			}

			while (Array[j] > pivote) 
			{
				j--;
			}

			if( i <= j)
			{
				Aux = Array[i];
				Array[i] = Array[j];
				Array[j] = Aux;
				i++;
				j--;
			}

		}
		while(i <= j);


		if( izq < j)
		{
			quicksort (Array, izq, j);
		}

		if( i < der )
		{
			quicksort (Array, i, der);
		}

	}
	
	public static int BusquedaBinaria (int [] array, int Elemento)
	{
		int Centro, Primero, Ultimo;
		int ValorCentral;
		
		Primero = 0;
		Ultimo = array.length -1 ;
		
			while ( Primero <= Ultimo)
			{
				Centro = ( Primero + Ultimo ) /2;
				ValorCentral = array[Centro];
			
			
				if ( Elemento == ValorCentral)
				{
					return Centro;
				}
				
				else if ( Elemento < ValorCentral)
				{
					Ultimo = Centro - 1;
				}
				
				else
				{
					Ultimo = Centro + 1;
				}
			}
			
			return -1;
	}
	
	
	 public static void imprimirArr(int[] array)
     {
             for( int i = 0; i < array.length;i++ )
             {
                     System.out.print( array[i] + " " );
             }
     }

}
