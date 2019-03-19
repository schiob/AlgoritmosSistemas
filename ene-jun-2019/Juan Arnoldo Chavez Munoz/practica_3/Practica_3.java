/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosorden;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Arnold
 */
public class Practica_3 {
    public static void main(String[] args) {
            
        String objord="";
        int valor=0;
        int temp=0;
 
        Scanner s= new Scanner(System.in);
        
        System.out.println("Ingrese el numero de objetos entre 1-50 ");
        valor=s.nextInt();
        String [] objetos= new String [valor];
        
        
        while(valor > 50 || valor <1) { //Aquí se usa para poner los parametros de medición.
            System.out.println("Carajo, que escribas un numero entre 1-50!!");
        valor=s.nextInt();    
        }
        
        int [] numobj= new int [valor];
        
         for (int i = 0; i < valor; i++){     //Se hace el ciclo dependiendo del num objetos ingresados.
        
         System.out.println("Ingrese el nombre del objeto: ");//Se ingresan los nombres al arreglo.
            objetos[i] = s.next();
            
            System.out.println("Ingrese el numero de objetos (0-100) de "+objetos[i]);//Se ingresan los numeros a otro arreglo.
            numobj[i] = s.nextInt();
            while (numobj[i]>100 ||numobj[i]<0) { //Aquí se usa para poner los parametros de medición.
                System.out.println("El numero debe estar entre 0-100!! ");
            numobj[i] = s.nextInt();
                                   }//cierre while
                         }//cierre for
         System.out.println("");
        
        for (int i = 1; i <numobj.length; i++) { 
            temp=numobj[i];
            objord=objetos[i];
            
           int j=0;
            for (j =i-1; j >-1 && numobj[j]<temp; j--) { //Comparo y voy acomodando
                
                numobj[j+1] = numobj[j];
                objetos[j+1]=objetos[j];
                            }//cierre for
            
            numobj[j+1]=temp;
            objetos[j+1]=objord;
            
        }//cierre for
        System.out.println(Arrays.toString(objetos));
        
        /* for (int i = 0; i < objetos.length; i++) { //Imprimo los objetos en Strings ya ordenados
            System.out.print(objetos[i]+", ");
        }    (Otra forma de imprimirlo sin importar la clase Arrays)
        */
       }
    }

