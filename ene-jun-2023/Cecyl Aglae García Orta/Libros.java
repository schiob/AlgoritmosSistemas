package Parcial2;
import java.util.Scanner;

/*@author cecyl*/
public class Libros {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Pido datos 
        System.out.println("Dame el numero de libros:");
        int n = scanner.nextInt();//Numero de libros
        System.out.println("Dame el nombre del libro que buscas:");
        String nom = scanner.next();//Nombre del libro que se busca
        
        String[] Lib = new String[n];
        System.out.println("Dame los nombres de los libros:");
        for (int i = 0; i < n; i++) {
            Lib[i] = scanner.next();//Nombre de los libros que hay
        }
        //Busqueda
        int indice = -1; 
        for (int i = 0; i < n; i++) {
            if (Lib[i].equals(nom)) {
                indice = i+1;
                break;
            }
        }
        // Imprimimos
        System.out.println("El libro que buscas esta en la posición: "+indice);
    }
}   
