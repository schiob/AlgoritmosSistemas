
package algoritmos;
import java.util.Scanner;
public class Pokemon {

    public static void main(String[] args) {
      Scanner sc= new Scanner (System.in);
      int pokemon=0;
      int poder=0;
        System.out.println("Pokemones Capturados");
        pokemon=sc.nextInt();
        
        if (pokemon>50){
            System.out.println("Numero de Pokemon NO VALIDO");
        }
        int [] POKEMON = new int [pokemon];
        System.out.println("Poder de Cada Pokemon");
        
        for (int i = 0; i < POKEMON.length; i++) {
            poder=sc.nextInt();
            if(poder>2000){
                System.out.println("Poder No Existente");
            }
            POKEMON[i]=poder;
        }
       
        int actual=0, j=0;
      
        for (int i = 1; i < POKEMON.length; i++) {
            actual=POKEMON[i];
            j=i-1;
         while ((j >= 0) && (actual > POKEMON[j])){
             POKEMON[j + 1] = POKEMON[j];      
             j--;                   
              }
              
         POKEMON[j + 1] = actual; 
            
        }
        System.out.print("PODERES DE POKEMON ORDENADOS: ");
 printpokemon(POKEMON); 
}
    
    public static void printpokemon (int [] POKEMON){
        for (int i = 0; i <POKEMON.length; i++) {
            System.out.print(POKEMON[i] + "\t");
        }
    }
}
          
      
