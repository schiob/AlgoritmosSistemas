/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos.pkg2022;
import java.util.Scanner;


public class Parcial1_primero {
static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

int n = s.nextInt();


        String arr[] = new String [n]; 
        System.out.print("¿Cuantos datos entraran ");      

        for (int f = 0; f < arr.length; f++) {
            arr[f] = s.next();
        }

        for (int f = 0; f < arr.length-1; f++) {
            for (int j = f+1; j < arr.length; j++) {
                if (arr[f].length()<arr[j].length()) {
                    String temp = arr[f];
                    arr[f] = arr[j];
                    arr[j] = temp;
                }
            }
       }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}