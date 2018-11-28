package javaapplication5;

import java.util.*;

public class Parcial2P1 {
    public static void main(String[]args){
        boolean b=false;
        Scanner s = new Scanner(System.in);
        String [] input = s.nextLine().split(" ");
        int a=Integer.parseInt(input[0]),i=0;
        String libro = input[1];
        String [] lista = s.nextLine().split(" ");
        while (!libro.equalsIgnoreCase(lista[i])) {
            i++;
            if (libro.equalsIgnoreCase(lista[i])) {
                b=true;
            }
        }
        if (b==false) {
            System.out.println("-1");
        }
        else System.out.println(i+1);
    }
}
