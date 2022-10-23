
import java.util.Scanner;

/*
 Practica 7 - Buscando videojuegos

Angel tiene una colección gigante de videojuegos, tan grande que se le dificulta mucho encontrar alguno cuando lo 
está buscando, y Angel tiene una lista de los videojuegos que quiere encontrar, ayúdalo haciendo un programa que le
ordene los videojuegos en orden alfabético y luego le diga la posición de cada uno de los videojuegos que te pida.

###  Entrada

La entrada será recibida por **STDIN**

Consiste en varias líneas, la primera tiene 2 enteros, **n** representado el número de videojuegos y **q** representando 
el número de peticiones de búsqueda que se hacen para encontrar uno de los videojuegos.

Después hay 1 línea con **n** palabras separadas por espacios, cada palabra es el nombre de un videojuego.
Después hay **q** lineas con una palabra en cada linea representando el videojuego que busca Angel.

###  Salida

Imprime a salida estandar **STDOUT** una linea por cada petición **q** con el índice de la posición del videojuego,}
si no lo encuentras regresar a -1.

###  Ejemplos

####  Entrada
```
5 3
TheLeyendOfZelda SuperMario64 MegaMan3 PokemonAzul MetalSlug2
supermario64
PokémonAzul
PokémonRojo
```
####  Salida

```
3
2
-1
```

##  Nota
Resuelve el problema haciendo una implementación de Quick Sort y Binary Search para la búsqueda
*/
public class Practica7 {
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
    int nj,busqueda;
    System.out.println("Por favor ingresa el numero de videojuegos que  vas a ingresar: ");
   nj=Integer.parseInt(s.nextLine());
    System.out.println("Por favor ingresa el numero de busquedas que vas a hacer");
     busqueda=Integer.parseInt(s.nextLine());
     
   String [] array= new String[nj];
       for (int i = 0; i < nj; i++) {
           System.out.println("Ingresa el videojuego numero"+(i+1));
           array[i]=s.nextLine();
           
    }
 
       array=quickSort(array);
       
       for(String i:array){
           System.out.println(i);  
       }
           
       
       
      
       for (int i = 0; i < busqueda; i++) {
           
           
           System.out.println("Cual videojuego vas a buscar");
           String guardarelbuscado=s.nextLine();
         
           System.out.println("Este videojuego esta en la posicion: "+binarySearch(guardarelbuscado, array, 0, array.length-1));     
    }
       
 
       
           }   
       
}
