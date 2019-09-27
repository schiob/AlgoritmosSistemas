package recursivida;
import java.util.Scanner;
public class imprimirnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		    
		    
		 Scanner s=new Scanner(System.in);
		 
		/* System.out.print("cantidad de numeros");
		 int tamaño=s.nextInt(); 
		 System.out.print("numeros   "+imprimir(tamaño));
		 System.out.print("suma   "+suma(tamaño));
		 */
		 System.out.print("agrega la palabra");
		 
		 String palabra= s.nextLine();
		 
		 System.out.print("PALABRA   "+Palindromo(palabra));
		    }
	
		
	
	public static int imprimir(int x) {
		if(x<1) {
			return x;
		}
		//	System.out.println(x);
			imprimir(x-1);
			System.out.println(x);
    return x;
  
	}
	

	public static int suma(int x) {
		if(x<1) {
			return 0;
		}
		//	System.out.println(x);
		return x+suma(x-1);
	}                    

	 public static boolean Palindromo(String s){
	    if(s.length() <= 1){
	    	System.out.print("  si es palindromo       ");
	        return true;
	    }else{
	        if(s.charAt(0) == s.charAt(s.length() - 1)){
	            return Palindromo(s.substring(1,s.length() - 1 ) );
	        }else{
	        	System.out.print("    nno es palindromo    ");
	            return false;
	        }
	    }  
	}
}
