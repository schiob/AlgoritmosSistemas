package algoritmos;
import java.util.*;
/**
 * Fecha: 23 de enero de 2023
 * @author Luz Andrea
 */
public class Practica1 {
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n1, n2;
        System.out.print("Ingresa dos dígitos enteros separados por un espacio: ");
        n1=s.nextInt(); 
        n2=s.nextInt();
        System.out.println("La suma de ambos digitos es: "+(n1+n2));
    }
    
}
