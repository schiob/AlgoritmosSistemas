/*
A Manuel le gustan mucho los dinosaurios y los nombres tan extraños que pueden tener, 
algunos de esos nombres pueden ser muy largos, como Pachycephalosaurus, Manuel tiene una lista
con nombres de dinosaurios y quiere ordenarla de los nombres más cortos a los más largos.

Ayuda a Manuel haciendo un programa que haga eso.

Input
Consiste en una linea que tiene nombres de dinosaurios separados por un espacio.

Output
Imprime a salida estandar la lista de los dinosaurios ordenados de más corto a más largo.

Ejemplos
Entrada
Parasaurolophus Oviraptor Minmi Troodon Wannanosaurus
Salida
Minmi Troodon Oviraptor Wannanosaurus Parasaurolophus


*/
import java.util.Scanner;

public class Practica5 {

   
public static void main(String[] args) {
Scanner s = new Scanner (System.in);

        
      System.out.println("Digita el nombre de los difuntos dinosaurios xD");  
     String [] dino = s.nextLine().split(" "); 
        
     
        for (int i = 0; i < dino.length ; i++) {
     int x=i;
            for (int j = i; j >=0 ; j--) {
                if (dino[x].length()<dino[j].length()) {
                    String temp = dino[x];
                    dino[x]= dino[j];
                    dino[j]= temp;
                    x=j;
                }
                
            }
    }
        for (int i = 0; i < dino.length; i++) {
            System.out.println(dino[i]);        
    }
        
    }
    
}
