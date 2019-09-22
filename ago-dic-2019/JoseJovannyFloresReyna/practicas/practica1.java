package practicas;

import java.util.Scanner;

import javax.swing.JOptionPane;

//Jose Jovanny Flores Reyna

public class practica1 {
	public static void main (String []args){
		int a [] = new int [20];
		int b [] = new int [20];
		int i, cont=0;
		Scanner entrada = new Scanner(System.in);
		
		
		for(i=0;i<a.length;i++){
			System.out.print("Ingrese sus numeros: ");
			a[i]=entrada.nextInt();
		}
		      
		  for (i=0; i<a.length; i++){
			  for (int j=0; j<a.length-i; j++){
				  if(a[i]%2==0){
					  b[i]=a[i];
				  }
			  }		  
		  }
		
		  for(int j=b.length-1; j>=0; j--){
			  if (b[j]!=0){
			   System.out.print(b[j]+",");
			  }
		  }
		  
	    
	   
	}

}