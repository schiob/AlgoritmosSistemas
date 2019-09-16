import java.util.Scanner;
public class DinoClase {
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          String arr[] = new String[5];  
          
                     String temporal;  
             
          
             
           System.out.print("Nombres de los dinosaurios\n : ");  
           for(int i=0; i<arr.length; i++)  
           {  
               arr[i] = sc.next();  
           }  
             
         
           for(int i=0; i<arr.length; i++)  
           {  
               for(int j=i+1; j<arr.length; j++)  
               {  
                   if(arr[i].length() > arr[j].length())  
                   {  
                       temporal = arr[i];  
                       arr[i] = arr[j];  
                       arr[j] = temporal;  
                   }  
               }  
           }  
             
           System.out.print("Nombres de dinosaurios ordenados de menor a mayor :\n");  
           for(int i=0; i<arr.length; i++)  
           {  
               System.out.print(arr[i]+ "  ");  
           }
          
          
    }//cierre de main
    
}//cierre de clase
