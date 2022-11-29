/*
La entrada será recibida por **STDIN**

La primera linea tiene un entero **n**, donde **1<n<500** que representa el número de tareas que
tiene que hacer Panchito. Después hay **n** lineas con un string y un entero separados por un espacio,
representando el nombre de la tarea **s** y la prioridad que tiene **x**.*/


/*
EXPLICACION DEL PROBLEMA: 

Primero pide el número de tareas que tiene que hacer panchito  para luego crear un arreglo del tamaño del número
de tareas el cual se llama tareas en el que se irán guardando las tareas que tiene que hacer panchito. También 
hay una clase que se llama ordi que es para manejar el arreglo con el quickSort para que me pueda ordenar 
las tareas por su prioridad
*/


package algoritmosp;

import java.util.Scanner;

public class ORDINARIO_E1 {
    
 public static ordi [] quickSort(ordi array[]){
      if (array.length==0) {
          ordi resarray[]=new ordi[0];
          return resarray;
      }
      if (array.length==1) {
       
          return array;
      }
     int contador=0,contadorder=0;
    ordi pivote=array[array.length-1];
      for (int i = 0; i < array.length-1; i++) {
          
          if (array[i].getvalue()>(pivote).getvalue())
                {
               
              contador++;
             
          }
          
          else{
              contadorder++;
          }
      }
      
    ordi[] arrayizq= new ordi[contador];
     ordi[] arrayder= new ordi[contadorder];
     contador=0;
     contadorder=0;
       for (int i = 0; i < array.length-1; i++) {
          
          if (array[i].getvalue()>(pivote).getvalue())   {
              arrayizq[contador]=new ordi(array[i].name,array[i].moro);
              contador++;
             
          }
          
          else{
              arrayder[contadorder]=new ordi(array[i].name,array[i].moro);
              contadorder++;
          }
      }
       arrayizq=quickSort(arrayizq);
      arrayder=quickSort(arrayder);
    ordi resarray []= new ordi[array.length];
      contador=0;
     
     for(ordi i :  arrayizq){
      resarray[contador]=i;
          contador++;
          
      }
     resarray[contador]= pivote;
      contador++;
       
      for(ordi i :  arrayder){
         
      resarray[contador]=i;
          contador++;
          
      }
      return resarray;
      
  }
   
public static void main(String[] args) {
     int numtareas;
   Scanner s = new Scanner(System.in);
    System.out.println("Ingrese el numero de tareas que tiene que hacer panchito");
    numtareas=Integer.parseInt(s.nextLine());
    
   ordi[] tareas= new ordi [numtareas];
   String  nombre;
   int  prioridad;
    for (int i = 0; i <numtareas; i++) {
          System.out.println("Por favor ingresa el nombre de la tarea numero "+(i+1) +" de panchito" );
        nombre=s.nextLine();
        System.out.println("Ingresa el numero de prioridad de la tarea "+(i+1));
       prioridad=Integer.parseInt(s.nextLine());
       
       tareas[i]=new ordi(nombre,prioridad);
    }
    
    tareas= quickSort(tareas);
    for (int i = 0; i < numtareas; i++) {
        System.out.println(tareas[i]);
    }
    }
    
}
