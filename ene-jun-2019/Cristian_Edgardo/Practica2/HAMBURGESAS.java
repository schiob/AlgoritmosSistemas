package hamburgesas;

import java.util.Scanner;


public class Hamburgesas {

      public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int numH, calificacion=0;
        
        System.out.println("Ingrese el número de hamburguesas: ");
            numH=s.nextInt();
            if (numH < 1 || numH >50) {
                System.out.println("No puede ser mayor a 50");
                System.exit(0);
            }
         int calificaciones[] = new int[numH];
         
         for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Ingrese la calificación de cada hamburguesa");
                calificaciones[i]=s.nextInt();
                
            if (calificaciones[i] < 1 || calificaciones[i] > 100) {
                System.out.println("La calificación debe ser mayor a 0 y menor e igual a 100");
                System.exit(0);
            }
        }
      
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Hamburguesa " + (i+1));
            System.out.println(calificaciones[i]);
        }
        
        System.out.println();
        
        insertionSort(calificaciones);
        System.out.print("Estas son las calificaciones ordenadas:\n");
        for (int i :calificaciones) {
           
            System.out.print(i + " ");
        }  
    }
    
     public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] < key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }   
     }
 }  