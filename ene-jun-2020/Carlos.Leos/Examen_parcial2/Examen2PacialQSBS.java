
package salon;
import java.util.Scanner;
public class Examen2PacialQSBS {
   public static void quicksort(int A[], int izq, int der) {

  int pivote=A[izq]; 
  int i=izq; 
  int j=der; 
  int aux;
 
  while(i<j){            
     while(A[i]<=pivote && i<j) i++; 
     while(A[j]>pivote) j--;         
     if (i<j) {                                           
         aux= A[i];                  
         A[i]=A[j];
         A[j]=aux;
     }
   }
   A[izq]=A[j]; 
   A[j]=pivote; 
   if(izq<j-1)
      quicksort(A,izq,j-1); 
   if(j+1 <der)
      quicksort(A,j+1,der); 
}
   
public static void BS(int B[], int inf, int sup, int bus){
   int men = inf;
   int may = sup - 1;
   int centro = 0;
   int lok = bus;
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
    String[] m, num, num2;
    int dat2;
    
    System.out.println("Dame la cantidad de numeros que tienes para buscar y cual numero vas a buscar separado por un espacio: ");
    num = s.nextLine().split(" ", 0);
    
    System.out.println("Ingresa los numeros de serie que tienes: ");
    num2 = s.nextLine().split(" ", 0);
    int[] dat = new int[num2.length];
    
    for(int i=0; i<num2.length; i++){
       dat2 = Integer.valueOf(num2[i]);
       dat[i]= dat2;
    
    }
    
    quicksort(dat, 0, num2.length-1);
    
    BS(dat, 0, dat.length, Integer.valueOf(num[1]));
    
   }
   
}
