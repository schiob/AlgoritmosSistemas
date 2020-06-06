package alfabeticamente;
import java.util.Scanner;

public class Extra {
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
       String[] ini = s.nextLine().split(" ", 0);
       int val = ini[1].compareTo("");
       
       String[] let = s.nextLine().split(" ", 0);
       int [] tam = new int[Integer.valueOf(ini[0])];
       
       for(int i = 0; i < Integer.valueOf(ini[0]); i++){
           tam[i] = let[i].compareTo("");
       }
       
       /*for(int i = 0; i < tam.length; i++){
           System.out.print(tam[i] + " ");
       }*/
       
       BS(tam ,0 ,Integer.valueOf(ini[0])-1 , val);
        
    }
    
}
