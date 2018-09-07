
package algoritmos;
import java.util.Scanner;
public class Dinos {

    public static void main(String[] args) {
      Scanner sc= new Scanner (System.in);
      String nombre ="";
      int numero=0;
        System.out.println("Numero de Dinos");
        numero=sc.nextInt();
        
        String [] NOMBRE= new String [numero+1];
        System.out.println("Nombre de Cada Dinosaurio:");
        
        for (int i = 0; i < NOMBRE.length; i++) {
            nombre=sc.nextLine();
            NOMBRE[i]=nombre;
                }
            for (int i = 0; i < NOMBRE.length; i++) {
                System.out.println(NOMBRE[i]);
              }
               //IMLEMENTO ALGORITMO BUBBLE SORT
                for (int i = 0; i <NOMBRE.length; i++) {
                   int j=1;
                   int temporal=NOMBRE[j-1].length(); 
                     while(j<NOMBRE.length-i){
                        if(NOMBRE[j-1].length() < NOMBRE[j].length()){
                         temporal=NOMBRE[j-1].length();  
                         NOMBRE[j-1]=NOMBRE[j];
                        } 
                           i++;
                    }
                }
    }
}

    
    

