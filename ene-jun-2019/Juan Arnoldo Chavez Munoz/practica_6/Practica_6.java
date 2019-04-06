/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosorden;

import java.util.Scanner;


/**
 *
 * @author Arnold
 */
public class Practica_6 {
    public static void main(String[] args) {
       
  String [][][][] numeros=new String [3][5][10][5];
  boolean encontrado=false;
Scanner s = new Scanner (System.in);

System.out.println("Ingresa los numeros de estampillas" );
String num="";
    // arr.split(" ");  adentro de las comillas va lo que va a separar el split
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++){
                num= s.nextLine();//metemos todos los numeros de golpe
                String [] estam = num.split(" "); // separamos por espacios en otro arreglo
                
                for (int k = 0; k < 10; k++){ //asignamos los valores al array principal
                    numeros [i][j][k] = estam[k].split(",");//ahora separamos por comas los valores
               }
            }
            num = s.nextLine();//pasamos de linea
}
        
    System.out.println("Ingresa un numero de estampilla para buscarla");
       String dato= s.next();
        while(encontrado==false){
            for (int i = 0; i <numeros.length; i++) {//recorrer todo el array Multidimensional 
            for (int j = 0; j <numeros[i].length; j++) {
                for (int k = 0; k <numeros[i][j].length; k++) {
                    for (int l = 0; l <numeros[i][j][k].length; l++) {
                       // String valorarr=numeros[i][j][k][l];
                        if (dato.compareTo(numeros[i][j][k][l])==0) {//=0 es que son iguales
                        System.out.println("La estampilla está en:");
                            System.out.println((i+1)+" "+(j+1)+" "+(k+1)+" "+(l+1));
                    encontrado=true;
                               }       
                            }
                         }
                      }
                  }
            if (encontrado==false) {
               System.out.println("-1");
               break;
                 }
           }//cierre while
      }
}
