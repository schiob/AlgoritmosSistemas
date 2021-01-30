package base.de.datos.i;
import java.util.Scanner;
public class Practica1 {

    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      
      int x=0,y=0;
      x = s.nextInt();
      y = s.nextInt();
      
      if(x>=0 && x<=100){
         if  (y>=0 && y<=100) {    
        System.out.println(x+y);
            }
      }
      else 
            System.out.println("No se puede realizar la operación.");
      
    }
    
}
