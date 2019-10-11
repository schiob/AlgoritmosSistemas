package parcial1;

import java.util.Arrays;
import java.util.Scanner;

public class Parcial1 {

   
    static Scanner sc = new Scanner(System.in);
    static int[] numeros;
     
    public static void main(String[] args) {
         
        numeros = new int[leerEntero("Introduce Cuantas peliculas quieres:")];
        llenarArray();
        System.out.println("\n\nPeliculas:");
        visualizar();
        System.out.println("\n\nPeliculas Ordenadas:");
        Arrays.sort(numeros);
        visualizar();
    }
     
    private static void llenarArray(){
        for(int i=0;i<numeros.length;i++){
            numeros[i] = leerEntero("Ingresa la duracion de la pelicula numero " + (i+1)+ " en horas:" + ": ");
        }
    }
     
    private static void visualizar(){
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
     
    private static int leerEntero(String s){
        System.out.print(s);
        return sc.nextInt();    
    }
}