import java.util.Scanner;

/*
Entrada
5
1432 230 1980 1689  400

Salida
1980 1689 1432 400 230
 */

public class Practica3 {

    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int numpokemons, nivelpoder;
        System.out.println("Por favor digita primero el numero de pokemons");
        numpokemons=s.nextInt();
         int[] Pokemons = new int[numpokemons];
         
         for (int i = 0; i < numpokemons; i++) {
             System.out.println("Digita el nivel de poder del pokemon numero "+ i);
             Pokemons[i]=s.nextInt();
                            
                    int x = i;
            for (int j = i; j >= 0; j--) {
                
                if(Pokemons[j]<Pokemons[x]){
                    int temporal = Pokemons[x];
                    Pokemons[x]=Pokemons[j];
                    Pokemons[j]=temporal;
                    x=j;
                }   
             
        }
             
    }
    System.out.println("El nivel de poder de los pokemons ordenado de mayor a menor es: ");
       for (int j = 0; j < numpokemons; j++) {
         
                 System.out.println(Pokemons[j]);
             }
    }
}
            
   
        
        
        
        
        
    