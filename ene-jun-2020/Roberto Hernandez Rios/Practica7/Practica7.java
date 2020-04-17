
package algoritmos;
import java.util.Scanner;
public class Practica7 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }
        ShellSort(A);
        for (int i = 0; i < n; i++) {
            System.out.print(A[i]+" ");
        }
    }
    public static void ShellSort(int a[]){
        int salto,aux,i;
        boolean cambios;
        for (salto = a.length/2;salto  != 0;salto /= 2) {
            cambios = true;
            while(cambios){
                cambios = false;
                for (i = salto; i < a.length; i++) {
                    if (a[i-salto] > a[i]) {
                        aux = a[i];
                        a[i] = a[i-salto];
                        a[i-salto] = aux;
                        cambios =true;
                    }
                }
            }
        }
    }
}
