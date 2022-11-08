import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class p8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántas personas son en total, con cuántas hubo contacto y cuántas son positivas?");
        String entrada = teclado.nextLine();
        String[] s = entrada.split(" ");
        int personas = Integer.parseInt(s[0]);
        int conexiones = Integer.parseInt(s[1]);
        int positivos = Integer.parseInt(s[2]);

        //Es la matriz de adyacencia
        int arr[][] = new int[personas][personas];

        //Llena la matriz de adyacencia
        for (int a = 0; a < conexiones; a++) {
            int n1 = teclado.nextInt();
            int n2 = teclado.nextInt();

            arr[n1][n2] = 1;
            arr[n2][n1] = 1;
        }
        //Imprime la matriz de adyacencia
        for (int b = 0; b < personas; b++) {
            for (int c = 0; c < personas; c++) {
                System.out.print(arr[b][c] + " ");
            }
            System.out.println();
        }
        int posibleInf[] = new int[personas];
        //Revisa quienes son positivos y los posibles infectados
        System.out.print("¿Quién es positivo a Covid?");        
        for(int d = 0; d < positivos; d++){
            int inf = teclado.nextInt();
            for(int e = 0; e < personas; e++){
                if(arr[inf][e]==1){
                    posibleInf[e] = 1;
                }
            }
        }
        for(int f = 0; f < personas; f++){
            if(posibleInf[f] == 1){
                System.out.print(f + " ");
            }
        }
    }
}
