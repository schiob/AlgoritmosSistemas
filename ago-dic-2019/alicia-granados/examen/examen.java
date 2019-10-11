import java.util.Scanner;
import java.util.*;
public class examen {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
			
		  System.out.print("cantidad de libros a ingresar");
		  int numero=0;
		   numero=s.nextInt();
		
		  String []arreglo=new String[numero+1];
		  int[] horas=new int [numero];
		  int[] minutos=new int[numero];
		  int i=0;
		  System.out.println("agrega  los nombres de las peliculas ");
		  for( i=0;i<arreglo.length;i++)
		  {
			  arreglo[i] = s.nextLine();
		  }
		  System.out.println("agrega las horas de las peliculas");
		  for(i=0;i<numero;i++) {
			  horas[i]=s.nextInt();
		  }
		 System.out.println("agrega los minutos de las peliculas");
		  for(i=0;i<numero;i++) {
			  minutos[i]=s.nextInt();
		  }
		  System.out.println("lista de peliculas, horas y minutos que se tardan ");
		  for( i=0;i<numero;i++) {
			  System.out.println(arreglo[i+1]+"  "+horas[i]+"  "+minutos[i]);
		  }
		  System.out.println("\n pelicula ordenada por horas");
		  ordenacionMergeSort(horas);
          imprimirVector(horas);
          System.out.println("\n pelicula ordenada por horas");
		  ordenacionMergeSort(minutos);
          imprimirVector(minutos);
          System.out.println("\n pelicula ordenadas por tiempo");
			
		  for(i=0;i<numero;i++)
		  {
			  System.out.println(arreglo[i+1]+"			"+  horas[i]+"     "+minutos [i]);
			   
		  }
		  
	}
	
		
	public static void ordenacionMergeSort(int vec[]){
        if(vec.length<=1) return;
        int mitad= vec.length/2;
        int izq[]=Arrays.copyOfRange(vec, 0, mitad);
        int der[]=Arrays.copyOfRange(vec, mitad, vec.length);
        ordenacionMergeSort(izq);
        ordenacionMergeSort(der);       
        combinarVector(vec, izq, der);
	}
	
	 public static void combinarVector(int v[], int izq[],int der[]){
         int i=0;
         int j=0;
         for(int k=0;k<v.length;k++){
                 if(i>=izq.length){
                         v[k]=der[j];
                         j++;
                         continue;
                 }
                 if(j>=der.length){
                         v[k]=izq[i];
                         i++;
                         continue;
                 }
                 if(izq[i]<der[j]){
                         v[k]=izq[i];
                         i++;
                 }else{
                         v[k]=der[j];
                         j++;
                 }
         }
 }
 
public static void imprimirVector(int vec[]){
        for(int i=0;i<vec.length;i++){
                System.out.print(vec[i]+" ");
        }
}

}