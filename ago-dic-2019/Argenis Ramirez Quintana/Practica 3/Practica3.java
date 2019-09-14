//Metodo de selection Sort
import javax.swing.JOptionPane;

public class Practica3
{
	public static void main (String []args)
	{
		//Variable para almacenar cuantos nombres tendra el arreglo
		int Cantidad;
		
		//Pedir la cantidad de nombres que tendra el arreglo
		Cantidad=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de nombres que contendra el arreglo:" ));
		
		//Almacenar la cantidad en nuestro arreglo
		String [] Array2 = new String [Cantidad];
		
		//Ciclo para ingresar los nombres en cada posicion
		for (int j = 0; j < Cantidad; j++)
		{
			 String Valor;
			 Valor = JOptionPane.showInputDialog(null,"Ingresa el nombre de dinosaurio para la posición " + j + " del arreglo");
			 Array2[j] = Valor;
		}
		
		//Metodo de Selection Sort
		for (int i = 0; i < Array2.length -1; i++)
	    {
	        int Aux = i;
	          
	        for (int j = i + 1; j < Array2.length; j++)
	        {
	            if (Array2[j].length() < Array2[Aux].length())
	            {
	              Aux = j;
	              String temp = Array2[Aux];
	              Array2[Aux] = Array2[i];
	              Array2[i] = temp;
	            }
	        }
	          
	    }
		 
		System.out.println("Los nombres en orden son:");
		
		//Imprimir el arreglo en una sola linea y con espacios
		for (int i = 0; i < Array2.length; i++)
		{
			System.out.print(Array2[i] + " ");
		}
		
	}

}
