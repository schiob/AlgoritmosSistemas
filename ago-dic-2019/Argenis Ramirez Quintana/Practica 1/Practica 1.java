public class Practica1 
{
	public static void main (String [] args )
	{
		int [] Array = new int [20];
		
		System.out.println("Los numeros son:");
		for (int i = 0 ; i<Array.length ; i++)
		{
			Array[i] = (int)(Math.random()* 20 + 1);
			System.out.print (Array [i] + " ");
			
		}
		
		System.out.print("\n" + "Los numeros pares son: " + "\n");
		for (int i = Array.length - 1; i >= 0 ; i--)
		{
			if (Array[i] %2 == 0)
			{
			    System.out.print (Array [i] + " ");
			}
	    }			
	}

}
