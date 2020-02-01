
package algoritmos;

import java.util.Scanner;
public class Practica2 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int pares [] = new int[20];
        for (int i = 0; i < 20; i++) {
            pares[i] = entrada.nextInt();
        }
        for (int i = 0; i < 20; i++) {
            int pos=i;
            int aux=pares[i];
            while((pos>0)&&(pares[pos-1]>aux)){
                pares[pos]=pares[pos-1];
                pos--;
            }
            pares[pos]=aux;
        }
        System.out.println();
        for (int i = 20-1; i >=0 ; i--) {
            if (pares[i] %2 ==0) {
                System.out.print(pares[i]+" ");
            }
            
        }
        System.out.println();
    }
}
