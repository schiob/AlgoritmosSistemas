import java.util.Scanner;


public class Tarea1 {

     public static void main( String[] args )
    {
        int n1, n2, suma;

        Scanner teclado = new Scanner( System.in );

        System.out.print( "INTRODUZCA EL PRIMER NUMERO " );
        n1 = teclado.nextInt();

        System.out.print( "INTRODUZCA EL SEGUNDO NUMERO " );
        n2 = teclado.nextInt();

        suma = n1 + n2;

        System.out.println( "LA SUMA DE " + n1 + " MÁS " + n2 + " ES " + suma + "." );
    }
}