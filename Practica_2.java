package practicas_;

import java.util.Scanner;

public class Practica_2 {
     public static void main(String[] args) {
      Scanner entrada = new Scanner (System.in);
         
         System.out.print("Ingrese los numeros: ");
       String[] numeros = entrada.nextLine().split(" ");
    int size = numeros.length;

      int [ ] arr = new int [size];

      for (int i = 0; i <size; i ++) {
         arr [i] = Integer.parseInt (numeros[i]);
      }
      
      for(int i = 0; i < arr.length; i++){
            for(int j=i+1; j < arr.length; j++){
		if(arr[i] < arr[j]){
                     int aux = arr[i];
                     arr[i] = arr[j];
		     arr[j] = aux;
	}
    }
}
      for(int i = 0; i < arr.length; i++)
    {
        if(arr[i]%2 ==0){
            System.out.print(arr[i]+ " ");
        }
    }
     
     }
}
      