package javaapplication5;

import java.util.*;

public class Parcial2P2 {
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        String [] input = s.nextLine().split(" ");
        String [] lista = s.nextLine().split(" ");
        int[] x = new int[lista.length];
        for (int i = 0; i < lista.length; i++) {
            x [i]=Integer.parseInt(lista[i]);
        }
        
        quickSort(x,0,x.length-1);
        System.out.println(busquedaBinaria(x,Integer.parseInt(input[1]),0,x.length-1));
        
        
    }
    public static void quickSort(int x[],int lb, int ub){
        int j;
        if (lb>=ub) {
            return;
        }
        j=partition(x,lb,ub);
        quickSort(x,lb,j-1);
        quickSort(x,j+1,ub);
    }
    public static int partition(int x[],int lb, int ub){
        int a, down, up, temp;
        a=x[lb];
        up=ub;
        down =lb;
        while (down<up) {
            while (x[down]<=a&&down<ub) {
                down++;
            }
            while (x[up]>a) {
                up--;
            }
            if (down<up) {
                temp=x[down];
                x[down]=x[up];
                x[up]=temp;
            }
        }
        x[lb]=x[up];
        x[up]=a;
        return up;
    }
    
    public static int busquedaBinaria(int a[],int n,int Low,int High){
        if (High < Low)
            return -1; //Caso base. No se encuentra el elemento
        else {
            int middle = (Low+High) / 2;
            if (n < a[middle])
                return busquedaBinaria(a, n, Low, middle-1);
            else if (n > a[middle])
                return  busquedaBinaria(a, n, middle + 1, High);
            else
                return middle+1;  //Case base. Posicion del elemento
        }
    }
}
