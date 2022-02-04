package algoritmos;
import java.util.Scanner;

class Practica1{
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);    
    
    int x, y, Total;
    
    System.out.println("Escribe un número: ");
    x = s.nextInt();
    y = s.nextInt();
    
    Total= x + y;
        System.out.println("El resultado es: "+Total);
    }
}