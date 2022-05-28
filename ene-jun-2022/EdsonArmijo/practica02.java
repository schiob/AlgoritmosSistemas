package Practicas;
import java.util.Scanner;
public class practica02 {
	public static void main(String[] args) {
       int nproblem, time, j, swap;
        Scanner sc = new Scanner(System.in);
        
      System.out.println("Ingrese el numero de problemas");
        nproblem= sc.nextInt();
        
       int array[] = new int[nproblem];
        System.out.println("ingrese el tiempo que toma hacer los problemas");
       for(time=0; time<nproblem; time++){
         array[time] = sc.nextInt();
         }
       
       for(time=1; time<=nproblem-1; time++){
        j=time;
         while(j>0 && array[j]<array[j-1]){
          swap =array[j];
          array[j] = array[j-1];
          array[j-1] = swap;
          j--;
         }      
        }
        
       System.out.println("Acomodo de Problemas");
        for(time=0; time<nproblem; time++){
         System.out.println(array[time]);
        }
        
        int []arr={1,1,2,2,2,3,3,4,5,7};
         int min, sum = 0;
          System.out.println("Cuántos minutos tienes para realizarlo?");
          min=sc.nextInt();
        
        
        if(min > 0){
          for(int i=0; i>arr.length; i++){  
            if(array[i]<min){
             sum += arr[i];
             System.out.println("El numero de problemas que puedes resolver es"+sum);
          }
          
         else if(arr[i]>min){
          System.out.println("No se resolvieron");
            }                    
           }
          }    
            
        System.out.println("Resolver "+nproblem+" problemas en "+min+" minutos");
        
         }
        }
