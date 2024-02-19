import java.util.Scanner;

public class Practica_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos problemas y cuantos minutos tiene:");
        String entrada = sc.nextLine();
        String[] numeros = entrada.split(" ");
        int problemas = Integer.parseInt(numeros[0]);
        int minutos = Integer.parseInt(numeros[1]);

        int [] arr = new int[problemas];    
        for (int j=0; j<arr.length;j++) {
            System.out.printf("Cuantos minutos tarda para el problema %d:" , j+1);
            arr[j]=sc.nextInt();
            int actual = arr[j];
            int i= j-1;
            while ( i>= 0 && arr[i] > actual ) {
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = actual;
            }
            System.out.println("estos son los minutos ordenados que tiene por problema: ");
            for (int elem: arr){
            System.out.print(elem + " ");        
        }
        
    }

}
