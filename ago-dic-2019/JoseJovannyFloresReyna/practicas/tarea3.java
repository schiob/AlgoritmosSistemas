package practicas;

import javax.swing.JOptionPane;
                       //Jose Jovanny Flores Reyna
public class tarea3 {
	public static void main (String []args){
		String nombre;
		int lista;
		String a[];
		
		lista=Integer.parseInt(JOptionPane.showInputDialog(null,"Tamaño de la lista"));
		a = new String [lista];
		
		for(int i=0; i<a.length; i++){
			a[i]=JOptionPane.showInputDialog(null,"Nombre de los dinosaurios");
		}
	
		//ordenando de menor a mayor
	for (int i=0; i<a.length; i++){
		for(int j=0; j<a.length-1-i; j++){
			if(a[i].length()<a[j].length()){
				String aux=a[i];
				a[i]=a[j];
				a[j]=aux;
			}
		}
			
	}
	System.out.print("Dinosaurios:");
	for (int i=0; i<a.length; i++){
		System.out.print(" "+a[i]+" ");
	}
	

		
		
		
			
	}

}
