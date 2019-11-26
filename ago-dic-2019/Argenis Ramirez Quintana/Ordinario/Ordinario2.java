import javax.swing.JOptionPane;

public class BusquedaBinaria 
{
	public static void main(String args[])
    {
	
	
		int NumA = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de articulos:"));
		int[] Array = new int[NumA];
		String [] Array2 = new String[NumA];
		
		for (int i = 0; i < Array.length; i++)
		{
			String A = JOptionPane.showInputDialog(null,"Nombre del articulo:" + "  " + i );
			 Array2[i] = A;
			 
			 int Precio = Integer.parseInt(JOptionPane.showInputDialog(null,"Precio del articulo:" + "  " + i));
			 Array[i] = Precio;
			
		}
		
		 for( int i = 0; i < Array.length;i++ )
         {
                 System.out.print("\n " + Array2[i] + "  " + Array[i] );
         }
		 
		int indice = BusquedaBinaria (Array, 9000  );
        	System.out.println ("\n" + "Elemento encontrado" + " " + indice);
       
        
		
		
    }
	
	
	
	
	public static int BusquedaBinaria (int [] array,int Elemento)
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

}
