/*
 Panchito lo logró, salvó el semestre y ahora se está preparando para disfrutar de las vacaciones. 
Tiene una lista de regalos ordenados por precio, y quiere saber cuál es la posición en la lista de un artículo.
Haz un programa que le ayude a hacerlo.

*/
/*
EXPLICACION DEL PROBLEMA: 
En el método main pide el número de artículos de la lista la variable se llama na,
es para crear un arreglo con el tamaño exacto, después pide el String que vas a buscar, 
después esta un ciclo for el cual sirve para ir agregando los artículos al array. después
manda a llamar el método binarySearch que sirve para buscar el articulo que quieres
*/

package algoritmosp;

import java.util.Scanner;


public class ORDINARIO_E2 {

    
public static  int binarySearch(String busqueda, String array[],int izq, int der){
    if (der<=izq) {
     return -1;   
    }
    if (der==(izq+1)){
        if (array[der].compareTo(busqueda)==0) {
            return der;
        }
        if (array[izq].compareTo(busqueda)==0) {
            return izq;
        }
        return -1;
    }
    int medio=((der+izq)/2);
    if (array[medio].compareTo(busqueda)==0) {
        return medio;
    }
    if (array[medio].compareTo(busqueda)>0) {
        return binarySearch(busqueda,array,izq,medio);
    }
    return binarySearch(busqueda, array, medio, der);
}

/*
        public static String [] quickSort(String array[]){
      if (array.length==0) {
          String resarray[]={
              
          };
          return resarray;
      }
      if (array.length==1) {
       
          return array;
      }
     String izq="" , der="";
     String pivote=array[array.length-1];
      for (int i = 0; i < array.length-1; i++) {
          
          if (array[i].compareTo(pivote)<0) {
              izq+=array[i]+",";
             
          }
          else{
              der+=array[i]+",";
          }
      }
      
     String [] arrayizq= quickSort(izq.split(","));
     String [] arrayder= quickSort(der.split(","));
      
     String resarray []= new String[array.length];
     int contador=0;
     
     for(String i :  arrayizq){
         if (i.compareTo("")==0) {
             break;
         }
      resarray[contador]=i;
          contador++;
          
      }
     resarray[contador]= pivote;
      contador++;
       
      for(String i :  arrayder){
             if (i.compareTo("")==0) {
             break;
         }
      resarray[contador]=i;
          contador++;
          
      }
      return resarray;
      
  }
    */
    
    
public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
    int na;
    System.out.println("Por favor ingresa el numero de articulos en tu lista: ");
   na=Integer.parseInt(s.nextLine());
  
      System.out.println("Cual ariculo vas a buscar");
           String guardarelbuscado=s.nextLine();
   String [] array= new String[na];
       for (int i = 0; i < na; i++) {
           System.out.println("Ingresa el articulo numero"+(i+1));
           array[i]=s.nextLine();
           
    }
 
       //array=quickSort(array);
       
       for(String i:array){
           System.out.println(i);  
       }
           
            System.out.println("Este articulo esta en la posicion: "+binarySearch(guardarelbuscado, array, 0, array.length-1));    
    
       
 
       
           }   
       

    
}
