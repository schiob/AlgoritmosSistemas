/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

import java.util.Scanner;

/**
 *
 * @author salaz
 */
public class Maincra 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        int n;
        boolean bandera = true;
        
        System.out.println("¿Cuantos objetos tiene en su inventario?");
        n = s.nextInt();
        while(bandera == true)
        {
            if(n >= 1 && n <= 50)
            {
                bandera = false;
            }
            else
            {
                System.out.println("Su inventario solo puede tener de 1 a 50 objetos, por favor introduzca el número de nuevo:");
                n = s.nextInt();
            }
        }
        
        System.out.println("");//solo se pasa un espacio por estetica
        
        String nombres[] = new String[n];
        int numdeobj[] = new int[n];
        int contador = 1;
        
        for (int i = 0; i < nombres.length && i < numdeobj.length; i++) 
        {
            System.out.println("Cual es el nombre del objeto #" + contador + ": ");
            nombres[i] = s.next();
            System.out.print("Cuanto tiene de " + nombres[i] +" : ");
            numdeobj[i] = s.nextInt();
            contador++;
            
            System.out.println("");//solo se pasa un espacio por estetica
        }
        
        //Ordenamiento-------------------------------------------------------------------------------------------------------------------------------------
        
        int temp;
        String temps = "";
        
        for (int i = 1; i < numdeobj.length; i++) //Ordenamiento
        {
            temp = numdeobj[i];
            temps = nombres[i];
            int j = 0;
            
            for ( j = i-1; j > -1 && numdeobj[j] < temp  ; j--) 
            {
                numdeobj[j+1] = numdeobj[j];
                nombres[j+1] = nombres[j];
            }
            
            numdeobj[j+1] = temp;
            nombres[j+1] = temps;
        }
        
        //---------------------------------------------------------------------------------------------------------------------------------------------------
        
        System.out.println("");//solo se pasa un espacio por estetica
        
        System.out.println("Estos son sus objetos de mayor a menor");
        
        for (int i = 0; i < nombres.length; i++) 
        {
            System.out.print(nombres[i] + ", ");
        }
        
    }
}
