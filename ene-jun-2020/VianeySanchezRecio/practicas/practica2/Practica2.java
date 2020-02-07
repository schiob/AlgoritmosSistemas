package practica2;
import java.util.Scanner;
import java.util.Scanner;
public class Practica2 {
     
public static void main(String[] args) {
     
    int[]arreglo=new int[20];
  Scanner sc = new Scanner(System.in);
    for(int i=0;i<20; i++  ){
        arreglo[i]=sc.nextInt();
        
    }
            for(int i=19;i>=0; i--  ){
                if (arreglo[i]%2==0) {
                    System.out.println(arreglo[i]+"");
                    
                }
            }
     System.out.println();
        
    }
    
}
