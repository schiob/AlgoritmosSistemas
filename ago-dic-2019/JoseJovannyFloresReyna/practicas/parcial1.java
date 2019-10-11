package practicas;

import java.util.Scanner;

public class parcial1 {

	public static void main (String[]args){
		String p []; 
		int h [];
		int m [];
		int nPeliculas;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cantidad de peliculas: ");
		nPeliculas=entrada.nextInt();
		
		p=new String[nPeliculas];
		h=new int[nPeliculas];
		m=new int[nPeliculas];
		
		System.out.println("Peliculas y duracion:");
		for(int i=0; i<p.length; i++){
			System.out.print((i+1)+". Ingrese el nombre de la pelicula y horas: ");
			p[i]=entrada.next();
			System.out.print(" Horas: ");
			h[i]=entrada.nextInt();
			System.out.print(" minutos: ");
            m[i]=entrada.nextInt();
		}
		int [] a = new int [nPeliculas];
		
		for(int i=0; i<a.length; i++){
			a[i]=h[i]+m[i];
		}
		
		
		int[]b=new int [a.length];
		int izq, mi, der;
	    
		
		
		for(int i=0; i<a.length; i++){
		System.out.print(a[i] + " ");
		}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
