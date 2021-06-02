
import java.util.Scanner;
 
public class Practica2 {
public static void main(String[] args) {
            //Arreglo
            Scanner entrada= new Scanner (System.in);
        int a[] = new int [20]; 
        for(int i=0; i<a.length; i++){
            System.out.println("Ingresa el numero de la pocición:"+i);
            a[i]= entrada.nextInt();
        }
        for(int i=1; i<a.length; i++){
            int b =a[i];
            
            int j=i-1; 
            while(j>=0 && a[j]>b){
                    a[j+1] =a[j];
                    j--;
                   
        }
            a[j+1]=b; 
        
        }
        
        
System.out.print("\nlos numero pares son: ");
for (int k=a.length-1; k>=0;k--){
     if(a[k]%2==0){
          System.out.print(a[k]+",");
            //
    }

}
        
}
}