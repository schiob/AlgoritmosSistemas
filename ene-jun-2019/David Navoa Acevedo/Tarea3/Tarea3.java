/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas;

import java.util.Scanner;
public class Tarea3 {
    
    public static void seleccion(MaterialesT2[] material){
        int  aux = 0;
        MaterialesT2 temp;
        for (int i = 0; i < material.length; i++) {
            aux = i;
            temp=material[i];
            for (int j = i + 1; j < material.length; j++) {
                if (temp.cantidad < material[j].cantidad) {
                    aux = j;
                }
            }
            temp = material[aux];
            material[aux] = material[i];
           material[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Cuantos materiales ordenaras?");
        int cantidad = s.nextInt(),i = 0;
        String material, cMaterial;
        MaterialesT2[] mats = new MaterialesT2[cantidad];
        while(i < cantidad){
            System.out.println("Declare el material seguido de su cantidad");
            material = s.next();
            cMaterial = s.next();
            mats[i] = new MaterialesT2(material,Integer.parseInt(cMaterial));
            i++;
        }
        seleccion(mats);
        System.out.println();
        for(MaterialesT2 a:mats){
            System.out.println(a);
        }
    }
    
}
