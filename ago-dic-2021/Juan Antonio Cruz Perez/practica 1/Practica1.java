
package practicas;

import java.util.Scanner;


public class Practica1 {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        int nu, nd,res;
        System.out.println("Inserte el primer numero");
        nu = n1.nextInt();
        System.out.println("Inserte el segundo numero");
        nd = n1.nextInt();
        
        res = nu + nd;
        
        System.out.println(" los numeros fueron: " + nu + "\t" + nd);
        
        System.out.println("la suma de los numeros es: " + res);
        
    }
}
