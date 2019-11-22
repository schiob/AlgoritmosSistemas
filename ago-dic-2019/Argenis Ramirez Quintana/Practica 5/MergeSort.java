import java.util.Arrays;
import javax.swing.JOptionPane;
public class MergeSort 
{

        public static void main(String args[])
        {
        	int NumL = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de libros:"));
        	int i;
        	
    		String [] Array2 = new String [NumL];
    		int[] Array = new int[NumL];
    		
    		for ( i = 0; i < Array2.length; i++)
    		{
    			 
    			 String Cantidad;
    			 Cantidad = JOptionPane.showInputDialog(null,"Ingresa el nombre del libro:" );
    			 Array2[i] = Cantidad;
    			 Array[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de paginas:"));
    		}
    		
                System.out.println("Lista de libros:");
                imprimirArreglo(Array2);
   			    System.out.println("\n Libros ordenados por cantidad de paginas:");
   			    MergeSort(Array); 
   			    for ( i = 0; i < NumL; i++  )
   			    {
   			    	System.out.println(Array2[i] + "    " + Array[i]);
   			    }
   			    
                
        }
        
        public static void MergeSort(int[] array)
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
        
        public static void imprimirArreglo(String[] array2)
        {
                for( int i = 0; i < array2.length;i++ )
                {
                        System.out.print( array2[i] + " " );
                }
        }
        
        public static void imprimirArr(int[] array2)
        {
                for( int i = 0; i < array2.length;i++ )
                {
                        System.out.print( array2[i] + " " );
                }
        }
        
}

