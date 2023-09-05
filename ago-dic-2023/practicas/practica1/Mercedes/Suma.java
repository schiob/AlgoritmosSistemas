import java.util.Scanner;
public class Suma {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Num 1:");
        int num1=s.nextInt();
        System.out.print("Num 2:");
        int num2=s.nextInt();

        int suma = num1+num2;
        System.out.print("La suma es: "+suma);
    }
}
