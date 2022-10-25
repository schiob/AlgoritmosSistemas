/*
Ejercicio 1 - Búsqueda simple
Toño está buscando un libro de cálculo en la infoteca de la universidad, pero como la tarea que tiene es muy dificil 
no quiere perder tiempo buscando el libro, ayuda a Toño indicándole la posición del libro que busca en la repisa.

Entrada
La entrada será recibida por STDIN

Consiste en 2 lineas, la primera tiene un entero y un string separados por un espacio, donde el primer entero n representa
el número de libros en la repisa de mate y el string x el nombre del libro que busca Toño.

La siguiente linea tiene n strings separados por un espacio, siendo cada string el nombre de un libro en la repisa.

 wwwwwwwwwwww Salida wwwwwwwwwwwwww
Imprime a salida estandar STDOUT la posición del libro que está buscando Juan, en caso de que no esté imprimir -1.

Ejemplos

wwwwwwwwwwwww Entrada wwwwwwwwwwww
5 CalculoForDummies
Calculo2Deitel CalculoForDummies AlgebraLineal TeoríaDeNúmeros TheMangaGuideToCalculus

wwwwwwwwwwww Salida wwwwwwwwww
2*/

package algoritmosp;
import java.util.Scanner;

public class PARCIAL2_E1 {
    
public static  int binarySearch(String nombrelibro, String array[],int izq, int der){
    if (der<=izq) {
     return -1;   
    }
    if (der==(izq+1)){
        if (array[der].compareTo(nombrelibro)==0) {
            return der;
        }
        if (array[izq].compareTo(nombrelibro)==0) {
            return izq;
        }
        return -1;
    }
    int medio=((der+izq)/2);
    if (array[medio].compareTo(nombrelibro)==0) {
        return medio;
    }
    if (array[medio].compareTo(nombrelibro)>0) {
        return binarySearch(nombrelibro,array,izq,medio);
    }
    return binarySearch(nombrelibro, array, medio, der);
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
 Scanner s = new Scanner (System.in);
    
 int nlibros;
 String nombrelibro;
 
 
    System.out.println("Por favor ingresa el número de libros en la repisa de mate");
    nlibros=Integer.parseInt(s.nextLine());
    
    System.out.println("Por favor ingresa el nombre del libro que buscas ");
    nombrelibro= s.nextLine();
    String [] array=new String[nlibros];
    
    for (int i = 0; i < nlibros; i++) {
        System.out.println("Por favor ingresa el nombre del libro en la posicion "+(i+1));
        array[i]=s.nextLine();
    }
    array=quickSort(array);
    
   
System.out.println("Este libro esta en la posicion: "+binarySearch(nombrelibro, array, 0, array.length-1));     
    
       
 
       
    
    
    
    }
    
}