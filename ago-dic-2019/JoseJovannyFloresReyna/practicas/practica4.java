package practicas;

import java.util.Scanner;

import javax.swing.JOptionPane;
public class palindromo {
	public boolean palindromo(String cadena){
		boolean resultado=true;
		int p;
		String cadena2="";
		//Eliminamos los espacios vacios asi poder usar palabras o frases
		for (int i=0; i < cadena.length(); i++) {
		if (cadena.charAt(i)!=' ')
		cadena2 += cadena.charAt(i);
		}
		//volvemos a asignar variables
		cadena=cadena2;
		p=cadena.length();
		//comparamos
		for (int i= 0 ;i < (cadena.length()); i++){
		if (cadena.substring(i, i+1).equals(cadena.substring(p-1, p)) == false ) {
		
		resultado=false;
		break;
		}
		--p;
		}
		return resultado;
		}
	
	public static void main(String[] args) {

		Scanner entrada= new Scanner(System.in);
		String texto;
		palindromo pal=new palindromo();
		System.out.println("Ingresa la palabra o frase:");
		texto = entrada.nextLine();
		if(pal.palindromo(texto)){
		System.out.println("si es un Palindromo");
		}
		else
		{
		System.out.println("No es palindromo");
		}
	}
	
		
}