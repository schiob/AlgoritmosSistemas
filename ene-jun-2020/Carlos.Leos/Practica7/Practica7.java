package Clase;
public class Practica7 {
    public static void main(String[] args) {
        int[]arreglo={77,133,97,335,487,99,103};
        for (int i = 0; i <arreglo.length; i++) {
            arreglo[i]=(int)(Math.random()*10);
        }// cierre de for
       shell(arreglo);
        for (int i = 0; i <arreglo.length; i++) {
            System.out.println("");
             }//cierre de for
        }//cierre de void
    public static void shell(int[]arreglo){
        int salto=0,temp=0,i=0;
        boolean cambio;
        for (salto=arreglo.length/2;salto!=0;salto/=2) {
            cambio=true;
            while(cambio){
                cambio=false;
                for (i=salto;i<arreglo.length;i++) {
                    if (arreglo[i-salto]>arreglo[i]) {
                        temp=arreglo[i];
                        arreglo[i]=arreglo[i-salto];
                        arreglo[i-salto]=temp;
                        cambio=true;

                    }

                }
            }
        }
    }
}