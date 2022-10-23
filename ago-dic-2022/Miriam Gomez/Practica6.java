
import java.util.Scanner;

/*
Ejercicio Ordenando
Este semestre se realizó la primera edición de las Olimpiadas Pumas. Muchos estudiantes participaron en 
diferentes competencias deportivas y consiguieron muchas medallas. Pero todavía no se sabe quién fue el que quedó en primer lugar.

Para esto hay que considerar quién tiene más medallas de Oro, si algunos participantes tienen la misma cantidad 
se determina por el número de medallas de Plata, y si también coinciden ahí se desempata por medallas de Bronce.

Si tienen el mismo número de medallas de oro, plata y bronce puedes ordenarlos por orden alfabético.

Dada una lista con los concursantes y ganando medallas consiguieron, imprime la lista ordenada con las reglas de arriba.

Aporte
La entrada será recibida por STDIN

La primera linea tiene un entero n , donde 1<n<500 que representa el numero de concursantes de las olimpiadas. Después 
hay n lineas con una cuerda y 3 enteros separados por un espacio, representando el nombre del concursante s , las medallas 
obtenidas de oro x , plata y y bronce z . 0<=xyz<=20 . 
*/
public class Practica6 {
    
    
         public static ConcursantePractica6 [] quickSort(ConcursantePractica6 array[]){
      if (array.length==0) {
          ConcursantePractica6 resarray[]=new ConcursantePractica6[0];
          return resarray;
      }
      if (array.length==1) {
       
          return array;
      }
     int contador=0,contadorder=0;
    ConcursantePractica6 pivote=array[array.length-1];
      for (int i = 0; i < array.length-1; i++) {
          
          if (array[i].getvalue()>(pivote).getvalue())
                {
               
              contador++;
             
          }
          
          else{
              contadorder++;
          }
      }
      
    ConcursantePractica6[] arrayizq= new ConcursantePractica6[contador];
     ConcursantePractica6[] arrayder= new ConcursantePractica6[contadorder];
     contador=0;
     contadorder=0;
       for (int i = 0; i < array.length-1; i++) {
          
          if (array[i].getvalue()>(pivote).getvalue())   {
              arrayizq[contador]=new ConcursantePractica6(array[i].name,array[i].moro,array[i].mplata,array[i].mbronce);
              contador++;
             
          }
          
          else{
              arrayder[contadorder]=new ConcursantePractica6(array[i].name,array[i].moro,array[i].mplata,array[i].mbronce);
              contadorder++;
          }
      }
       arrayizq=quickSort(arrayizq);
      arrayder=quickSort(arrayder);
    ConcursantePractica6 resarray []= new ConcursantePractica6[array.length];
      contador=0;
     
     for(ConcursantePractica6 i :  arrayizq){
      resarray[contador]=i;
          contador++;
          
      }
     resarray[contador]= pivote;
      contador++;
       
      for(ConcursantePractica6 i :  arrayder){
         
      resarray[contador]=i;
          contador++;
          
      }
      return resarray;
      
  }

public static void main(String[] args) {
   int numc;
   Scanner s = new Scanner(System.in);
   System.out.println("Ingrese el numero de concusantes de las olimpiadas Pumas");
    numc=Integer.parseInt(s.nextLine());
   ConcursantePractica6[] concursantes= new ConcursantePractica6 [numc];
   String  nombre;
   int  oro;
   int  plata;
   int  bronce;
    for (int i = 0; i <numc; i++) {
        System.out.println("Por favor ingresa el nombre del concursante: ");
        nombre=s.nextLine();
        System.out.println("Ingresa el numero de las medallas ganadas de ORO");
       oro=Integer.parseInt(s.nextLine());
        System.out.println("Ingresa el numero de las medallas ganadas de PlATA");
       plata=Integer.parseInt(s.nextLine());
        System.out.println("Ingresa el numero de las medallas ganadas de BRONCE");
       bronce=Integer.parseInt(s.nextLine());
       
       concursantes[i]=new ConcursantePractica6(nombre,oro,plata,bronce);
    }
    
    concursantes= quickSort(concursantes);
    for (int i = 0; i < numc; i++) {
        System.out.println(concursantes[i]);
    }
    
    }
    
}
