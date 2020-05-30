
package Clase;
import java.util.Scanner;
public class ordinario2 {
   
public static void BS(int B[], int inf, int sup, int G){
   int men = inf;
   int may = sup - 1;
   int centro = 0;
   int lok = G;
   int [] C = B;
   
   while(men<may){
      
      centro = (may + men) / 2;
      
      if(C[centro] == lok ){
         System.out.println(centro);
         break;
      }
      else if(lok < C[centro]){
         may = centro -1;
      }
      else{
         men = centro +1;
      }
   }
}
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String[] num, mas;
    int dat2;
    int i = 0, z = 0;
    
    System.out.println("Dame la cantidad de articulos que tienes para buscar y el nombre del articulo a buscar en la lista: ");
    num = s.nextLine().split(" ", 0);
    
    int[] num2 = new int [Integer.valueOf(num[0])];
    String[] m = new String [Integer.valueOf(num[0])];
    
    System.out.println("Dame la lista con su precio: ");
       for(i = 0; i < Integer.valueOf(num[0]); i++){
           mas = s.nextLine().split(" ", 0);
           m[i] = mas[0];
           num2[i] = Integer.valueOf(mas[1]);
           if(m[i].equals(num[1])){
               z = i;
           }
       }
       
    
    BS( num2, 0, Integer.valueOf(num[0]), num2[z]); 
    }
    
   }
   

