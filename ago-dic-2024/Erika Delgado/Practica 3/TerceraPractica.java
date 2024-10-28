import java.util.*;
public class TerceraPractica {

	public static void main(String[] args) {

		//ordenando pokemones
		
		
		Scanner lee = new Scanner(System.in);

	
		int poderPokemon[] = {534,234,120,70,212} ;
		//pokemones iniciales
		System.out.println("Poder pokemon");
		for(int ele:poderPokemon) {
			System.out.print(ele+"  ");
		}

		System.out.println();
		for(int i=0; i<poderPokemon.length; i++) {
			int minimo = i;
			for(int p=i+1;p<poderPokemon.length;p++) {
				if(poderPokemon[minimo] < poderPokemon[p]) {
					minimo = p;
				}
			}
		
			int aux = poderPokemon[i];
			poderPokemon[i] = poderPokemon[minimo];
			poderPokemon[minimo] = aux;
		}
		
		//pokemones acomodados
		System.out.println("\nPoder pokemon acomodados");
		for(int ele:poderPokemon) {
			System.out.print(ele+"  ");
		}
		
	}

}
