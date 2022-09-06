package parcialUno;
import java.util.*;

public class practicaUno {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte los 2 numeros a sumar");
        String numeros = sc.nextLine();
        String[] arreglo = numeros.split(" ");
        System.out.println(Integer.valueOf(arreglo[0]) + Integer.valueOf(arreglo[1]));
    }
  
}
