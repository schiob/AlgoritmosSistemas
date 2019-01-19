/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.util.*;
/**
 *
 * @author Acer
 */
public class ListaDinos {
    public static void main(String[]main){
        int j=0,c=0;
        Scanner s=new Scanner(System.in);
        Dinos[] d=new Dinos[1000];
        String lista;
        System.out.println("Escibe los nombres de los dinosaurios separadolos con un Espacio");
        lista=s.nextLine();
        for (int i = 0; i <=lista.length(); i++) {
            j=i;
            String t="";
            while (j!=lista.length()&&lista.charAt(j)!=' ') {
                t+=lista.charAt(j);
                j++;
            }
            d[c]=new Dinos(t);
            t="";
            c++;
            i=j;
        }
        j=1;
        c=0;
        while (d[j]!=null) {
            j++;
        }
        int min=0;
        for (int i = 0; i < j; i++) {
            for (int k = 1; k < j; k++) {
                if (d[k-1].getTamañoNombre()>d[k].getTamañoNombre()) {
                    String t=d[k-1].getNombre();
                    d[k-1].setNombre(d[k].getNombre());
                    d[k].setNombre(t);
                }
            }
        }
        j=0;
        while (d[j]!=null) {
            System.out.print(d[j].getNombre()+" ");
            j++;
        }
    }
}
