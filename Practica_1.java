package practicas_;

import java.util.Scanner;

public class Practica_1 {

    public static void main(String[] args) {
       int x,y;
       int suma = 0;
        
       Scanner entrada = new Scanner (System.in);
       System.out.print("Ingrese los numeros: ");
       String[] numeros= entrada.nextLine().split(" ");
       x= Integer.parseInt(numeros[0]);
       y= Integer.parseInt(numeros[1]);
       
       
       
       if(0<= x  && x <= 100){
           if(0 <= y  && y <= 100){
       suma= (x+y);
           System.out.print("La suma es igual a: " + suma);
       }
       
       else
       {
           System.out.println("Los suma no se puede realizar.");
           }
    }
  } 
}
