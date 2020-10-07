public class Palindromo 
{	boolean Palindromo(String palabra) 
	{	if(palabra.length() <= 1)
		{
		    return true;
		  }
		  else
		  {
			  if(palabra.charAt(0) == palabra.charAt(palabra.length()-1))
			  {
				  return Palindromo(palabra.substring(1,palabra.length()-1));
			  }
			  else
		      {
		          return false;
		      }
		  } 
	}
}