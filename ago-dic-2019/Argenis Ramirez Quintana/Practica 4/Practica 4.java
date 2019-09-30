import javax.swing.JOptionPane;

public class Palindroma
{
	public static void main(String args[])
	{
		String Pal = JOptionPane.showInputDialog("Ingrese la palabra a comparar:");
		
		if(Palindroma.Palabra(Pal,0, Pal.length()- 1))
		{
			JOptionPane.showMessageDialog(null,"La palabra es:" + " " + Pal + "\n Es palindroma");
		}
		
		else
			JOptionPane.showMessageDialog(null,"La palabra es:" + " " + Pal +"\n No es palindroma");
	}
	
	
	
	//Metodo para comparar 
	public static boolean Palabra (String Pal, int i, int j)
	{
		
		if (i!= Pal.length() / 2)
		{
			if (Pal.charAt(i) == Pal.charAt(j))
			{
				return Palabra (Pal, ++i , --j);
			}
			
			else
			    return false;
		}
		return true;
		
	}

}
