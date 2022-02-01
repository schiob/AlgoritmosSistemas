package Progra2;
import java.util.Scanner;
public class Prac1 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n1, n2, res;
        System.out.println("Escribe un numero a sumar");
        n1=Integer.parseInt(sc.nextLine());
        System.out.println("Escribe un segundo numero a sumar");
        n2=Integer.parseInt(sc.nextLine());
        res= n1+ n2;
        System.out.println("El resultado es: "+ res);
    }
    
}
