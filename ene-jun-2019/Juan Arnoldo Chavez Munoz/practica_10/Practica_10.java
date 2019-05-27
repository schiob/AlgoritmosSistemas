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
/*          *****SOLUCIÓN UTILIZANDO PROGRAMACIÓN DINAMICA*****
Pd: para no batallar con los indices en los arrays, sumarle un 1 , para que quede más grande;
 no usar la casilla [0] y así poder usar las posiciones originales.
 */
public class Practica_10 {

    public static int SolucionConMemoizacion(int x, int y, int z, int[][] matriz) {
        int formas = 0;
        //Casos base
        if (x == 1 && z <= y) {//si hay 1 un dado y suma es menor o igual al num. caras
            return 1;
        } else if (x == 1 && z > y) {//si la suma es mayor al num. caras 
            return 0;
        }
        if ((matriz[x][z]) > -1)//si ya esta calculado...
        {
            formas += matriz[x][z];    //formas usa el valor que se encuentra 
                                      //ya guardado en el array
        } else //si no esta calculado 
        {
            for (int i = 1; i <= y && (z - i) >= (x - 1); i++) {
                formas += SolucionConMemoizacion(x - 1, y, z - i, matriz);//Lo calcula recursivamente 
                //y la soluc. se agrega en "formas"
            }

            matriz[x][z] = formas;//ahora se guarda en el array o tabla
            //ya que se calculó en formas
        }

        return formas;//regresa la suma total de dif. combinaciones

    }

    public static int SolucionSinMemoizacion(int x, int y, int z) {
        int formas = 0;
        //casos base
        if (x == 1 && z <= y) { //si la suma es menor al num. de caras
            return 1;
        } else if (x == 1 && z > y) {//si la suma es mayor que el num. de caras
            return 0;
        }

        for (int i = 1; i <= y && (z - i) >= (x - 1); i++) {
            formas += SolucionSinMemoizacion(x - 1, y, z - i);//se agrega a formas la 
        }                                                 //solucion recursiva

        return formas; //regresa la suma total de dif. combinaciones
    }

    public static void main(String[] args) {

        int num, m, suma;
        String datos;

        Scanner sc = new Scanner(System.in);
        System.out.println("Mete los numeros");
        datos = sc.nextLine();
        String[] reng = datos.split(" ");
        num = Integer.parseInt(reng[0]);
        m = Integer.parseInt(reng[1]);
        suma = Integer.parseInt(reng[2]);
        int[][] matrix = new int[num + 1][suma + 1];

        for (int i = 0; i < matrix.length; i++) {//inicializar la tabla en -1
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = -1;
            }
        }

        System.out.println(SolucionConMemoizacion(num, m, suma, matrix));
        System.out.println(SolucionSinMemoizacion(num, m, suma));
    }
}
