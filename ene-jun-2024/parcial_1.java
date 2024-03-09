import java.util.Scanner;
import java.util.*;
public class parcial_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos relojes tiene Bartolo");
        String entrada = sc.nextLine();
        String[] numeros = entrada.split(" ");
        int relojes = Integer.parseInt(numeros[0]);
       
        int [] arr = new int[relojes];    
        for (int j=0; j<arr.length;j++) {
            System.out.printf("En que horas se quedo el reloj escribala usando solo enteros y formato de 24 horas:");
            arr[j]=sc.nextInt();
            int actual = arr[j];
            int i= j-1;
            while ( i>= 0 && arr[i] > actual ) {
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = actual;
            }
            System.out.println("Estas son las horas ordenadas del reloj: ");
            for (int elem: arr){
            System.out.print(elem + " ");        
        }
    }
}
        
    