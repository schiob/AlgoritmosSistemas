package parcial2a;

import java.util.Scanner;
public class parcial {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 Scanner s=new Scanner(System.in);
				int arreglo[]= new int[5];
				for(int i=0;i<arreglo.length;i++) {
					 arreglo[i]=s.nextInt();
				}
				System.out.println(" 	orden	");
				ordenacion(arreglo);
				imprimirarreglo(arreglo);
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

	}

