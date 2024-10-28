import java.util.*;

public class SegundaPractica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lee = new Scanner(System.in);
		
		int num_problemas, minDisponibles;
		
		
		System.out.println("Escribe cuantos problemas tiene y cuantos minutos dispone");
		num_problemas = lee.nextInt();
		minDisponibles = lee.nextInt();
		
		
		int minXtarea[] = new int[num_problemas];
		
		for(int i = 0; i<minXtarea.length; i++) {
			
			System.out.print("Ingrese los minutos que le toma del problema "+(i+1)+": ");
			minXtarea[i] = lee.nextInt();
		}
		
		
		
		//acomodarlos por insertionsort
		for(int i = 0; i<minXtarea.length; i++) {
			int temp = minXtarea[i];
			
			int j = i-1;
			for(;j>=0;j--) {
				if(temp<minXtarea[j]) {
					minXtarea[j+1]=	minXtarea[j];
				}else {
					break;
				}
				
			}
			minXtarea[j+1] = temp;
			
		}
		
		
		
		int contador = 0;
		//problemas acomodados
		for(int i = 0; i<minXtarea.length; i++) {
			
			System.out.print(minXtarea[i]+" , ");
	
		}
		
		
		//prueba 
		int act = minDisponibles;
		for(int i = 0; i<minXtarea.length; i++) {
			
			if(minXtarea[i] <= act ) {
				act-= minXtarea[i];
				contador++;
			}else {
				break;
			}
			
		}
			
			
		if(contador>0) {
			System.out.println("\nTareas que puede realizar solo son: "+contador);
		}else {
			System.out.println("\n0 tareas a realizar");
		}
		
		

		
		


}
}