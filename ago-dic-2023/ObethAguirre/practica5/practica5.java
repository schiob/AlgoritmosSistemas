package practica5;

import java.util.Arrays;
import java.util.Scanner;
public class practica5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] dinosaurios = s.nextLine().split(" ");


        System.out.println(Arrays.toString(ordenar(dinosaurios)));
        }

        public static String[] ordenar(String[] dinosaurios){
            int micha = dinosaurios.length/2;

            //CASO BASE
            if (dinosaurios.length==1){
                return dinosaurios;
            }

            String[] aIzq= new String[micha];
            String[] aDer= new String[dinosaurios.length - micha];

            for (int i = 0; i < dinosaurios.length; i++) {
                if (i < micha) {
                    aIzq[i] = dinosaurios[i];
                } else {
                    aDer[i - micha] = dinosaurios[i];
                }
            }


            aIzq=ordenar(aIzq);
            aDer=ordenar(aDer);

            return juntar(aIzq,aDer);
        }

    public static String[] juntar(String[] aIzq, String[] aDer) {
        String[] ordenados = new String[aIzq.length + aDer.length];
        
        int i = 0, j = 0, k = 0;
        while (i < aIzq.length && j < aDer.length) {
            if (aIzq[i].length() < aDer[j].length()) {
                ordenados[k++] = aIzq[i++];
            } else {
                ordenados[k++] = aDer[j++];
            }
        }

        while (i < aIzq.length) {
            ordenados[k++] = aIzq[i++];
        }

        while (j < aDer.length) {
            ordenados[k++] = aDer[j++];
        }

        return ordenados;
    }




}

