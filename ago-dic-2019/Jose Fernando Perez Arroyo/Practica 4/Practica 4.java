import java.util.*;

import javax.swing.JOptionPane;
public class ya {
	 boolean MetodoPalindromo(String s){
	     if(s.length() <= 1){
	         	 System.out.println("Es palindromo");
	             return true;
	        }else{
	             if(s.charAt(0) == s.charAt(s.length() - 1)){
	               return MetodoPalindromo(s.substring(1,s.length() - 1 ) );
	              }else{
	        	      System.out.println("NO es palindromo");
	                 return false;
	            }
	    }  
	}

	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 String n="";
		 ya me=new ya();
		 System.out.println("Digite la palabra que desea saber si es palindromo: ");
		 n=sc.nextLine();
	me.MetodoPalindromo(n);
	 
	}
}
