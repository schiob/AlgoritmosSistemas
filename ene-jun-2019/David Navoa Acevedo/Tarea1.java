/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas;

import java.util.Scanner;
public class Tarea1 {
    private static int suma(int x, int y){
        int resultado=0;
        resultado=x+y;
        return resultado;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Declara tu primer valor para la suma");
        int x=0,y=0;
        x=s.nextInt();
        System.out.println("Declara tu segundo valor para la suma");
        y=s.nextInt();
        
        System.out.println("El resultado es: "+suma(x,y));
    }
}
