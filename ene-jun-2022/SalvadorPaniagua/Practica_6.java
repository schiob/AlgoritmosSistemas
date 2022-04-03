
package algoritmos.pkg2022;

import java.util.Scanner;

public class Practica_6 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
       //Organizando
        System.out.println("1-Ingrese el numero de concursantes:");

        int n = in.nextInt();
        String nombre [] = new String[n];
        String nombreOrd;
                System.out.print("\n");

                  System.out.println("2-Ingrese Concursantes: (Ingresar datos asi EJ: Salvador 8 7 1) ");

        //ORO, PLATA Y BRONCE 
        int o,p,b;
        int oro [] = new int[n];
        int plata [] = new int[n];
        int bronce [] = new int[n];
        for (int i = 0; i < n; i++) {
            nombre[i]=in.next();
            oro[i] = in.nextInt();
            plata[i] = in.nextInt();
            bronce[i] = in.nextInt();
        }
        for(int c=0; c < (n-1); c++){

        for(int i=0; i< (n-1); i++){
            if(oro[i] < oro[i+1]){
                nombreOrd = nombre[i];
                o = oro[i];
                p = plata[i];
                b = bronce[i];
                nombre[i] = nombre[i+1];
                nombre[i+1] = nombreOrd;
                oro[i] = oro[i+1];
                oro[i+1] = o;
                plata[i] = plata[i+1];
                plata[i+1] = p;
                bronce[i] = bronce[i+1];
                bronce[i+1] = b;

            }

            else if (oro[i] == oro[i+1]) {
                if(plata[i] < plata[i+1]){
                    nombreOrd = nombre[i];
                    o = oro[i];
                    p = plata[i];
                    b = bronce[i];
                    nombre[i] = nombre[i+1];
                    nombre[i+1] = nombreOrd;
                    oro[i] = oro[i+1];
                    oro[i+1] = o;
                    plata[i] = plata[i+1];
                    plata[i+1] = p;
                    bronce[i] = bronce[i+1];
                    bronce[i+1] = b;

                }

                else if (plata[i] == plata[i+1]) {
                    if(bronce[i] < bronce[i+1]){
                        nombreOrd = nombre[i];
                        o = oro[i];
                        p = plata[i];
                        b = bronce[i];
                        nombre[i] = nombre[i+1];
                        nombre[i+1] = nombreOrd;
                        oro[i] = oro[i+1];
                        oro[i+1] = o;
                        plata[i] = plata[i+1];
                        plata[i+1] = p;
                        bronce[i] = bronce[i+1];
                        bronce[i+1] = b;

                    }
                    else if (bronce[i] == bronce[i+1]) {
                        if((int)nombre[i].charAt(0) > (int)nombre[i+1].charAt(0)){
                        nombreOrd = nombre[i];
                        nombre[i] = nombre[i+1];
                        nombre[i+1] = nombreOrd;
                        }
                    }
                }
            }

        }
        }
        System.out.println();    
        for (int j = 0; j < n; j++) {
            System.out.println(nombre[j]);
        }

    }

    }

