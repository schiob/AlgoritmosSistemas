package algoritmos;
import java.util.Scanner;
public class Dinosaurios {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); 
         //Variables
         int num_dino=0;
         String name_dino="";
         //Tamaño del arreglo
         System.out.println("¿Cuantos Dinosaurios son?");
         num_dino=sc.nextInt();
         String[] dinosaurio=new String[num_dino+1];
         //Nombre de los dinos
         System.out.println("¿Nombre de los Dinosaurios");
         for (int i = 0; i < dinosaurio.length; i++) {
           name_dino=sc.nextLine(); 
           dinosaurio[i]=name_dino;
         }
         //Mostrar lo dinos como entrada
         for (int i = 0; i < dinosaurio.length; i++) {
             System.out.print(dinosaurio[i]+"\t"); 
         }
        
        //implementar algoritmo
        for (int i = 0; i < dinosaurio.length; i++) {
            int idxMin=1;
            int j=i;
            while(j< dinosaurio.length){
                if(dinosaurio[j].length()>dinosaurio[idxMin].length()){
                    idxMin=j;
                }
                j++;
            }
            String temp=dinosaurio[i];
            dinosaurio[i]=dinosaurio[idxMin];
            dinosaurio[idxMin]=temp;
        }
        //Mostrar dinos como salida
        System.out.println("\n");
        for (int i = 0; i < dinosaurio.length; i++) {
            System.out.print(dinosaurio[i]+"\t");
        }
    }
    
}
