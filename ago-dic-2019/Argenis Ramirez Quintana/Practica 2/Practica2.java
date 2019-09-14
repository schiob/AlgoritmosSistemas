import javax.swing.JOptionPane;
public class PracticaInsertion
{
	   public static void main (String [] args) 
		{
			//Variables para pedir datos
			int Proble, Min;

			//Variables para metodo Insert
			int Temp = 0, Cont1, Cont2 = 0;
			
			//Pedir cantidad de problemas que se realizaran
			Proble=Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de problemas que se realizaran:" ));
			
			//Arreglo donde se almacenaran la cantidad de problemas
			int [] Array = new int [Proble];
			
			//Pedir el tiempo que tendra al dia para resolverlos
			Min=Integer.parseInt(JOptionPane.showInputDialog(null, "Tiempo que se otorgara para realizarlos:" ));
			
			//Metodo para ingresar la cantidad de tiempo que requiere para la solucion de cada porblema		
			for(int i=0; i < Array.length; i++) 
				{
					Array[i]= Integer.parseInt(JOptionPane.showInputDialog(null, "Tiempo que requiere el problema:" + " " + (i + 1) ));
				}
			
			//Metodo de Insertion Sort
			for (Cont1 = 1; Cont1<Array.length; Cont1++)
				{
					Temp = Array [Cont1];
					for (Cont2 = Cont1 - 1; Cont2 >= 0 && Array[Cont2] > Temp; Cont2 --)
						{
							Array[Cont2 + 1] = Array [Cont2];
							Array[Cont2] = Temp;
						}
				}
			
			//Variables para calcular la cantidad de problemas
			int contador=0, temp=0;
			
			//Metodo para calcular cuantos problemas realizo
			int Aux = 0;
			for(int i = 0; i < Array.length; i++)
			{
				Aux= Array[i];
				temp+=Aux;
				
				if (temp > Min)
				{
					break;
				}
				
				else
				{
					contador+=1;
				}
			
			}
			
			//Motrar el arreglo ordenado
			for(int i = 0; i < Array.length; i++)
			{
			System.out.print(" " + Array[i] + " ");
			}
			
			
			System.out.println("\n" + "Numero de problemas" + " " + Proble + "\n" + "Tiempo otorgado" + " " + Min);
			
			if (Proble == 0)
			{
				System.out.println("El alumno no resolvio ningun problema!");
			}
			else
			{
				System.out.println("La cantidad de problemas que resolvio fueron: " + " " + contador);
			}
				
		}
	}