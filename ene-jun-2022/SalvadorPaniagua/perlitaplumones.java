/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos.pkg2022;
import java.util.Scanner;
import java.util.Arrays;

public class perlitaplumones {


		  


    public static Plumon[] mergeSort(Plumon[] array){
        if(array.length == 1){
            return array;
        }

        int middle = array.length/2;
        Plumon left[] = Arrays.copyOfRange(array, 0, middle);
       Plumon right[] = Arrays.copyOfRange(array, middle, array.length);

        left = mergeSort(left);
        right = mergeSort(right);

        Plumon[]newLista = merge(left, right);
        return newLista;

    }

    public static Plumon[] merge(Plumon[] left, Plumon[] right){
       Plumon resultado[] = new Plumon[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i <left.length && j < right.length){
            if(left[i].getDilucion()<right[j].getDilucion()){
                resultado[k] = left[i];
                i++;
            }

            else if(left[i].getDilucion()== right[j].getDilucion()&& left[i].getDilucion()>right[j].getDilucion()){
                resultado[k] = left[i];
                i++;
            }

            else{
                resultado[k] = right[j];
                j++;
            }

            k++;
        }

        while(i < left.length){
            resultado[k] = left[i];
            k++;
            i++;
        }

        while(j < right.length){
            resultado[k] = right[j];
            k++;
            j++;
        }

        return resultado;
    }

  static Scanner entrada = new Scanner(System.in);
    static Scanner entrada1 = new Scanner(System.in);

    public static void main(String[] args) {
      Plumon[] array;
        System.out.println("Numero de plumones");
      int  n=entrada.nextInt();
        array= new Plumon[n];

        for (int i = 0; i <n ; i++) {
            System.out.println("Nombre del color:"+(i+1));           
            String nom = entrada1.next();           
             System.out.println("dilución:"+(i+1));
            int x = entrada.nextInt();


            array[i] = new Plumon(nom, x);
        } 
        System.out.println("");
        System.out.println("Las colores ordenados son:");
       array=mergeSort(array);

    for(Plumon elem : array){
            System.out.println(elem.getNombrePlumon()+ " ");

        }

    }
}







	
