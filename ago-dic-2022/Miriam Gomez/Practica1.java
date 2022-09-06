
import java.util.Scanner;

public class Practica1 {

public static void main(String[] args) {
 Scanner  s= new Scanner (System.in);
    float num1,num2;
   float suma;
   
    System.out.println("Digite 2 numeros separados por un espacio para sumarlos"); 
//   num1= s.nextFloat();
//   num2= s.nextFloat();
   
   String[] x=s.nextLine().split(" ");
   num1=Float.parseFloat(x[0]);
   num2=Float.parseFloat(x[1]);
   //String nombre = x[2];
   
   
  suma= num1+num2;
  System.out.println("La suma de los dos digitos es: "+suma);
  
    }
    
}
