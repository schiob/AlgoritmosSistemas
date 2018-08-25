package javaapplication5;
import java.util.*;

public class Pokimon {
    public static void main (String[]args){
        Scanner s= new Scanner(System.in);
        int n=0,b=0;
        while (n<1||n>50) {
            System.out.println("Numero de pokemon capturados (de uno a 50)");
            n=s.nextInt();
        }
        int a[]=new int[n];
        for (int i = 0; i < a.length; i++) {
            while (b<1||b>2000) {
                System.out.println("Nivel del pokemon (de uno a dos mil)");
                b=s.nextInt();
            }
            a[i]=b;
            b=0;
        }
        for (int i = 1; i < a.length; i++) {
            int q=a[i];
            int j=i-1;
            while (j!=-1&&q<a[j]) {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=q;
        }
        System.out.print("Nivel de los pokemon de mayor a menor \n| ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" | ");
        }
        System.out.println("");
    }
    
}
