
package parcialUno;

import java.util.Scanner;

public class practicaTres {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresar la cantidad de pokemon capturados");
        String numeroDePokemonString  = sc.nextLine();//La entrada del numero de pokemon como String
        int numeroDePokemon = Integer.valueOf(numeroDePokemonString);//Numero de pokemon convertido a int
        
        int puntosDeCombate[] = new int [numeroDePokemon];//Se crea el arreglo puntos de combate, tiene como limite el numero de pokemon
        
        System.out.println("\nIngrese los puntos de combate de cada uno de los " + numeroDePokemon+ " pokemon, separados por un espacio\nEjemplo: 89 30 21 420");
        String puntosDe = sc.nextLine();//La entrada de cada uno de los puntos de combate como String
        String[] puntosDeCombateString = puntosDe.split(" ");//La creacion de un arreglo donde separa los valores agregados por la entrada anterior, cada vez que hay un espacio se crea un indice
        
        for (int k = 0; k < numeroDePokemon; k++) {
        puntosDeCombate[k] = Integer.valueOf(puntosDeCombateString[k]);//En este ciclo establezo que el arreglo de puntosDeCombate de tipo int va a recoger los valores del arreglo puntosDeCombateString convirtiendolos de String a int        
        }     
        
        int sostenerDato; //Un int que cambia su valor constantemente para recordar el valor antiguo cuando se intercambia entre dos indices del arreglo
        boolean cambio=false;
        while (true) {
            cambio =false;
            for (int i = 1; i < puntosDeCombate.length; i++) {//BubbleSort
                if (puntosDeCombate[i]>puntosDeCombate[i-1]) {//Se compara el indice i de puntosDeCombate con el indice anterior, en caso de ser mayor se hacen cambios 
                    sostenerDato = puntosDeCombate[i];//El int de sostener dato recoge el valor del indice i que seleccionamos
                    puntosDeCombate[i] = puntosDeCombate[i-1];//El indice i pasa a tener el valor del indice anterior (i-1)
                    puntosDeCombate[i-1] = sostenerDato;//El indice i-1 pasa a tener el valor que tenia i, que estaba guardado en la variable sostenerDato.
                    cambio=true;
                }
            }
            if(cambio==false){
                break;
            }
            
            
        }
        System.out.println("El orden de nivel de los pokemon capturados de mayor a menor es el siguiente: ");
            for (int i : puntosDeCombate) {//Salida de los valores del arreglo ya ordenados de mayor a menor
            System.out.printf("nivel %d  ", i);
        }

    }
}
