

import java.util.Scanner; 
public class Practica1
{
    public static void main(String[]args)
    {
        Scanner f = new Scanner (System.in);

        int a = f.nextInt();
        int b = f.nextInt();
        f.close();
        int Suma = a+b;
        //System.out.println("Agregar numeros");
        //String N = f.next();

        //*while (f.hasNextInt()) { //mientras queden enteros por leer
                //numeroEntero = f.nextInt(); //se lee un entero del archivo
                //System.out.print(numeroEntero + " "); //se muestra por pantalla
                //sumaInt = sumaInt + numeroEntero;  //se suma
        //
        
        System.out.println("La suma de los numeros es = " + Suma);

    }
}
