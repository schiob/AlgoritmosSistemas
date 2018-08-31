package algoritmos;
import java.util.Scanner;
public class Pokemon {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int p=0,cp=0;
        System.out.println("¿Cuantos pokemon atrapo Carlitos?");
        p=sc.nextInt();
        if(p>50 || p<1){
            System.out.println("Valor no valido");
        }
        int [] pokemon=new int[p];
        System.out.println("¿Cual es el CP de tus pokemon?");
        for (int i = 0; i < pokemon.length; i++) {    
        cp=sc.nextInt();
        if(cp>2000 || cp<1){
            System.out.println("CP no valido");
        }
        pokemon[i]=cp;
    }
        System.out.println(pokemon.length);
        for (int i = 0; i < pokemon.length; i++) {
        System.out.print(pokemon[i]+"\t"); 
        }
        int q;
        int j;
    for (int i = 1; i < pokemon.length; i++) {
        q=pokemon[i];
        j=i-1;
        while( j>=0 && q>pokemon[j]){
            pokemon[j+1]=pokemon[j];
        j--;
        }
        pokemon[j+1]=q;
    }
    System.out.println("");
      for (int i = 0; i < pokemon.length; i++) {
          System.out.print(pokemon[i]+"\t");
    }
  
    }  
}
