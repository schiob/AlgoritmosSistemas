
import java.util.Scanner;


public class Practica6 { //Primero creamos un Arreglo de tipo String con 2 variables que son izquierda y derecha    
public static void quicksort(String Arr[], int izq, int der) {
//Despúes creamos Una variable llamado "pivote" tambien de tipo String 
 String pivote=Arr[izq]; //Le indicamos que tome el primer elemento como pivote 
  int i=izq;     // creo una variable "i" como indicador de la izquierda y que va a realizar la búsqueda de elementos de izquierda a derecha
  int j=der;     // creo una variable "j" como indicador de la derecha y que va a realizar la búsqueda de elementos de derecha a izquierda
  String aux;    
 
  while(i < j){  //creo un ciclo while en donde mientras mi indicador "i" sea menor a la de mi indicador "j" quiere decir que no se estan encontrando
    //en la misma pocicion, (si se encuentran termina la iteracion)                       
     while(Arr[i].compareTo(pivote)<=0 && i < j) i++; //aqui empiezo a comparar mis elementos de la izq, mientras mi elemento de la izq sea <= al pivote
//pasaria al siguiente elemento hasta buscar el elemento mayor que el pivote
     while(Arr[j].compareTo (pivote)>0) j--;  //aqui empiezo a comparar mis elementos de la der, mientras mi elemento de la der sea > al pivote
//pasaria al siguiente elemento hasta buscar el elemento que sea <= que el pivote y en ese momento se haria el intercambio de pocisiones 
//se sige cumpliendo el bucle while hasta que la i>j

     if (i < j) {      // siempre y cuando i<j no se han encontrado                      
         aux= Arr[i];  // se hace un intercambio de los elementos
         Arr[i]=Arr[j];// el elemento del indicador "i" debe ir a la derecha y "j" a la izq
         Arr[j]=aux;
     }
   }
   
   Arr[izq]=Arr[j];   //una vez que se encuentren  se coloca el pivote en la pocicion que corresponde                                    
   Arr[j]=pivote;     // los menores a su izquierda y los mayores a su derecha
   
   if(izq < j-1)  //aplico la llamada recursiva 
      quicksort(Arr,izq,j-1);          // ordenamos subarray izquierdo
   if(j+1 < der)
      quicksort(Arr,j+1,der);          // ordenamos subarray derecho
   
}
    
    public static void main(String[] args) {
     
        
      Scanner entrada =new Scanner(System.in);
        String []arr;
        int n;
        int i;
         System.out.println("Cantidad de medicinas");
        n=entrada.nextInt();
         arr=new String [n];
       for( i=0; i<n; i++){
           System.out.println("Nombre de la medicina:");   
            arr[i]=entrada.next();
       }
                   
     quicksort(arr,0,arr.length-1);
      System.out.print("Los medicinas ordenadas son:\n");
 
      for(i = 0; i <arr.length; i++)
          System.out.print(arr[i]+"  ");
      System.out.println();
        
        
    }
    
}
