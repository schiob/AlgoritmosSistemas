
package algoritmosorden;


 import java.util.Scanner;
public class Practica1 {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
int  v1=0, v2=0;
System.out.println("Ingresa un numero:");
v1= s.nextInt();
System.out.println("Ingresa un numero:");
v2=s.nextInt();
System.out.print("Los numeros ingresados fueron: "+v1+" "+v2);
        System.out.println("");
int sumat=v1+v2;
        System.out.println("La suma total es: "+sumat);


    }
}
