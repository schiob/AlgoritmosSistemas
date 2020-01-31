package practica1;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class Practica1 {
     
 public static void main(String[] args) {
       int x;
        int y;
        int resultado;
        
       Scanner teclado=new Scanner(System.in);
         System.out.print( "Introduzca el valor de x: " );
         x=teclado.nextInt();
         
                System.out.print( "Introduzca el valor de y: " );
      y=teclado.nextInt();
      
           if(-101<x&&y<101){
             
                               
           }else{
               System.out.print("Valor invalido");
           }
                   
    
 resultado=x+y;
     System.out.print( "El resultado es: " +resultado);
        
}
}