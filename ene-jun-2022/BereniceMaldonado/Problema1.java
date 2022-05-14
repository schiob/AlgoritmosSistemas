import java.util.Arrays;
import java.util.Scanner;

public class Problema1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingresa el numero de sucursales ");
		int n = teclado.nextInt();
		int k = 500000;
		
                int valoresArr[] = new int[n];
                rellena (valoresArr);
		
                String nombresArr[] =new String[n];
                nombres(nombresArr);
                
                
		countingSort(valoresArr,k);
                
                System.out.println("\nNombres ");
                System.out.println(Arrays.toString(nombresArr));
		System.out.println("\nValores ordenados");
		System.out.println(Arrays.toString(valoresArr));                
	}
        
        private static String[] nombres(String nombre[]){
            String nombres[] = new String[8];
                String aux;
                Scanner son = new Scanner(System.in);
                System.out.println("Ingresa los nombres de las sucursales ");
                for(int i=0; i<nombres.length; i++){               
                    aux=son.next();
                    nombres[i]=aux;                    
                }
            return nombres;
        }
        //NO PUDE ACOMODAR LOS NOMBRES :(
        //PERO AL MENOS LOS IMPRIME ;)
	
        private static int[] rellena(int relleno[]){
            Scanner ss = new Scanner(System.in);
            System.out.println("Introduce las ventas de cada sucursal");
            for(int i=0; i<relleno.length;i++){
                relleno[i] = ss.nextInt();
            }
            return null;
        }
	
	private static void countingSort(int[] valores, int k) {
		
		int[] contadores = new int[k + 1];

                for (int valor: valores)
			contadores[valor]++;

                int indice = 0;
		for (int i = 0; i < contadores.length; i++) {
			while (0 < contadores[i]) {
				valores[indice] = i;
				indice++;
				contadores[i]--;
			}
		}	
	}
}