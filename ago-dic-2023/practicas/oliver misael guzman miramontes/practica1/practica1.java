import java.util.Scanner;
public class practica1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese dos enteros separados por un espacio:");
        
       
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        
       
        int suma = numero1 + numero2;
        
       
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        
       
      
    }
}
