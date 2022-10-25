/*
 
Rabin tiene un problema. Le encanta la música, y tiene una playlist (algo rabinesco) con sus canciones favoritas.
Pero cuando quiere poner una canción en especial tarda mucho tiempo buscándola y eso significa menos tiempo disfrutando y bailando.

Como quieres ayudarlo le propones ordenar esa lista de canciones por orden alfabético y luego aplicar algún algoritmo de
búsqueda para encontrar las canciones que quiera.

Realiza ese programa para decirle a Rabin cómo quedaría su playlist ordenada y la nueva posición de las canciones que te pida.

  wwwwwwwwwwwwwww Entrada wwwwwwwwwwwwwwwwww
La entrada será recibida por STDIN

La primera linea tiene dos enteros N y Q, el número de canciones en la playlist de Rabin y el número de peticiones que hará.

La segunda linea tiene N palabras separadas por espacio representando las canciones en su playlist.

Luego hay Q lineas con una palabra cada una. Estas son las canciones que está buscando Rabin.

wwwwwwwwwwwwww Salida wwwwwwwwwwwwww
Imprime a salida estandar STDOUT.

En la primera linea el nuevo orden de la playlist de Rabin.

Luego imprime Q lineas, cada una con el índice de la posición de la canción que busca Rabin en esa petición.

**************** Ejemplos ******************

wwwwwwwwwww Entrada wwwwwwwwwwwwww
8 4
FiestaDeLocos Matador Comprendes,Mendes? PadreNuestro YoTomo Frijolero SiSeñor Imagina
SiSeñor
Imagina
PadreNuestro
Matador

wwwwwwwwww Salida wwwwwwwwwwww
Comprendes,Mendes? FiestaDeLocos Frijolero Imagina Matador PadreNuestro SiSeñor YoTomo
6
3
5
4
Notas
Resuelve el problema con quick sort y la búsqueda con binary search.

Cuando termines sube el código a github.

*/
package algoritmosp;
import java.util.Scanner;
public class PARCIAL2_E2 {

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
    
    
 
    public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);

    int  ncanciones,busqueda;
    
    /*
    Comprendes,Mendes? FiestaDeLocos Frijolero Imagina Matador PadreNuestro SiSeñor YoTomo
6
3
5
4
    */
    
    
        System.out.println("Por favor ingresa el numero de canciones que tienes en la playlist y despues el numero de peticiones que haras: ");
        ncanciones=Integer.parseInt(s.nextLine());
        busqueda=Integer.parseInt(s.nextLine());
        String [] buscados= new String[busqueda];
        String[] array= new String[ncanciones];
        int [] posicion= new int[busqueda];
        for (int i = 0; i < ncanciones; i++) {
           System.out.println("Por favor ingresa el nombre de la cancion numero "+(i)+" que tiene tu playlist: ");   
        array[i]=s.nextLine();
            }
        
        System.out.println("\n ");
        
       array=quickSort(array);
       
       for(String i:array){
           System.out.println("Las canciones en tu playlist son: "+i);  
       }
           
       
       
      
       for (int i = 0; i < busqueda; i++) {
           
           
           System.out.println("¿Cual es la cancion que vas a buscar?");
           String guardarelbuscado=s.nextLine();
           buscados[i]=guardarelbuscado;
           posicion[i]=binarySearch(guardarelbuscado, array, 0, array.length-1);
           
    }
       
        System.out.println("Las canciones buscadas son: ");
        for (int i = 0; i < busqueda; i++) {
            System.out.print(buscados[i]+", ");
        }
        System.out.println("\n ");
        System.out.println("Las posiciones en donde se encuntran las canciones buscadas son: ");
        for (int i = 0; i < busqueda; i++) {
            System.out.println("\n"+posicion[i]);
        }
        
        
        
        
 
        
        
        
        
        
    }
    
}
