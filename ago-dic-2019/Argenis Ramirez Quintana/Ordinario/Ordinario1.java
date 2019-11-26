public class Ordinario2 
{
	public static void main(String args[])
    {
	
	
		int NumC = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de cartas:"));
		String[] Array = new String[NumC];
		
		for (int i = 0; i < NumC; i++)
		{
			String C = JOptionPane.showInputDialog(null,"Nombre de la Carta:" + "  " + i );
			 Array[i] = C;
			
		}
		

		for( int i = 0; i < Array.length;i++ )
        	{
                	System.out.print( Array[i] );
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
