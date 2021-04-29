
import java.util.Scanner;




public class Practica4 {

  
    public static void main(String[] args) {
       Scanner entrada =new Scanner(System.in);

        int aux; 
        int n=0; 
        String Objeto[];      
       
       
        System.out.println("Cantidad de OBjetos");
        n=entrada.nextInt();
         Objeto=new String [n];
      int a[];
      a=new int [n];
     while(n>50 || n<1)
     {System.out.println("Cantidad de n objetos");
     n=entrada.nextInt();
     }
         for(int i=0; i<n; i++){
           System.out.println("Objeto:");   
            Objeto[i]=entrada.next();
             System.out.println("Cantidad");
           int k = 0;
             a[k]=entrada.nextInt();
             System.out.println(" ");
         }  
            
         for(int i=0; i<a.length-1; i++){

 for (int j=0; j<a.length-1;j++){
  if(a[j]<a[j+1]){
      aux=a[j];
      a[j]=a[j+1];
      a[j+1]=aux;
  }
 
 
 }}
         
  for(int i=0; i<a.length; i++)
        System.out.print(a[i]+" "); 
     
    
}
}
          
     
 