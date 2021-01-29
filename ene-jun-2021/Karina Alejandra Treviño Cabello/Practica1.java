
import java.util.Scanner;


public class Practica1 {

 
    public static void main(String[]args) {
       Scanner teclado = new Scanner (System.in);
       
        int x, y;
        int resultado; 
        System.out.println("Ingrese el valor de x:");
        x=teclado.nextInt();
        
        System.out.println("Inrese el valor de y");
        y=teclado.nextInt();
        
        resultado=x+y;
        
        System.out.println("El Resultado es:"+resultado);
    }
    
}
