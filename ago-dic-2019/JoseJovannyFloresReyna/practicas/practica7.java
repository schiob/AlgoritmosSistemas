//Practica 7 Jose Jovanny Flores Reyna

package practicas;
import java.util.Scanner;
public class practica7 {

   private static String []a;
    
   public static void sort(){
       int left = 0;
       int right = a.length-1;
            
       quickSort(left, right);
   }
    
   private static void quickSort(int left,int right){
        
       if(left >= right)
           return;
       
       String pivot = getMedian(left, right);
       int partition = partition(left, right, pivot);
        
       quickSort(0, partition-1);
       quickSort(partition+1, right);
   }
    
   private static int partition(int left,int right,String pivot){
       int leftCursor = left-1;
       int rightCursor = right;
       
       while(leftCursor < rightCursor){
        while(((Comparable<String>)a[++leftCursor]).compareTo(pivot) < 0);
         while(rightCursor > 0 && ((Comparable<String>)a[--rightCursor]).compareTo(pivot) > 0);
           if(leftCursor >= rightCursor){
               break;
           }else{
               swap(leftCursor, rightCursor);
           }
       }
       swap(leftCursor, right);
        return leftCursor;
   }
    
   public static String getMedian(int left,int right){
       int center = (left+right)/2;
        
       if(((Comparable<String>)a[left]).compareTo(a[center]) > 0)
           swap(left,center);
        
       if(((Comparable<String>)a[left]).compareTo(a[right]) > 0)
           swap(left, right);
        
       if(((Comparable<String>)a[center]).compareTo(a[right]) > 0)
           swap(center, right);
        
       swap(center, right);
       return a[right];
   }
    
   public static void swap(int left,int right){
       String temp = a[left];
       a[left] = a[right];
       a[right] = temp;
   }
    
   public static void printArray(){
       for(String i : a){
           System.out.println(i+" ");
       }
   }
   
   //Busqueda binaria
		public static int busquedaBin(String[] arreglo, String busqueda, int izquierda, int derecha) {
		    if (izquierda > derecha) {
		        return -1;
		    }
		 
		    int indiceDelElementoDelMedio = (int) Math.floor((izquierda + derecha) / 2);
		    String elementoDelMedio = arreglo[indiceDelElementoDelMedio];
		
		    int resultadoDeLaComparacion = busqueda.compareTo(elementoDelMedio);
		 
		    if (resultadoDeLaComparacion == 0) {
		        return indiceDelElementoDelMedio;
		    }
		 
		    if (resultadoDeLaComparacion < 0) {
		        derecha = indiceDelElementoDelMedio - 1;
		        return busquedaBin(arreglo, busqueda, izquierda, derecha);
		    } else {
		        izquierda = indiceDelElementoDelMedio + 1;
		        return busquedaBin(arreglo, busqueda, izquierda, derecha);
		    }
		}
		
		//MAIN
   public static void main(String[] args) {
	   int n, q, inf, sup, mitad;
       Scanner entrada = new Scanner(System.in);

   a = new String[]{"naproxeno", "paracetamol", "rimantadina", "azitromicina", "ibuprofeno"};
    
   System.out.print("Arreglo desordenado: ");
   for(String u : a){
       System.out.print(u+" ");
   }
   System.out.print("\n\nArreglo ordenado:");
   sort();
   System.out.println("");
   printArray();
 
   System.out.println("\nPeticiónes para encontrar una de las medicinas: ");
   q=entrada.nextInt();
  
    String [] buscar = new String [q];
    
    System.out.println("busqueda: ");
    for(int i=0; i<buscar.length; i++){
       buscar[i]=entrada.next();
    }
    String busqueda = buscar[q-1];
    
 	int ElementoBuscado = busquedaBin(a, busqueda, 0, a.length - 1);
 	if(ElementoBuscado >=0){
 	for(int i=0; i<buscar.length; i++){
 	System.out.println(i);
 	}
 	}
 	else{
 		for(int i=0; i<buscar.length-1; i++){
 	 	System.out.println(i);
 	}
 	System.out.println(ElementoBuscado);
 	}
 
}
    
}
		   