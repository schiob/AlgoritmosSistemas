package practica2;
import java.util.Scanner;

public class Practica2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
       System.out.println("Digite el número de minutos disponibles: ");
        int m = sc.nextInt();
        
        System.out.println("Digite el número de problemas para realizar: ");
        int n = sc.nextInt();
        
        System.out.print("Tiempo por cada problema:");
        int c = sc.nextInt();

        int[] arreglo= new int[m];
        int i;
		for ( i=0; i<arreglo.length; i++) {
			temp = arreglo[i];
            int j = 0;
            for ( j = i-1; j > -1 && arreglo[j] > temp  ; j--) 
            {
                arreglo[j+1] = arreglo[j];
            }
            arreglo[j+1] = temp;
        }
		int contador=0, tempo=0,aux=0;
		for ( i = 0; i < arreglo.length; i++){ 
			aux=arreglo[i];
			tempo+=aux;
			if (tempo > m) {
				break;
			}
			else {
				contador+=1;
			}
	}
		System.out.println("Problemas "+n+" Tiempo "+m);
		System.out.println("Numero de Problemas que puedes realizar "+contador);

  }
}