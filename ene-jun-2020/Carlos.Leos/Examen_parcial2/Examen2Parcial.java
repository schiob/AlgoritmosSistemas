
package salon;
import java.util.Scanner;
public class Examen2Parcial {

   public static void main(String[] args) {
      Scanner s =  new Scanner(System.in);
      String[] lib, num, lib2;
      String m= "";
      int num2, i, j = 0;
      
      System.out.println("Ingrese el numero de libros en la librería y el libro que buscas separados por un espacio: ");
      m = s.nextLine();
      
      num = m.split(" ", 0);
      num2 = Integer.valueOf(num[0]);
      
      System.out.println("Ingresa los libros: ");
      lib2 = s.nextLine().split(" ", 0);
      lib = lib2;
      
      for(i = 0; i<num2; i++){
         if(lib[i].equals(num[1]))
         {System.out.println(i);
         j++;}
      }
      
      if(j == 0)
         System.out.println("-1");
      
   }
   
}
