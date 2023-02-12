package algoritmos;
import java.util.Scanner;
/**
 * Fecha: 12 de febrero de 2023
 * @author Luz Andrea
 */
public class Practica3 {
    
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        String arreglo[]=new String[10];
        
        System.out.println("--- Ingresa las palabras a almacenar en el arreglo ---");
        for (int i = 0; i <arreglo.length; i++) {
            arreglo[i]=s.nextLine();
        }
        
        for (int j = 0; j <arreglo.length; j++) {
            while(j>0&&arreglo[j-1].replace(" ","").length()>arreglo[j].replace(" ","").length()){
                String temp=arreglo[j];
                arreglo[j]=arreglo[j-1];
                arreglo[j-1]=temp;
                j=j-1;
                }
             }
        
            System.out.println("\n--- Palabras en el arreglo ordenadas de menor a mayor (según su numero de letras) ---");
            for (int i = 0; i <arreglo.length; i++) {
            System.out.println(arreglo[i]+"  ["+arreglo[i].replace(" ","").length()+"]");
        }
    }
    
}
