package quicksortt;

import java.util.Scanner;

public class quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		 System.out.print("tamaño del arreglo");
		  int tamaño=s.nextInt();
		  System.out.print("cantidad  a buscar");
		  int busqueda=s.nextInt();
			int arreglo[]= new int[tamaño];
			for(int i=0;i<arreglo.length;i++) {
				 arreglo[i]=s.nextInt();
			}
			System.out.println(" 	orden	");
			ordenacion(arreglo);
			imprimirarreglo(arreglo);
			int  ultimo = arreglo.length- 1 ;  
	        binarySearch (arreglo, 0 , ultimo, busqueda); 
	}
	
		 		
	public static void  imprimirarreglo(int arreglo[]) {
		
		for(int i =0;i<arreglo.length;i++) {
			System.out.println(arreglo[i]+" 	");
			System.out.println();
		}
	}
	 public static void ordenacion(int[] arreglo) {
		 final int n=arreglo.length;
		 quicksort(arreglo,0,n-1);
	 }
	 public static void quicksort(int []arreglo,int inicio,int fin) {
		 if(inicio>=fin) return;
		 int pivote=arreglo[inicio];
		 int izquierda=inicio+1;
		 int derecha=fin;
	 while(izquierda<=derecha) {
		 while(izquierda<=fin && arreglo[izquierda]<pivote)izquierda++;
		 while (derecha>inicio&& arreglo[derecha]>=pivote)derecha--;
		 if(izquierda<derecha) {
			 int temporal=arreglo[izquierda];
			 arreglo[izquierda]=arreglo[derecha];
			 arreglo[derecha]=temporal;
		 }
		 if (derecha>inicio) {
			 int temporal=arreglo[inicio];
			 arreglo[inicio]=arreglo[derecha];
			 arreglo[derecha]=temporal;
		 }
		 quicksort(arreglo,inicio,derecha-1);
		 quicksort(arreglo,derecha+1,fin);
	 }
	 }
	 public static void binarySearch(int arr[], int primero, int ultimo, int variable){  
		   int mitad = (primero+ ultimo)/2;  
		   while( primero <= ultimo ){  
		      if ( arr[mitad] < variable ){  
		        primero = mitad + 1;     
		      }else if ( arr[mitad] == variable ){  
		        System.out.println("Elemento esta en el indice: " + mitad);  
		        break;  
		      }else{  
		         ultimo = mitad - 1;  
		      }  
		      mitad = (primero + ultimo)/2;  
		   }  
		   if ( primero > ultimo ){  
		      System.out.println("Elemento no esta en la lista!");  
		   }  
		 }  
	 }

	 	
	



