import java.util.*;
public class Recursividad_palindromo {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);  
		
		System.out.print("palabra: ");
		String pal=s.next().toLowerCase();
		boolean flag;
		flag=Pali(pal, 0, pal.length()-1);
		if(flag==true)
		{
			System.out.print("La palabra '"+pal+"' es palindromo");
		}
		else
		{
			System.out.print("La palabra '"+pal+"' NO es palindromo");
		}
	}//cierre_del_main

	public static boolean Pali(String pal,int i,int j)
	{
	 if(i<=j)
	 {
	   if(pal.charAt(i)==pal.charAt(j))
	   {
			  Pali(pal,i+1,j-1);
			  return true;
	   }
	 }//cierre_del_if
		return false;
	}//cierre_del_metodo_pali
}//cierre_de_clase
