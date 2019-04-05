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
public class BusquedaSencillitaNadaSencilla 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        String [][][][] repisas = new String [3][5][10][5];
        
        boolean bandera = true;

        System.out.println("Dame las repisas, libros y paginas");
        String valores;
        
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 5; j++)
            {
                valores = s.nextLine();
                String [] espacios = valores.split(" ");
                
                for (int k = 0; k < 10; k++)
                {
                    repisas [i][j][k] = espacios[k].split(",");
                }
            }
            valores = s.nextLine();
        }
        
        int temp1 = 1;
        int temp2 = 1;
        int temp3 = 1;
        int temp4 = 1;
        
        String numero = s.nextLine();
        
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                for (int k = 0; k < 10; k++)
                {
                    for (int l = 0; l < 5; l++)
                    {
                        if (numero.compareTo(repisas[i][j][k][l]) == 0)
                        {
                            bandera = false;
                            
                            temp1+=i;
                            temp2+=j;
                            temp3+=k;
                            temp4+=l;
                        }
                    }   
                }   
            }
        }
        
        if (bandera)
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println("Encontrado en la repisa: " + temp1 + ", el libro: " + temp2 + ", la pagina: " + temp3 + ", y la posición: " + temp4);
        }
        
    }
    
}
