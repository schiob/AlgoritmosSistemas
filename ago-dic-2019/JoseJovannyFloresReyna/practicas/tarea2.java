package practicas;

import javax.swing.JOptionPane;
                                //Jose Jovanny Flores Reyna
public class tarea2 { 
	public static void main (String[]args){
		int problemas[];
		int n, tiempo, cont=0;
				
		n=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cantidad de problemas a resolver?"));
		problemas = new int [n];
		
		tiempo=Integer.parseInt(JOptionPane.showInputDialog(null,"¿minutos para resolver los problemas?"));
		
		for (int tp = 0; tp<problemas.length; tp++){
			problemas[tp]=Integer.parseInt(JOptionPane.showInputDialog(null,"Tiempo en resolver el problema: ["+tp+"]"));
		}
		//ordenando de menor a mayor
		for (int i = 0; i < problemas.length; i++) {
	        for (int tp=0; tp< problemas.length-1-i; tp++) {
	            if(problemas[tp+1] < problemas[tp]){
	                int aux = problemas[tp+1];
	                problemas[tp+1] = problemas[tp];
	                problemas[tp] = aux;
	            }
	        }
	    }
		//comprobando que esten ordenados
		System.out.print("minutos para cada problema: ");
		 for (int tp=0; tp<problemas.length; tp++){
			System.out.print("["+problemas[tp]+"] ");}
		 
		 System.out.println("\nTiempo disponible: "+tiempo+" minutos");
		 
		for (int tp=0; tp<problemas.length; tp++)
			if(problemas[tp]<=tiempo){
				tiempo-=problemas[tp];
		cont++;}

			
		System.out.println("Problemas que puede resolver: "+cont+" problemas");	
			
		
		
		
		
	}

}
