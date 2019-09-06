package practicas;

import javax.swing.JOptionPane;

//Jose Jovanny Flores Reyna

public class practica1 {
	public static void main (String []args){
		int[]a;
		int n, i;
		
		
		n=Integer.parseInt(JOptionPane.showInputDialog(null,"cantidad de numeros"));
		a=new int[n];
		
		for(i=0;i<a.length;i++)
			a[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese los numeros["+i+"]"));
	
		      
		  for (i=0; i<a.length; i++)
		  if(a[i]%2==0)
			System.out.println("los numeros pares son: "+ a[n-i]);
		  
		  
		  
	    
	   
	}

}
