

import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int B[]= new int [20];
    int i,j,aux;
     System.out.print("Ingrese dimension del arreglo: ");
     int numero=teclado.nextInt();
     System.out.print("Ingrese minutos para hacerlo: ");
     int m=teclado.nextInt();
   
     for(i=1 ; i<=numero; i++){
         System.out.print("A["+i+"]= ");
         B[i]=teclado.nextInt();
     }
   
     for(i=2;i<=numero;i++){
    	 aux=B[i];
    	 j=i-1;
          while((j>=1) && (aux<B[j])){
             B[j+1]=B[j];
             j=j-1;
             }
   
    B[j+1]=aux;
 }
 
     System.out.println("EL ARREGLO ORDENADO");
     for(i=1 ; i<=numero; i++){
         System.out.print("\t"+B[i]);
        }
     
     int suma = 0,v=0, e=0;
     for (int x = 0; x < B.length; x++) {
    	 suma = suma + B[x];
    	 for(int su=0; suma<=m;su++) {
    		su++;
    		System.out.println(su);
    	 }
     }
     
    	 /*if(suma<=m) {
    		 System.out.print(v++);
    		 
    	 }else {
    		 System.out.print("No puede hacer ninguno");
    	 }*/
    	 
    	}
     
     }
