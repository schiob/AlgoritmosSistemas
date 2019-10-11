import java.util.*;
import java.lang.String;
import java.util.Scanner;
public class mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
			
		  System.out.print("cantidad de libros a ingresar");
		  int tamaño=0;
		   tamaño=s.nextInt();
		
		  String []arreglo=new String[tamaño+1];
		  int[] arreglo2=new int [tamaño];
		  int i=0;
		  
		   System.out.println("agrega  los nombres de los nombres de los libros ");
		  for( i=0;i<arreglo.length;i++)
		  {
			  arreglo[i] = s.nextLine();
			  
		  }
		  System.out.println("agrega el numero de paginas de cada cuento");
		  for( i=0;i<tamaño;i++)
		  {
		  arreglo2[i]=s.nextInt();
		  }
		  System.out.println("cuenta con los libros  ");
		   
		  for(i=0;i<tamaño;i++)
		  {
			  System.out.println(arreglo[i+1]+"			"+  arreglo2[i]);
		   
		  }
		
		  System.out.println("\n libro ordenado de sus numeros de paginas");
			mergesort(arreglo2);
			s.close();
			for(int i1:arreglo2)
			System.out.println(i1);
			
			System.out.println("\n libros ordenados con sus paginas");
			for(i=0;i<tamaño;i++)
			  {
				  System.out.println(arreglo[i+1]+"			"+  arreglo2[i]);
			   
			  }
	}
		
		static void mergesort(int[] arreglo){
			int size = arreglo.length;
			if(size> 1){
				if(size % 2 == 0){
					int[] izq = new int[size/2];
					int[] der = new int[size/2];
					tamaño(arreglo, izq, 0, size/2);
					tamaño(arreglo, der, size/2, size);
					mergesort(izq);
					mergesort(der);
					mezclador(arreglo, izq, der);
				}else {
					int[] izq = new int[size/2];
					int[] der = new int[(size/2) + 1];
					tamaño(arreglo, izq, 0, size/2);
					tamaño(arreglo, der, size/2 + 1, size);
					mergesort(izq);
					mergesort(der);
					mezclador(arreglo, izq, der);
				}
			}
			
		}
		
		static void tamaño(int[] arreglo, int[] arreglo2, int inicio, int fin){
			int contador = 0;
			for(int i=inicio; i<fin; i++){
				arreglo2[contador] = arreglo[i];
				contador++;
			}
				
		}
		
		static void mezclador(int[] arreglo, int[] izq, int[] der){
			int contadorIzq = 0;
			int contadorDer = 0;
			int contadorArr = 0;
			
			while(contadorArr < arreglo.length){
				if(contadorIzq >= izq.length){
					arreglo[contadorArr] = der[contadorDer];
					contadorDer++;
				}
				else if(contadorDer >= der.length){
					arreglo[contadorArr] = izq[contadorIzq];
					contadorIzq++;
				}
				else if(izq[contadorIzq] > der[contadorDer]){
					arreglo[contadorArr] = der[contadorDer];
					contadorDer++;
				}
				else{
					arreglo[contadorArr] = izq[contadorIzq];
					contadorIzq++;
				}
				contadorArr++;
			}
		}

	

}
