package algoritmos;
import java.util.Scanner;
/**
 * Fecha: 6 de febrero de 2023
 * @author Luz Andrea
 */
public class Practica2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[20];
        System.out.println("----- Ingresa 20 valores para llenar el arreglo -----");
        for (int i = 0; i <arr.length; i++) {
            arr[i]=s.nextInt();
        }
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = 0; j <arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
        System.out.println("\n----- Valores (pares) en el arreglo ordenados de forma descendente -----");
            for (int j=arr.length-1; j>=0; j--) {
                if((arr[j]%2)==0){
                    System.out.print(" ["+arr[j]+"]");
                }
            }
    }    
}