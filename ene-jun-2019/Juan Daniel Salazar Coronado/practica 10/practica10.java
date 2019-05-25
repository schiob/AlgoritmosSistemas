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
public class practica10 
{
    public static void main(String[] args) 
    {
        
        Scanner s = new Scanner (System.in);
        
        String dadoscarasrespuesta = s.nextLine();
        
        String [] apoyo = dadoscarasrespuesta.split(" ");
        
        int [] apoyo2 = new int[apoyo.length];
        
        for (int i = 0; i < apoyo2.length; i++) 
        {
            apoyo2[i] = Integer.parseInt(apoyo[i]);
        }
        
        int[][] matriz = new int[apoyo2[0] + 1][apoyo2[2] + 1];
        
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz[i].length; j++) 
            {
                matriz[i][j] = -1;
            }
        }
        
        System.out.println("Hay " + solucionconmemoizacion(apoyo2[0], apoyo2[1], apoyo2[2], matriz) + " formas");
        
        //System.out.println("Hay " + solucionsinmemoizacion(apoyo2[0], apoyo2[1], apoyo2[2]) + " formas");
        
    }
    
    public static int solucionconmemoizacion(int x, int y, int z, int[][] matriz)
    {
        int formas = 0;
        
        if(x == 1 && z <= y)
        {
            return 1;
        }
        else if(x == 1 && z > y)
        {
            return 0;
        }
        
        if ((matriz[x][z]) > -1) 
        {
            formas += matriz[x][z];
        }
        else
        {
            for (int i = 1; i <= y && (z - i) >= (x-1); i++)
            {
                formas += solucionconmemoizacion(x-1, y, z-i, matriz);
            }
            
            matriz[x][z] = formas;
        }
        
        return formas;
        
    }
    
    public static int solucionsinmemoizacion(int x, int y, int z)
    {
        int formas = 0;
        
        if(x == 1 && z <= y)
        {
            return 1;
        }
        else if(x == 1 && z > y)
        {
            return 0;
        }
        
        for (int i = 1; i <= y && (z - i) >= (x-1); i++)
        {
            formas += solucionsinmemoizacion(x-1, y, z-i);
        }
        
        return formas;
        
    }
    
    
}
