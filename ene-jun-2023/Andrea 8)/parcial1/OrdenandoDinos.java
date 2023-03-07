package algoritmos.parcial1;
import java.util.Scanner;
/**
 * Fecha: 6 de marzo de 2023
 * @author Luz Andrea
 */
public class OrdenandoDinos {
    
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in); //Objeto de scanner para enteros
        Scanner r= new Scanner (System.in); //Objeto de scanner para cadenas
        int Ndinos;
        
        System.out.print("Ingresa la cantidad de nombres a ordenar: ");
        Ndinos=s.nextInt();
        
        String arr[]=new String[Ndinos];
        
        System.out.println("\nIngresa los nombres a ordenar (separados por un espacio)");
        for (int i = 0; i <arr.length; i++) {
            arr[i]=r.next();
        }
        
        for (int j = 0; j <arr.length; j++) {
            while(j>0&&arr[j-1].replace(" ","").length()>arr[j].replace(" ","").length()){
                String temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j=j-1;
                }
             }
        
        System.out.println("\nNombres ordenados del más largo al más corto");
        for (int j=arr.length-1; j>=0; j--) {
                    System.out.print(" ["+arr[j]+"]");
                }

    }
    
}
