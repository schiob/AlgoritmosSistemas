package algoritmos;
import java.util.Scanner;
/**
 * Fecha: 18 de febrero de 2022
 * @author Luz Andrea
 */
public class Practica4 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n;
        System.out.print("Ingresa el valor para n: ");
        n=s.nextInt();
        int array[]=new int[n];
        if (n>50){
            System.out.println("Número no válido. Fin del programa");
            System.exit(0);
        } 
        
        System.out.print("Ingresa valores del 1 al 2000: ");
        for (int i = 0; i <array.length; i++) {
            array[i]=s.nextInt();
        }
        
        int aux;
        boolean cambio= false;
        
        while(true){
            for (int i = 1; i < array.length; i++) {
                if(array[i]<array[i-1]){
                    aux=array[i];
                    array[i]=array[i-1];
                    array[i-1]=aux;
                    cambio=true;
                }
            }
            if(cambio==false)
                break;
        }
        for (int j=array.length-1; j>=0; j--) {
                    System.out.print(" ["+array[j]+"]");
            }
        
    }
    
}
