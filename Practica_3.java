package practicas_;

import java.util.Scanner;

public class Practica_3 {
 public static void ordenar (String nombres[]){
     for(int i=0;i<nombres.length-1;i++){
                for(int j=i+1;j<nombres.length;j++){
                if (nombres[i].length() > nombres[j].length()){
                    String aux=nombres[i];
                    nombres[i]=nombres[j];
                    nombres[j]=aux;
           }
       }
    }
 }
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
      
       System.out.print("Ingrese los nombres de los dinosaurios: ");
       String[] nombres = entrada.nextLine().split(" "); 
       ordenar(nombres);
       for(int i=0;i<nombres.length;i++){
            System.out.print(nombres[i] + " ");
        }
       
    }
       
 }

