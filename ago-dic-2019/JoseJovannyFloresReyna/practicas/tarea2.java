package practicas;

import javax.swing.JOptionPane;
                                //Jose Jovanny Flores Reyna
public class tarea2 { 
	public static void main (String[]args){
		int materias[];
		int n, tiempo, cont=0;
				
		n=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cantidad de problemas a resolver?"));
		materias = new int [n];
		
		tiempo=Integer.parseInt(JOptionPane.showInputDialog(null,"¿minutos para resolver los problemas?"));
		
		for (int tp = 0; tp<materias.length; tp++){
			materias[tp]=Integer.parseInt(JOptionPane.showInputDialog(null,"Tiempo en resolver el problema: ["+tp+"]"));
		}
		//ordenando de menor a mayor
		for (int i = 0; i < materias.length; i++) {
	        for (int tp=0; tp< materias.length-1-i; tp++) {
	            if(materias[tp+1] < materias[tp]){
	                int aux = materias[tp+1];
	                materias[tp+1] = materias[tp];
	                materias[tp] = aux;
	            }
	        }
	    }
		//comprobando que esten ordenados
		System.out.print("minutos para cada problema: ");
		 for (int tp=0; tp<materias.length; tp++){
			System.out.print("["+ materias[tp]+"] ");}
		 
		 System.out.println("\nTiempo disponible: "+tiempo+" minutos");
		 
		for (int tp=0; tp<materias.length; tp++)
			if(materias[tp]<=tiempo){
				tiempo-=materias[tp];
		cont++;}

			
		System.out.println("Problemas que puede resolver: "+ cont+" problemas");	
			
		
		
		
		
	}

}
